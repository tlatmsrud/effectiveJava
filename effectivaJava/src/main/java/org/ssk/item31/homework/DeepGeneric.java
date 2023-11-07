package org.ssk.item31.homework;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-02
 * description  :
 */
public class DeepGeneric {

    public static void main(String[] args) {

        System.out.println(firstMethod("hi").getClass().getName());

        System.out.println(badSecondMethod("hi", "hi").getClass().getName());
    }

    public static <T> T firstMethod(T parameter){
        return secondMethod(parameter);
    }

    public static <T> T secondMethod(T parameter){
        return parameter;
    }

    // T가 2개 >>
    public static <T> T[] badFirstMethod(T parameter1, T parameter2){
        return badSecondMethod(parameter1, parameter2);
    }

    public static <T> T[] badSecondMethod(T ... parameter){
        return parameter;
    }
}
