package org.ssk.item31.usecase2;

import org.ssk.item20.usecase1.A;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {

    private final List<E> elementList = new ArrayList<>();
    private int size = 0;
    public void push(E element){
        elementList.add(element);
        size++;
    }

    public void pushAll(List<E> anotherList){
        elementList.addAll(anotherList);
        size += anotherList.size();
    }

    public List<E> flush(List<E> anotherList){
        while(!isEmpty()){
            anotherList.add(pop());
        }
        return anotherList;
    }

    private E pop(){
        E element = elementList.get(--size);
        elementList.remove(size);
        return element;
    }

    private boolean isEmpty(){
        return elementList.isEmpty();
    }

    public void print(){
        elementList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.push(1);

        List<Number> anotherCards = new ArrayList<>();
        anotherCards.add(2);
        anotherCards.add(3);
        stack.pushAll(anotherCards);
        stack.print();

        List<Number> flushList = new ArrayList<>();
        stack.flush(flushList);

        for(Number number : flushList){
            System.out.println(number);
        }

    }
}