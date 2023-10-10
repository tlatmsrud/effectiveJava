package org.ssk.item26.usecase3;

import java.util.ArrayList;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-10
 * description  :
 */
public class AllType {

    public static void main(String[] args) {
        Coin coin = new Coin();
        Money money = new Money();

        List<Object> list = new ArrayList<>();
        list.add(coin);
        list.add(money);

        Coin getCoin = (Coin) list.get(0);
        Money getMoney = (Money) list.get(1);
    }

    static class Coin{

    }

    static class Money{

    }
}
