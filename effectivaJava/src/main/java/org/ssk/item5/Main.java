package org.ssk.item5;

import org.ssk.item5.suplier.SpellChecker;

import java.util.function.Supplier;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-06
 * description  :
 */
public class Main {

    public static void main(String[] args) {

        SpellChecker spellChecker = new SpellChecker(() -> new KoreaDictionary());
    }
}
