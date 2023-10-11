package org.ssk.item27.usecase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-11
 * description  :
 */
public class ToArray {

    public static void main(String[] args) {
        List<Money> list = new ArrayList<>();
        list.add(new Money(1));
        list.add(new Money(2));

        Money[] arr = new Money[4];
        arr[0] = new Money(10);
        arr[1] = new Money(11);
        arr[2] = new Money(12);
        arr[3] = new Money(13);

        // list에 있는 값을 arr 배열에 처음부터 끝까지 넣는다.
        // arr의 사이즈가 list에 있는 작을 경우 들어가지 못하므로 새로운 arr를 리턴하고, 그게 아닐 경우 기존 arr에 쓴다.
        list.toArray(arr);


        System.out.println(list);
    }
}

class Money{
    private int value;

    public Money(int value){
        this.value = value;
    }
}

class NewArrayList{

    int size;
    transient Object[] elementData;

    public <T> T[] toArray(T[] a) {
        if (a.length < size) {

            // 생성한 배열과 매개변수로 받은 배열의 타입이 모두 T[]로 같으므로 올바른 형변환이다.
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elementData, size, a.getClass());
            return result;
        }
        System.arraycopy(elementData, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
}
