package org.ssk.special.jvm.usecase1;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-23
 * description  :
 */
public class Outer {

    private int[] data;
    static String value = "> Outer 클래스의 static 필드입니다.";

    static final String VALUE = "> Outer 클래스의 static final 필드입니다.";

    Outer(){
        System.out.println("> Outer 생성자 초기화");
    }

    public Inner getInnerObject(){
        return new Inner();
    }

    Outer(int size){
        System.out.println("> Outer 생성자 초기화");
        this.data = new int[size];
    }

    static void callMethod(){
        System.out.println("> Outer 클래스의 static 메서드 호출");
    }

    public static class Inner{
    }
}
