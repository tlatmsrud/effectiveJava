package org.ssk.item31.homework;

import org.ssk.item20.usecase1.A;

import java.util.*;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-09
 * description  :
 */
public class SetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("2");
        set.add("4");
        set.add("5");
        set.add("1");

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Map<String, String> map = new HashMap<>();
        map.put("hi", "hi");

        ArrayList<Integer> a = new ArrayList<>();

        List<String> linkedList = new LinkedList<>();

        linkedList.add("hi");
    }
}
