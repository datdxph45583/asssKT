import com.example.assKT.Bai1.Hieu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHieu {
    Hieu h = new Hieu();
    @Test
    public void testH1() {
        int exp = 4;
        int act = h.hieu("5", "1");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testH2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            h.hieu("-15000", "1000");
        });
    }

    @Test
    public void testH3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            h.hieu("15000", "-1000");
        });
    }

    @Test
    public void testH4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            h.hieu("-15000", "-11000");
        });
    }

    @Test
    public void testH5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            h.hieu("15000", "11000");
        });
    }

    @Test
    public void testH6() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            h.hieu(null, null);
        });
    }

    @Test
    public void testH7() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            h.hieu("", "");
        });
    }

    @Test
    public void testH8() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            h.hieu(" 5000", " 1000");
        });
    }

    @Test
    public void testH9() {
        int exp = 0;
        int act = h.hieu("-10000", "-10000");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testH10() {
        int exp = 0;
        int act = h.hieu("10000", "10000");
        Assertions.assertEquals(exp, act);
    }
}
