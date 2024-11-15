package effectivaJava.src.main.java.org.ssk.item88;

import java.io.*;
import java.util.Date;

public class MutablePeriod {

    public final Period period;
    public final Date start;
    public final Date end;

    public MutablePeriod() throws IOException {
        try(
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream out = new ObjectOutputStream(bos);
        ){
            // 불변식을 유지하는 Period 를 직렬화.
            out.writeObject(new Period(new Date(), new Date()));


            /*
             * 악의적인 start, end 로의 참조를 추가.
             */
            byte[] ref = { 0x71, 0, 0x7e, 0, 5 }; // 악의적인 참조
            bos.write(ref); // 시작 필드
            ref[4] = 4; // 악의적인 참조
            bos.write(ref); // 종료 필드

            // 역직렬화 과정에서 Period 객체의 Date 참조를 훔친다.
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            period = (Period) in.readObject();
            start = (Date) in.readObject();
            end = (Date) in.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        MutablePeriod mp = new MutablePeriod();
        Period mutablePeriod = mp.period; // 불변 객체로 생성한 Period
        Date pEnd = mp.end; // MutablePeriod 클래스의 end 필드

        pEnd.setYear(78); // MutablePeriod 의 end 를 바꿨는데 ?
        System.out.println(mutablePeriod.end()); // Period 의 값이 바뀐다.

        pEnd.setYear(69);
        System.out.println(mutablePeriod.end());
    }
}
