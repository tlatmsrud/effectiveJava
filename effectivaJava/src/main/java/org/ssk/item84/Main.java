package org.ssk.item84;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * title        :
 * author       : sim
 * date         : 2024-10-09
 * description  :
 */
public class Main {

    public static void main2(String[] args) {

        SlowCountDownLatch ready = new SlowCountDownLatch(1000);
        SlowCountDownLatch start = new SlowCountDownLatch(1);
        SlowCountDownLatch end = new SlowCountDownLatch(1000);
        ExecutorService executorService = Executors.newFixedThreadPool(1000);

        for(int i =0; i< 1000; i++){
            executorService.submit(() -> {
                ready.countDown();

                start.await();
                System.out.println("끼요옥");

                end.countDown();
            });
        }
        ready.await();
        System.out.println("준비완료. 시작!");
        start.countDown();
        long StartNanos = System.nanoTime();
        end.await();
        System.out.println("걸린시간 : " + ( System.nanoTime() - StartNanos));
    }

    public static void main(String[] args)  {

        CountDownLatch ready = new CountDownLatch(1000);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(1000);
        ExecutorService executorService = Executors.newFixedThreadPool(1000);

        try{
            for(int i =0; i< 1000; i++){
                executorService.submit(() -> {
                    ready.countDown();

                    try {
                        start.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("끼요옥");

                    end.countDown();
                });
            }
            ready.await();
            System.out.println("준비완료. 시작!");
            start.countDown();
            long StartNanos = System.nanoTime();
            end.await();
            System.out.println("걸린시간 : " + ( System.nanoTime() - StartNanos));
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
