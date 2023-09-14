package org.ssk.item12.usecase3;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-14
 * description  :
 */
public class Phone {

    int areaCode;
    int prefix;
    int lineNum;

    @Override
    public String toString(){
        return String.format("%03d-%03d-%04d",
                areaCode, prefix, lineNum);
    }
}
