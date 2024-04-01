package org.ssk.item50.usecase1;

import java.util.Date;

public final class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end){
        if(start.compareTo(end) > 0){
            throw new IllegalArgumentException(start +" 가 "+ end +" 보다 늦다.");
        }

        this.start = start;
        this.end = end;
    }

    public Date start(){
        return start;
    }

    public Date end(){
        return end;
    }
}
