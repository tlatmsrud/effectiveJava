package org.ssk.item5;

import java.util.Collections;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-06
 * description  :
 */
public class SpellChecker {

    // 의존 객체 생성
    private static final KoreaDictionary dictionary = new KoreaDictionary();

    private SpellChecker(){} // 객체 생성 방지

    public static boolean isValid(String word){
        return true;
    }

    public static List<String> suggestions(String typo){
        return Collections.emptyList();
    }
}
