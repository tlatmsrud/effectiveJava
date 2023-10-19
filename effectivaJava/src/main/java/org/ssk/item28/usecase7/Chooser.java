package org.ssk.item28.usecase7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-18
 * description  :
 */
public class Chooser<T> {
    private final List<T> choiceList;

    public Chooser(Collection<T> choices){
        choiceList = new ArrayList<>(choices);
    }

    public T choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
