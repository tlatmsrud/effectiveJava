package org.ssk.item84;

/**
 * title        :
 * author       : sim
 * date         : 2024-10-09
 * description  :
 */
public class SlowCountDownLatch {

    private int count;

    public SlowCountDownLatch(int count){
        if(count < 0){
            throw new IllegalArgumentException(count + " < 0");
        }
        this.count = count;
    }

    public void await(){
        while(true){
            synchronized (this){
                if (count == 0)
                    return;
                else{
                    Thread.yield();
                }
            }
        }
    }

    public synchronized void countDown(){
        if (count != 0){
            count --;
        }
    }
}
