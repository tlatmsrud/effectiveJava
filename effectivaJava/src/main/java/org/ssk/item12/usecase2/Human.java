package org.ssk.item12.usecase2;

import java.util.Objects;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-14
 * description  :
 */
public class Human {

    private final String name;
    private final int age;
    private final long height;
    private final long weight;

    public Human(String name, int age, long height ,long weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && height == human.height && weight == human.weight && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
