package org.ssk.item61;

import java.util.Comparator;

/**
 * title        :
 * author       : sim
 * date         : 2024-06-05
 * description  :
 */
public class UseCase {

    static Integer i;

    public static void main(String[] args) {

/*
        Comparator<Integer> naturalOrder = (i, j) -> (i<j) ? -1 : (i == j ? 0 : 1);
        System.out.println(naturalOrder.compare(new Integer(1),new Integer(3)));
*/

        if (i == 42)
            System.out.println("믿을 수 없군!");

        Long sum = 0L;

        for(long i = 0; i <= Integer.MAX_VALUE; i++){
            sum += 1;
        }
    }
}
