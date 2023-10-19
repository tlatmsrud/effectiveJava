package org.ssk.item28.usecase5;

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
public class Chooser {
    private final Object[] choiceArray;

    public Chooser(Collection choices){
        choiceArray = choices.toArray();
    }

    public Object choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }

    public static void main(String[] args) {
        List<Integer> dice = List.of(1,2,3,4,5,6);

        Chooser chooser = new Chooser(dice);

        Integer choose = (Integer) chooser.choose();
        System.out.println(choose);

        String choose1 = (String) chooser.choose();
    }
}
