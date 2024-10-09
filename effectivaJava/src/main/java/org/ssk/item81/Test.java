package org.ssk.item81;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * title        :
 * author       : sim
 * date         : 2024-10-03
 * description  :
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        HashMap<String, Integer> map = new HashMap<>();
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                map.put("key" + i, i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                map.put("key" + i, i * 2);
            }
        };

// 두 스레드를 생성하여 실행
        new Thread(task1).start();
        new Thread(task2).start();

        Thread.sleep(1000);
        System.out.println(map);
    }

    public static void main2(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>(100);
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                concurrentMap.put("key" + i, i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                concurrentMap.put("key" + i, i * 2);
            }
        };

// 두 스레드를 생성하여 실행
        new Thread(task1).start();
        new Thread(task2).start();

        Thread.sleep(1000);
        System.out.println(concurrentMap);
    }
}
