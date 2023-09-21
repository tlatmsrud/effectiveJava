package org.ssk.item18.usecase3;

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

    public InstrumentedHashSet(int initCap, float loadFactor){
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e){
        validationCheck(e);
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

    private void validationCheck(E e){

        if(Integer.class.isInstance(e)){
            Integer a = (Integer)e;

            if(a.intValue() < 0){
                throw new IllegalArgumentException("Integer 타입은 0 이상 값만 추가할 수 있습니다.");
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        InstrumentedHashSet<Integer> s = new InstrumentedHashSet<>();
        s.addAll(List.of(Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(-1))); // 예외발생

        System.out.println(s.getAddCount());
    }
}
