package org.ssk.item72;

import java.awt.*;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 * title        :
 * author       : sim
 * date         : 2024-08-15
 * description  :
 */
public class NoRemoveList<E> extends ArrayList<E> {

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("remove는 지원하지 않습니다.");
    }
}
