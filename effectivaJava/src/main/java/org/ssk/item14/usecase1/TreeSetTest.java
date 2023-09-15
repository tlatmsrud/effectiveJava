package org.ssk.item14.usecase1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-15
 * description  :
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, args);
        System.out.println(s);
    }
}
