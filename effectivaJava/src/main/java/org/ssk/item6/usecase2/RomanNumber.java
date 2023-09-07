package org.ssk.item6.usecase2;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-07
 * description  :
 */
public class RomanNumber {

    static boolean isRomanNumber(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
}

class Main{
    public static void main(String[] args) {
        String s = "XI";
        Boolean result = RomanNumber.isRomanNumber(s);
        System.out.println(result);
    }
}
