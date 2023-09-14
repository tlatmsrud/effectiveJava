package org.ssk.item12.usecase1;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-14
 * description  :
 */
public class ToStringTest {

    public static void main(String[] args) {
        Human human = new Human("테스터",19);
        System.out.println(human); // print 시 자동으로 toString 메서드가 호출됨.
    }
}

class Human{
    private final String name;
    private final int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
