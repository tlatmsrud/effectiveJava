package org.ssk.item19.usecase1;


public class MyAdd {

    /**
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b){
        return a + b;
    }


    public int addAll(int... values){
        int result = 0;

        for(int value : values){
            result = add(result, value);
        }
        return result;
    }
}
