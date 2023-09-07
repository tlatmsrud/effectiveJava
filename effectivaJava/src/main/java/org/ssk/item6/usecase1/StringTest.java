package org.ssk.item6.usecase1;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-06
 * description  :
 */
public class StringTest {

    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";

        System.out.println(a == b); // true

        String c = new String("abc");
        String d = new String("abc");

        System.out.println(c == d); // false
    }
}
