package org.ssk.item33.usecase1;

import java.util.HashMap;
import java.util.Map;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-07
 * description  :
 */
public class FavoritesMap {

    public static void main(String[] args) {
        Map<Class<?>, Object> favorites = new HashMap<>();

        favorites.put(String.class, "hi");
        favorites.put(Integer.class, 1);

        String favoriteString = (String)favorites.get(String.class);
        Integer favoriteInteger = (Integer)favorites.get(Integer.class);

        System.out.println(favoriteString);
        System.out.println(favoriteInteger);
    }
}
