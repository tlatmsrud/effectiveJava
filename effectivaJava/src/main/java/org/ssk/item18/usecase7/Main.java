package org.ssk.item18.usecase7;

import java.io.File;
import java.io.FileWriter;
import java.util.Properties;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-21
 * description  :
 */
public class Main {

    public static void main(String[] args) {
        File path = new File("test");
        try (FileWriter file = new FileWriter(path)) {
            Properties p = new Properties();
            p.put(1, "id");
            p.setProperty("id", "id");
            p.setProperty("pw", "pw");
            p.store(file, "user");//Runtime Exception!
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("fail");
        }
    }
}
