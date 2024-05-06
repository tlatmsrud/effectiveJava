package org.ssk.item57;

import org.ssk.item20.usecase1.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2024-05-07
 * description  :
 */
public class UseCase2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //...

        for(String e : list){
            //...
        }

        for(Iterator<String> i = list.iterator(); i.hasNext();){
            //...
        }
        for(Iterator<String> i = list.iterator(); i.hasNext();){
            //...
        }

        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            //...
        }

        Iterator<String> i2 = list.iterator();
        while(i.hasNext()){ // 버그유발
            //...
        }


    }
}
