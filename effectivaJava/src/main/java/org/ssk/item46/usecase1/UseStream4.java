package org.ssk.item46.usecase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * title        :
 * author       : sim
 * date         : 2024-01-17
 * description  :
 */
public class UseStream4 {

    public static void main(String[] args) {

        List<String> values = List.of("one","two","three","four","one");// 키 중복
        Map<String, Integer> map = values.stream().collect(Collectors.toMap(s -> s, String::length, (oldVal, newVal) -> newVal));

        for(Map.Entry<String, Integer> entry : map.entrySet()){ // IllegalStateException 발생 !
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
