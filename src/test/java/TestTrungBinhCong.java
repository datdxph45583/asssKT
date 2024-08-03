import com.example.assKT.Bai1.TrungBinhCong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestTrungBinhCong {
    @Test
    public void testTbc1() {
        List<Integer> numbers = Arrays.asList();
        Assertions.assertThrows(ArithmeticException.class, ()->{
            TrungBinhCong.tbc(numbers);
        });
    }

    @Test
    public void testTbc2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTbc3() {
        List<Integer> numbers = Arrays.asList(1, 5);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTbc4() {
        List<Integer> numbers = Arrays.asList(1, 5,0,9);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTbc5() {
        List<Integer> numbers = Arrays.asList(1, 5,66);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTbc6() {
        List<Integer> numbers = Arrays.asList(1, 5,78);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTbc7() {
        List<Integer> numbers = Arrays.asList(1, 5,9);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTbc8() {
        List<Integer> numbers = Arrays.asList(1,50,5,7);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }@Test
    public void testTbc9() {
        List<Integer> numbers = Arrays.asList(1,5,7,6, 5);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }@Test
    public void testTbc10() {
        List<Integer> numbers = Arrays.asList(1,5,0,8,7);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }
}
