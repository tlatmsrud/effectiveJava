package org.ssk.special.jvm.usecase1;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-23
 * description  :
 */
public class StringCompare {
    public static void main(String[] args) {

        String a = "hi";
        String b = "hi";

        System.out.println(a == b);

        String c = new String("hi");
        String d = new String("hi");

        System.out.println(c == d);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
