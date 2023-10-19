package org.ssk.item28.usecase6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-18
 * description  :
 */
public class Chooser<T> {
    private final T[] choiceArray;

    // T 타입의 컬렉션 타입 인스턴스를 받아 Object[] 배열로 변환 후 다시 T 타입 배열로 형변환하기때문에 타입안전성을 보장한다.

    public Chooser(Collection<T> choices){
        choiceArray = (T[]) choices.toArray();
    }

    public T choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }

    public static void main(String[] args) {
        List<Integer> dice = List.of(1,2,3,4,5,6);
        List<Integer> dices = new ArrayList<>();
        dices.add(1);
        dices.add(2);
        dices.add(3);

        Chooser<Integer> chooser = new Chooser<>(dice);
        Integer value = chooser.choose();
        System.out.println(value);

        Object[] objects = new Object[1];
        Integer[] integers = new Integer[1];
        objects[0] = integers[0];

        Object a = "안녕하세요";
        Integer b = (Integer)a;
    }
}
