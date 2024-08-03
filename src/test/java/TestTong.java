import com.example.assKT.Bai1.Tong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTong {
    Tong to = new Tong();
    @Test
    public void testTo1() {
        int exp = 6;
        int act = to.tong("5", "1");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testTo2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            to.tong("-15000", "1000");
        });
    }

    @Test
    public void testTo3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            to.tong("15000", "-1000");
        });
    }

    @Test
    public void testTo4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            to.tong("-15000", "-11000");
        });
    }

    @Test
    public void testTo5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            to.tong("15000", "11000");
        });
    }

    @Test
    public void testTo6() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            to.tong(null, null);
        });
    }

    @Test
    public void testTo7() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            to.tong("", "");
        });
    }

    @Test
    public void testTo8() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            to.tong(" 5000", " 1000");
        });
    }

    @Test
    public void tesTo9() {
        int exp = 0;
        int act = to.tong("-10000", "-10000");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTo10() {
        int exp = 0;
        int act = to.tong("10000", "10000");
        Assertions.assertEquals(exp, act);
    }
}
