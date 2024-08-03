import com.example.assKT.Bai1.Mang;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMang {
    @Test
    public void testM1() {
        int[] array = {1, 2, -3};
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            Mang.mang(array, -1);
        });
    }
    @Test
    public void testM2() {
        int[] array = {1, 2, -3};
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            Mang.mang(array, 3);
        });
    }

    @Test
    public void testM3() {
        int[] array = {1, 2, -3};
        Assertions.assertEquals(1, Mang.mang(array,0));
    }
    @Test
    public void testM4() {
        int[] array = {1, 2, -3};
        Assertions.assertEquals(2, Mang.mang(array,1));
    }
    @Test
    public void testM5() {
        int[] array = {1, 2, -3};
        Assertions.assertEquals(-3, Mang.mang(array,2));
    }
    @Test
    public void testM6() {
        int[] array = {1, 2, -3};
        Assertions.assertEquals(0, Mang.mang(array,1));
    }
    @Test
    public void testM7() {
        int[] array = {1, 2, -3};
        Assertions.assertEquals(0, Mang.mang(array,0));
    }
    @Test
    public void testM8() {
        int[] array = {1, 2, -3};
        Assertions.assertEquals(0, Mang.mang(array,2));
    }
    @Test
    public void testM9() {
        int[] array = {1, 2, -3};
        Assertions.assertEquals(8, Mang.mang(array,2));
    }
    @Test
    public void testM10() {
        int[] array = {1, 2, -3};
        Assertions.assertEquals(10, Mang.mang(array,2));
    }

}
