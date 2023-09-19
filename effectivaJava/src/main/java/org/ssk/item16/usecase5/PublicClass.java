package org.ssk.item16.usecase5;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-19
 * description  :
 */
public class PublicClass {

    public void logic(){
        InnerClass.innerLogic();
    }

    //publicClass 클래스에서만 접근 가능한 클래스
    private static class InnerClass{

        static void innerLogic(){

        }
    }
}
