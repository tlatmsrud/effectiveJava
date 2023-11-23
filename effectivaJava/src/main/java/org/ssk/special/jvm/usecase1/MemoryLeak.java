package org.ssk.special.jvm.usecase1;

import org.ssk.item20.usecase1.A;

import java.util.ArrayList;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-23
 * description  :
 */
public class MemoryLeak {

    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();
        for(int i = 1; i<= 1000 ; i++){
            al.add(new Outer(100000000).getInnerObject());
            System.out.println(i);
        }
    }
}
