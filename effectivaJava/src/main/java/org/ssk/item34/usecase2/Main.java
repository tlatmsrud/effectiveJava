package org.ssk.item34.usecase2;



import org.ssk.item34.usecase1.Constant;

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
        System.out.println(PizzaSize.S.amountOfFlour()); // 420
        System.out.println(PizzaSize.M.amountOfFlour()); // 480
        System.out.println(PizzaSize.L.amountOfFlour()); // 540
        Pizza firstPizza = new Pizza(PizzaSize.S); // s 사이즈 피자

        //Pizza secondPizza = new Pizza(30); // 30 사이즈 피자 >> 컴파일 에러!!
        //Pizza thirdPizza = new Pizza(TortillaSize.S); // 또띠아 S 사이즈 피자 >> 컴파일 에러!!

        Class<Constant> constant = Constant.class;

        for(Field field : constant.getFields()){
            if(field.getName().startsWith("PIZZA")){
                System.out.println(field.getName());
            }
        }

        Arrays.stream(PizzaSize.values()).forEach(System.out::println);


    }
}
