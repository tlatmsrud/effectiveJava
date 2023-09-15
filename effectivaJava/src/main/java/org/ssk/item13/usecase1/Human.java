package org.ssk.item13.usecase1;

import org.ssk.item13.usecase2.Obj;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-15
 * description  :
 */
public class Human implements Cloneable{

    private String name;


    @Override
    public Human clone()  {
        try{
            return (Human) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
