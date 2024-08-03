package com.example.assKT.Bai1;

public class Hieu {
    public int hieu(String a, String b) {
        try {
            if (Integer.parseInt(a) < -10000 || Integer.parseInt(a) > 10000 || Integer.parseInt(b) < -10000 || Integer.parseInt(b) > 10000) {
                throw new IllegalArgumentException("So a, b nam trong khoang tu -10000 den 10000");
            }else {
                int hieu = 0;
                hieu = Integer.parseInt(a) - Integer.parseInt(b);
                return hieu;
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("a, b phai là so nguyen");
        }
    }
}
