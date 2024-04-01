package org.ssk.item50.usecase1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date start = new Date();
        Date end = new Date();

        Period p = new Period(start, end);

        // start 와 end 는 변경되....엔다
        start.setTime(10);
    }
}
