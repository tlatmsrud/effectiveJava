package org.ssk.special.jvm.usecase1;

import java.util.Locale;
import java.util.logging.Logger;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-23
 * description  :
 */
public class ClassLoader {

    public static void main(String[] args) {

        try{
            String a = new String("hi");

            Locale locale = new Locale("kor");

            Outer outer = new Outer();
            System.out.println(a.getClass());
            System.out.println(locale.getClass().getClassLoader());
            System.out.println(outer.getClass().getClassLoader());
            locale.wait(2165461231232112L);
            Thread.currentThread();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
