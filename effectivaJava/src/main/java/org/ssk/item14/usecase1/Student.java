package org.ssk.item14.usecase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-15
 * description  :
 */
public class Student implements Comparable<Student>{

    private int number;
    private String name;

    public Student(int number, String name){
        this.number = number;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return number == student.number && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public int compareTo(Student o) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.name, o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }


}

class Main{
    public static void main(String[] args) {
        Student student1 = new Student(10, "홍길동");
        Student student2 = new Student(21, "심심이");
        Student student3 = new Student(3, "뚝배기");


        Student[] arr = new Student[]{student1, student2, student3};

        Arrays.sort(arr);

        for(Student student : arr){
            System.out.println(student);
        }
    }
}
