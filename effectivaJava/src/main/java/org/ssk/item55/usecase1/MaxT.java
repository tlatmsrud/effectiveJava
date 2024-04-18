package effectivaJava.src.main.java.org.ssk.item55.usecase1;

import sun.java2d.loops.ProcessPath;

import java.util.*;
import java.util.stream.Collectors;

public class MaxT {

    public static <E extends Comparable<E>> E max(Collection<E> c){
        if(c.isEmpty())
            throw new IllegalArgumentException("빈 컬렉션"); // 클래스 내부에서 예외를 던지고 있다.

        E result = null;
        for(E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return result;
    }

    public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c){
        if(c.isEmpty())
            return Optional.empty(); // 빈 옵셔널을 반환함으로써 클래스 외부에서 예외를 발생시킬 수도, 시키지 않을 수도 있다. Null도 아니다!

        E result = null;
        for(E e: c)
            if(result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return Optional.of(result); // result 를 참조하는 Optional 타입을 반환한다.
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(10);


        List<String> wordList = new ArrayList<>();
        wordList.add("a");
        wordList.add("b");
        wordList.add("c");

        int maxValue = max2(list).orElse(0);  // 기본 값 설정

        // 원하는 예외 설정
        String maxString = max2(wordList).orElseThrow(() -> new RuntimeException("단어 리스트가 비어있습니다. 리스트를 확인해주세요"));

        int value = max2(list).get(); // 항상 값이 있다고 가정하고 get!

        String res = max2(list).map(val -> Integer.toString(val)).orElse("N/A");

        max2(list).stream().
    }

}
