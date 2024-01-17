package org.ssk.item46.usecase1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * title        :
 * author       : sim
 * date         : 2024-01-17
 * description  :
 */
public class UseStream5 {

    public static void main(String[] args) {

        List<String> values = List.of("one","two","three","four","five","six","seven");

        Map<Integer,List<String>> map = values.stream()
                .filter(s -> s.length() > 3)
                .collect(groupingBy(s -> s.length()));

        for(Map.Entry<Integer, List<String>> entry : map.entrySet()){
            System.out.println(entry.getKey());

            for(String str : entry.getValue()){
                System.out.println(str);
            }
        }
    }
}
