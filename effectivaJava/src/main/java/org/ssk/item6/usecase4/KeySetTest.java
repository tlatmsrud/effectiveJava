package org.ssk.item6.usecase4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-07
 * description  :
 */
public class KeySetTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("도끼", 3);
        map.put("활",1);

        Set<String> set1 = map.keySet();
        Set<String> set2 = map.keySet();

        set1.remove("도끼");

        System.out.println(set1.size());
        System.out.println(set2.size());
    }
}
