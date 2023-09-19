package org.ssk.item16.usecase1.pack1;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-19
 * description  :
 */
public class Main {
    AClass aClass = new AClass(); // 같은 패키지에서 접근 가능한 public AClass
    BClass bClass = new BClass(); // 같은 패키지에서 접근 가능한 pacakge-private BClass
}
