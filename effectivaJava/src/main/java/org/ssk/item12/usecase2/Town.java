package org.ssk.item12.usecase2;

import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-14
 * description  :
 */
public class Town {
    private String name;
    private List<Human> residentList;

    private Town(String name, List<Human> residentList){
        this.name = name;
        this.residentList = residentList;
    }
    public static Town of(String name, List<Human> residentList){
        return new Town(name, residentList);
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", residentList Count =" + residentList.size() +
                '}';
    }
}
