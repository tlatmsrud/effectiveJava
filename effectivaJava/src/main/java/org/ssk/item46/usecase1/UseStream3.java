package org.ssk.item46.usecase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * title        :
 * author       : sim
 * date         : 2024-01-16
 * description  :
 */
public class UseStream3 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\sim\\effectiveJava\\effectivaJava\\src\\main\\java\\org\\ssk\\item46\\usecase1\\myFile.txt");

        Map<String, Long> freq = new HashMap<>();

        try(Stream<String> words = new Scanner(file).tokens()) {
            freq = words.collect(groupingBy(String::toString, counting()));

            List<String> list = freq.keySet().stream()
                    .sorted(comparing(freq::get).reversed())
                    .limit(10)
                    .collect(Collectors.toList());

            list.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
