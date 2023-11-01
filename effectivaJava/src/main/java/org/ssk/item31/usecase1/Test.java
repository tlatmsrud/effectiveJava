package org.ssk.item31.usecase1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //List<Object> a = new ArrayList<String>(); // 불공변. 컴파일 에러
        Object b = "hi";

        //List<Animal> c = new ArrayList<Cat>(); // 불공변. 컴파일 에러
        Animal d = new Cat();

        Monster m = new Dog();
    }


}

