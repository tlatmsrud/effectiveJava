package org.ssk.item80;

/**
 * title        :
 * author       : sim
 * date         : 2024-09-05
 * description  :
 */
public class Go implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10 ; i++){
            System.out.println(Thread.currentThread() + " : " + i);
        }
    }
}