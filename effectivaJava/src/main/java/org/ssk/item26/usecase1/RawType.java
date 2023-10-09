package org.ssk.item26.usecase1;

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
        List list = new ArrayList();

        Coin coin = new Coin();
        Money money = new Money();
        list.add(coin);

        Money getCoin = (Money) list.get(0);
    }

    public static void main2(String[] args) {
        List<Money> list = new ArrayList();

        Money money = new Money();
        list.add(money);

        Money getCoin = (Money) list.get(0);
    }


    static class Coin{

    }

    static class Money{

    }
}
