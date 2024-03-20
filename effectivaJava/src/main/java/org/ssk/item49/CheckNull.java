package org.ssk.item49;

import java.util.Objects;

public class CheckNull {
    public static void main(String[] args) {
        Integer value = null;
        Objects.requireNonNull(value, "value 값이 null입니다.");

        Integer value2 = 3;

        value2 = Objects.requireNonNull(value2, "value 값이 null입니다.");
        System.out.println(value2);
    }
}
