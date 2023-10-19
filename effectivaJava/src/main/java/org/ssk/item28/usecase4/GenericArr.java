package org.ssk.item28.usecase4;

import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-18
 * description  :
 */
public class GenericArr {

    public static void main(String[] args) {
        /*List<String>[] stringLists = new List<String>[1]; // 컴파일 에러가 발생한다.
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;
        String s = stringLists[0].get(0);*/

        String[] stringLists = new String[3];
        stringLists[0] = "hi";
        stringLists[1] = "hi2";

        Object[] objects = stringLists;
        objects[2] = "hi3";
    }
}
