package org.ssk.item38.usecase1;

import java.util.Arrays;
import java.util.Collection;

/**
 * title        :
 * author       : sim
 * date         : 2023-12-05
 * description  :
 */
public class Main {

    public static void main(String[] args) {
        test(ExtendedOperation.class, 3, 3);
        test2(Arrays.asList(ExtendedOperation.values()), 3, 3);
        System.out.println(ExtendedOperation.EXP.apply(3.0,3.0));
    }

    public static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y){
        for(Operation op : opEnumType.getEnumConstants()){
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x,y));
        }
    }

    public static void test2(Collection<? extends Operation> opSet, double x, double y){
        for(Operation op : opSet){
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x,y));
        }
    }
}
