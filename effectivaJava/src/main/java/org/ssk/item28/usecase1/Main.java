package org.ssk.item28.usecase1;

import java.util.ArrayList;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-18
 * description  :
 */
public class Main {

    public static void main(String[] args) {
        Super[] sup = new Sub[10];
        //List<Super> supList = new ArrayList<Sub>();

        Sub[] sub = (Sub[]) new Super[10];
    }
}
