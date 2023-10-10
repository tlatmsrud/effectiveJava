package org.ssk.item26.usecase3;

import java.util.ArrayList;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-10
 * description  :
 */
public class AllType2 {

    public static void main(String[] args) {
        List<Money> list = new ArrayList<>();

        Coin coin = new Coin();

        //objectAdd(list, coin); 컴파일 에러

        //Coin getCoin = (Coin) list.get(0); 컴파일 에러
    }

    public static void objectAdd(List<Object> list, Object o){
        list.add(o);
    }
    static class Coin{

    }

    static class Money{

    }
}
