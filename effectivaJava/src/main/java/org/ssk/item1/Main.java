package org.ssk.item1;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-01
 * description  :
 */
public class Main {

    public static void main(String[] args) {
        Chemist chemist = new Chemist();
        Pill pill = chemist.makePill("진단서");

        Student student = Student.createFreshman("심승경");
        student.hi();
    }
}
