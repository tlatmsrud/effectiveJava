package org.ssk.item72;

/**
 * title        :
 * author       : sim
 * date         : 2024-08-15
 * description  :
 */
public class Call {

    private static final String HI = "hello";

    public void sayHi(int cnt){

        if(cnt < 0){
            throw new IllegalArgumentException("cnt 값은 0보다 커야 합니다.");
        }

        for(int i =0; i<cnt; i++){
            System.out.println(HI);
        }
    }
}
