package org.ssk.item50.usecase2;


import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date start = new Date();
        Date end = new Date();

        Period p = new Period(start, end);

        // start는 변경되지 않는다!!
        start.setTime(10);

        // start 는 변경된다.
        p.start().setTime(10);
    }
}
