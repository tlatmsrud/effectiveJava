package org.ssk.item31.usecase1;

import java.util.*;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-19
 * description  :
 */
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Collection<? extends E> collection){
        for(E element : collection){
            elements[size++] = element;
        }
    }
    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop(){
        if(size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity(){
        if(elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();

        Integer intVal = 30;
        Double doubleVal = 30.3;

        List<Integer> listVal = List.of(1,2,3);
        stack.push(intVal);
        stack.push(listVal);

        Object[] a = new Object[1];
        List<Integer> list = new ArrayList<>();
        list.add(1);
        a[0] = list;
        List<Integer> getA = (List<Integer>) a[0];
        System.out.println(getA.get(0));

        Object obj = list;
    }
}
