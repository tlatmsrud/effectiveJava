package org.ssk.item5;

import java.util.Collections;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-06
 * description  :
 */
public class SpellChecker2 {
    private final KoreaDictionary dictionary = new KoreaDictionary();
    public static SpellChecker2 INSTANCE = new SpellChecker2(); // 싱글턴 패턴 사용
    private SpellChecker2(){
    }

    public static boolean isValid(String word){
        return true;
    }

    public static List<String> suggestions(String typo){
        return Collections.emptyList();
    }

}
