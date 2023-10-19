package org.ssk.item28.usecase3;

import java.util.ArrayList;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-18
 * description  :
 */
public class Reify {

    public static void main(String[] args) {
        Object[] arr = new Long[10];
        arr[0] = "안녕하세요";

        List<Long> list = new ArrayList<>();
        //list.add("테스트"); // 컴파일 에러
        addObject(list, "테스트");

    }

    public static void addObject(List list, Object obj){
        list.add(obj);
    }
}
