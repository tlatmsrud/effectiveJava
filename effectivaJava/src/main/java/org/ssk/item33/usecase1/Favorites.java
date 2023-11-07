package org.ssk.item33.usecase1;

import java.util.*;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-07
 * description  :
 */
public class Favorites {

    private final Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance){
        favorites.put(Objects.requireNonNull(type), instance);
    }

    public <T> T getFavorite(Class<T> type){
        return (T)favorites.get(type);
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();

        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 123);
        f.putFavorite(Class.class, Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %d %s", favoriteString, favoriteInteger, favoriteClass.getName());

        List<String> stringList = new ArrayList<>();
        stringList.add("hi");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);

        f.putFavorite(List.class, stringList);
        f.putFavorite(List.class, integerList);

        List<Integer> findList = f.getFavorite(List.class);
        System.out.println(findList.get(0));
    }
}
