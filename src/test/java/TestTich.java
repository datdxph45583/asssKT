import com.example.assKT.Bai1.Tich;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTich {
    Tich t = new Tich();
    @Test
    public void testT1() {
        int exp = 10;
        int act = t.tich("5", "2");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testT2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("-15000", "2");
        });
    }

    @Test
    public void testT3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("15000", "-2000");
        });
    }

    @Test
    public void testT4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("-15000", "-12000");
        });
    }

    @Test
    public void testT5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("15000", "12000");
        });
    }

    @Test
    public void testT6() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich(null, null);
        });
    }

    @Test
    public void testT7() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("", "");
        });
    }

    @Test
    public void testT8() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich(" 5000", " 2000");
        });
    }
    @Test
    public void testT9() {
        int exp = 100000000;
        int act = t.tich("-10000", "-10000");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testT10() {
        int exp = 1000000;
        int act = t.tich("10000", "10000");
        Assertions.assertEquals(exp, act);
    }
}
