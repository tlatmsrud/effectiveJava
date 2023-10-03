package org.ssk.item19.usecase2;

import org.ssk.item16.usecase7.SubClass;

import java.time.Instant;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-03
 * description  :
 */
public class Sub extends Super {

    private final Instant instant;

    Sub(){
        instant = Instant.now();
    }

    @Override
    public void overrideMe(){
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
