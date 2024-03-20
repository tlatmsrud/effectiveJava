package org.ssk.item46.usecase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * title        :
 * author       : sim
 * date         : 2024-01-16
 * description  :
 */
public class UseStream {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\sim\\effectiveJava\\effectivaJava\\src\\main\\java\\org\\ssk\\item46\\usecase1\\myFile.txt");

        Map<String, Long> freq = new HashMap<>();

        try(Stream<String> words = new Scanner(file).tokens()) {
            words.forEach(word ->
                    freq.merge(word.toLowerCase(), 1L, Long::sum));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
