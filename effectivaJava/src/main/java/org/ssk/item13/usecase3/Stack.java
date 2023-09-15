package org.ssk.item13.usecase3;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-15
 * description  :
 */
public class Stack implements Cloneable{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2* size + 1);
        }
    }

    @Override
    protected Stack clone() {
        try{
            Stack stack = (Stack)super.clone();
            stack.elements = elements.clone();
            return stack;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}

class Main{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);

        Stack cloneStack = stack.clone();
        cloneStack.push(3);

    }
}

