package org.ssk.item31.homework;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-02
 * description  :
 */
public class DeepGeneric {

    public static void main(String[] args) {

        String[] a = soBadFirstMethod("hi");

    }

    public static <T> T firstMethod(T parameter){
        return secondMethod(parameter);
    }

    public static <T> T secondMethod(T parameter){
        return parameter;
    }

    // T가 2개 >>
    public static <T> T[] badFirstMethod(T parameter1, T parameter2){
        Object obj = "test";

        System.out.println(parameter1.getClass().getName());
        System.out.println(parameter2.getClass().getName());
        return badSecondMethod(parameter1, parameter2);
    }


    public static <T> T[] badSecondMethod(T ... parameter){
        return parameter;
    }

    public static <T> T[] soBadFirstMethod(T parameter1){
        return soBadSecondMethod(parameter1, parameter1);
    }
    public static <T> T[] soBadSecondMethod(T ... parameter){
        return parameter;
    }

}
