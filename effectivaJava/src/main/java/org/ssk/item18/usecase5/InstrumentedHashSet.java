package org.ssk.item18.usecase5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-20
 * description  :
 */
public class InstrumentedHashSet<E> {

    private Set<E> set;
    private int addCount = 0;

    public InstrumentedHashSet(Set<E> set){
        this.set = set;
    }

    public boolean add(E e){
        addCount++;
        set.add(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        set.addAll(c);
        return true;
    }

    public int getAddCount(){
        return addCount;
    }
}

class Main{
    public static void main(String[] args) {
        Set set = new HashSet<String>();
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>(set);
        s.addAll(Set.of("가","나","다"));
        System.out.println(s.getAddCount());
    }
}
