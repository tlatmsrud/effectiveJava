package org.ssk.item6.usecase5;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-07
 * description  :
 */
public class LongSum {

    public static void main(String[] args) {
        long sum = 0L;

        long start = System.currentTimeMillis();
        for(long i = 0; i <= Integer.MAX_VALUE; i++){
            sum += i;
        }

        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start);
    }
}
