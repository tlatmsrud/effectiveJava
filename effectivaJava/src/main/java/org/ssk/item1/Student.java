package org.ssk.item1;

import java.time.LocalDate;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-01
 * description  :
 */
public class Student {

    private String name;
    private int admissionYear;

    private Student(String name, int admissionYear) {
        this.name = name;
        this.admissionYear = admissionYear;
    }

    public static Student createFreshman(String name) {
        LocalDate now = LocalDate.now();
        return new Student(name, now.getYear());
    }

    public static Student createOfAdmissionYear(String name, int year) {
        return new Student(name, year);
    }

    public void hi(){
        System.out.println("hi");
    }
}

