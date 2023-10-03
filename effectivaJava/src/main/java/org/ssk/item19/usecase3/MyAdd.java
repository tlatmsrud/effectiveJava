package org.ssk.item19.usecase3;


public class MyAdd {

    private MyAdd(){

    }

    public static MyAdd newInstance(){
        return new MyAdd();
    }
    /**
     * 두 인자를 더합니다.
     * @param a 첫번째 인자
     * @param b 두번째 인자
     * @return 두 인자의 합
     */
    public int add(int a, int b){
        return a + b;
    }


    /**
     * 모든 가변인자를 더합니다.
     * @param values int 형 가변인자
     * @return 모든 가변인자의 합
     * @implSpec 각 가변인자를 더할 때 add 메서드를 사용합니다. 만약 add 메서드를 재정의한다면 이 메서드도 영향을 받게 됩니다.
     */
    public int addAll(int... values){
        int result = 0;

        for(int value : values){
            result = add(result, value);
        }
        return result;
    }
}
