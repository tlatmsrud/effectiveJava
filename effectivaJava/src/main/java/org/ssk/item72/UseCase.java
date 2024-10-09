
package org.ssk.item72;

import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2024-08-15
 * description  :
 */
public class UseCase {

    public static void main(String[] args) {
        List<String> list = new NoRemoveList<>();
        list.add("sim");

        list.remove("sim");
    }
}
