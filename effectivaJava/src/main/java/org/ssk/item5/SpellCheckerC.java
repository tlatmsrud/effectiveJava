package org.ssk.item5;

import java.util.Collections;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-06
 * description  :
 */
public class SpellCheckerC {

    private final Dictionary dictionary;

    public SpellCheckerC(Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public static boolean isValid(String word){
        return true;
    }

    public static List<String> suggestions(String typo){
        return Collections.emptyList();
    }
}
