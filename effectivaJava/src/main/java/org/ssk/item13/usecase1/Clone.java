package org.ssk.item13.usecase1;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-15
 * description  :
 */
public class Clone {

    public static void main(String[] args){
        Human human = new Human("테스터");
        Human cloneHuman = human.clone();
    }

}

