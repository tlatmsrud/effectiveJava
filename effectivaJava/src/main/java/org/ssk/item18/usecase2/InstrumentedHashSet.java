package org.ssk.item18.usecase2;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

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

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for(E e : c){
            add(e);
        }
        return true;
    }

    public int getAddCount(){
        return addCount;
    }
}

class Main{
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("가","나","다"));

        System.out.println(s.getAddCount());
    }
}
