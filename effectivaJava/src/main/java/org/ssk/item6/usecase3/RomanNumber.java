package org.ssk.item6.usecase3;

import java.util.regex.Pattern;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-07
 * description  :
 */
public class RomanNumber {

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumber(String s){
        return ROMAN.matcher(s).matches();
    }
}
