package org.ssk.item26.usecase2;

import java.util.ArrayList;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-10
 * description  :
 */
public class RawType {

    public static void main(String[] args) {
        List<Money> list = new ArrayList();

        Coin coin = new Coin();
        unsafeAdd(list, coin);

        Money getCoin = list.get(0);
    }

    public static void unsafeAdd(List list, Object o){
        list.add(o);
    }

    static class Coin{

    }

    static class Money{

    }
}
