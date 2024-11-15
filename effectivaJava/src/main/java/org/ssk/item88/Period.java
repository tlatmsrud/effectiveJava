package effectivaJava.src.main.java.org.ssk.item88;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public final class Period implements Serializable {
    private Date start;
    private Date end;

    public Period(Date start, Date end) {
        this.start = new Date(start.getTime()); // 방어적 복사
        this.end = new Date(end.getTime());
        /*if (this.start.compareTo(this.end) > 0) { // 유효성 검사
            throw new IllegalArgumentException(start + " after " + end);
        }*/
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException{
        s.defaultReadObject();
        if (this.start.compareTo(this.end) > 0) { // 유효성 검사
            throw new InvalidObjectException(start + " after " + end);
        }
    }

}
