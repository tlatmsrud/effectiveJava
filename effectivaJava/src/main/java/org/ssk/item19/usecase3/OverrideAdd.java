package org.ssk.item19.usecase3;


/**
 * title        :
 * author       : sim
 * date         : 2023-10-02
 * description  :
 */
public class OverrideAdd /*extends MyAdd */{

    /*@Override*/
    public int add(int a, int b) {
        System.out.println("묻고 떠블로 가");
        return (a+b)*2;
    }
}

class Main{

    public static void main(String[] args) {

        MyAdd myAdd = MyAdd.newInstance();

        int result = myAdd.add(2,2);
        System.out.println(result);

        int result2 = myAdd.addAll(2,2,3,3);
        System.out.println(result2);
    }
}
