package org.ssk.item80;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * title        :
 * author       : sim
 * date         : 2024-09-05
 * description  :
 */
public class TestThread {

    public static void main(String[] args) {

        Go runnable = new Go();
        ExecutorService exec = Executors.newSingleThreadExecutor();

        exec.execute(runnable);
        exec.execute(runnable);

        exec.shutdown();
    }


}


