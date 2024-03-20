package org.ssk.item46.usecase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * title        :
 * author       : sim
 * date         : 2024-01-16
 * description  :
 */
public class UseStream2 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\sim\\effectiveJava\\effectivaJava\\src\\main\\java\\org\\ssk\\item46\\usecase1\\myFile.txt");

        Map<String, Long> freq = new HashMap<>();

        try(Stream<String> words = new Scanner(file).tokens()) {
            freq = words.collect(groupingBy(String::toLowerCase, counting()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
