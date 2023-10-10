package item12;

import org.junit.jupiter.api.Test;
import org.ssk.item12.usecase2.Human;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * title        :
 * author       : sim
 * date         : 2023-09-14
 * description  :
 */
public class Test12 {

    @Test
    public void test(){

        Human human1 = new Human("홍길동", 34, 203, 110);
        Human human2 = new Human("홍길동", 34, 203, 80);

        assertThat(human1).isEqualTo(human2);

    }
}
