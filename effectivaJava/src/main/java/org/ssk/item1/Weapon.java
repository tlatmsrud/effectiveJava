package org.ssk.item1;

import jdk.jshell.Snippet;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-01
 * description  :
 */
public interface Weapon {
    static Weapon createFromJob(Job job){
        if(job == Job.SNIPER){
            return new Gun();
        }else{
            return new Sword();
        }
    }
}
