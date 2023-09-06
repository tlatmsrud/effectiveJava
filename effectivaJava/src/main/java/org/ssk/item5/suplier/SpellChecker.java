package org.ssk.item5.suplier;

import org.ssk.item5.Dictionary;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-06
 * description  :
 */
public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Supplier <? extends Dictionary> factory){
        this.dictionary = factory.get();
    }

    public static boolean isValid(String word){
        return true;
    }

    public static List<String> suggestions(String typo){
        return Collections.emptyList();
    }
}
