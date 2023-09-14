package org.ssk.item12.usecase2;

import java.util.Arrays;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-14
 * description  :
 */
public class Main {
    public static void main(String[] args) {
        List<Human> list = Arrays.asList(
                new Human("테스터1", 34, 203, 110)
                ,new Human("테스터2", 34, 203, 80)
                ,new Human("테스터3", 34, 203, 80)
                ,new Human("테스터4", 34, 203, 80)
                ,new Human("테스터5", 34, 203, 80)
                ,new Human("테스터6", 34, 203, 80)
                ,new Human("테스터7", 34, 203, 80)
                ,new Human("테스터8", 34, 203, 80)
                ,new Human("테스터9", 34, 203, 80)
                ,new Human("테스터10", 34, 203, 80)
                ,new Human("테스터11", 34, 203, 80)
                ,new Human("테스터12", 34, 203, 80)
        );

        Town town = Town.of("테스터타운", list);
        System.out.println(town);
    }
}
