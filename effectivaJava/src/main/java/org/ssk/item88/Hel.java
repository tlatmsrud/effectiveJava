package effectivaJava.src.main.java.org.ssk.item88;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hel {

    public static void main(String[] args) throws IOException, ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = df.parse("2024-11-14");
        Date endDate = df.parse("2024-11-15");
        try(
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos)){

            oos.writeObject(new Period(startDate, endDate));

            byte[] serialized = baos.toByteArray();

            Period period = deserializePeriod(serialized);
            System.out.println(period.start());
            System.out.println(period.end());

        }
    }

    public static Period deserializePeriod(byte[] bytes) throws IOException {

        try(
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais)){

                Object object = ois.readObject();
                return (Period) object;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
