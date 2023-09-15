package org.ssk.item13.usecase4;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-15
 * description  :
 */
public class Stack{
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

    // 복사 생성자
    public Stack(Stack stack){
        this.elements = stack.elements.clone();
        this.size = stack.size;
    }

    // 복사 팩터리 메서드
    public static Stack newInstance(Stack stack){
        return new Stack(stack);
    }
}

class Main{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);

        Stack cloneStack1 = new Stack(stack);
        cloneStack1.push(3);

        Stack cloneStack2 = Stack.newInstance(cloneStack1);
        cloneStack2.push(4);

    }
}

