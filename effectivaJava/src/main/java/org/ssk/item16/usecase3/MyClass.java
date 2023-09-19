package org.ssk.item16.usecase3;

import java.util.*;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-19
 * description  :
 */
public class MyClass {
    private static final Thing[] PRIVATE_VALUES = {new Thing(), new Thing()};

    public static final List<Thing> VALUES = List.of(PRIVATE_VALUES); // 불변 객체의 List로 변환 후 반환

    public static Thing[] values(){
        return PRIVATE_VALUES.clone(); // clone을 통해 방어적 복사
    }
}
