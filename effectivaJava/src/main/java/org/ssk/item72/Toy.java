package org.ssk.item72;

/**
 * title        :
 * author       : sim
 * date         : 2024-08-15
 * description  :
 */
public class Toy {

    private String weapon;

    public Toy(String weapon){
        if(weapon == null){
            throw new NullPointerException("weapon 을 null 로 설정할 수 없습니다.");
        }
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println(weapon +" 공격!");
    }
}
