import com.example.assKT.bai2.Sinhvien;
import com.example.assKT.bai2.Sinhvienpoly;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSinhvienpoly {
    Sinhvienpoly sv = new Sinhvienpoly();
    @BeforeEach
    public void setUp(){
        sv.addSV(new Sinhvien("SV1", "Nguyen Van A", "SD18403", "Kiem thu", "PH0001"));
        sv.addSV(new Sinhvien("SV2", "Nguyen Van B", "SD18403", "Kiem thu", "PH0002"));
        sv.addSV(new Sinhvien("SV3", "Nguyen Van C", "SD18403", "Kiem thu", "PH0003"));
        sv.addSV(new Sinhvien("SV4", "Nguyen Van D", "SD18403", "Kiem thu", "PH0004"));
        sv.addSV(new Sinhvien("SV5", "Nguyen Van E", "SD18403", "Kiem thu", "PH0005"));
    }
//    Ky thuat bien
    @Test
    public void testAdd1(){
        int exp = 6;
        Sinhvien sv1 = new Sinhvien("6", "Nguyen Van F", "SD18403", "Kiem thu", "PH0006");
        int act = sv.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testAdd2(){
        int exp = 6;
        Sinhvien sv1 = new Sinhvien("SV6", "F", "SD18403", "Kiem thu", "PH0006");
        int act = sv.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testAdd3(){
        int exp = 6;
        Sinhvien sv1 = new Sinhvien("SV6", "Nguyen Van F", "S", "Kiem thu", "PH0006");
        int act = sv.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testAdd4(){
        int exp = 6;
        Sinhvien sv1 = new Sinhvien("SV6", "Nguyen Van F", "SD18403", "K", "PH0006");
        int act = sv.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testAdd5(){
        Sinhvien sv1 = new Sinhvien("", "Nguyen Van F", "SD18403", "Kiem thu", "PH0006");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sv.addSV(sv1);
        });
    }
    @Test
    public void testAdd6(){
        Sinhvien sv1 = new Sinhvien("SV6", "", "SD18403", "Kiem thu", "PH0006");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sv.addSV(sv1);
        });
    }
    @Test
    public void testAdd7(){
        Sinhvien sv1 = new Sinhvien("SV6", "Nguyen Van F", "", "Kiem thu", "PH0006");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sv.addSV(sv1);
        });
    }
    @Test
    public void testAdd8(){
        Sinhvien sv1 = new Sinhvien("SV6", "Nguyen Van F", "SD18403", "", "PH0006");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sv.addSV(sv1);
        });
    }
    @Test
    public void testAdd9(){
        Sinhvien sv1 = new Sinhvien("SV6", "Nguyen Van F", "SD18403", "Kiem thu", "");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sv.addSV(sv1);
        });
    }
    @Test
    public void testAdd10(){
        Sinhvien sv1 = new Sinhvien("SV6", "Nguyen Van F", "SD18403", "Kiem@thu", "PH0006");
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            sv.addSV(sv1);
        });
    }

//    Phan vung tuong duong
    @Test
    public void testSearch1(){
        int exp = 3;
        int act = sv.timKiemTheoMa("PH0001");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testSearch2(){
        int exp = 1;
        int act = sv.timKiemTheoMa("PH0005");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testSearch3(){
        Assertions.assertThrows(NullPointerException.class, ()->{
            sv.timKiemTheoMa("");
        });
    }
    @Test
    public void testSearch4(){
        int exp = 0;
        int act = sv.timKiemTheoMa("PH0001");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testSearch5(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            sv.timKiemTheoMa("PH12345123456789123456789");
        });
    }
}
