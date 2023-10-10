package org.ssk.item20.usecase1;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-05
 * description  :
 */
public interface Interface {
    public void hi();
    default void bye(){
        System.out.println("hi");
    }
}
