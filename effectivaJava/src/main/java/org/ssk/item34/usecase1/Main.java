package org.ssk.item34.usecase1;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-08
 * description  :
 */
public class Main {

    public static void main(String[] args) {
        Pizza firstPizza = new Pizza(Constant.PIZZA_S_DIAMETER); // s 사이즈 피자
        Pizza secondPizza = new Pizza(30); // 30 사이즈 피자 >> 버그 유발
        Pizza thirdPizza = new Pizza(Constant.TORTILLA_S_SIZE); // 또띠아 S 사이즈 피자 >> 버그 유발

        Class<Constant> constant = Constant.class;

        for(Field field : constant.getFields()){
            if(field.getName().startsWith("PIZZA")){
                System.out.println(field.getName());
            }
        }
    }
}
