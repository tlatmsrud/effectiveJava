package org.ssk.item16.usecase4;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-19
 * description  :
 */
public class Client {

    public static void main(String[] args) {

        APIClass apiClass = new APIClass();
        String result = apiClass.sayHi();
        System.out.println(result);
    }
}
