package org.ssk.item18.usecase6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-20
 * description  :
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet(){

    }

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }
    public int getAddCount(){
        return addCount;
    }
}

class Main{
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(Set.of("가","나","다"));

        System.out.println(s.getAddCount());
    }
}
