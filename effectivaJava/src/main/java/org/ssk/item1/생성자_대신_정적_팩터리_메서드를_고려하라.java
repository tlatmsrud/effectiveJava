package org.ssk.item1;

import java.util.Collections;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-01
 * description  :
 */
public class 생성자_대신_정적_팩터리_메서드를_고려하라 {

    public static void main(String[] args) {
        List<String> list = Collections.emptyList();
        list.add("test");

        List<String> list2 = Collections.emptyList();

        System.out.println(list == list2);
    }
}
