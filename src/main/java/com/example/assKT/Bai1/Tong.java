package com.example.assKT.Bai1;

public class Tong {
    public int tong(String a, String b) {
        try {
            if (Integer.parseInt(a) < -10000 || Integer.parseInt(a) > 10000 || Integer.parseInt(b) < -10000 || Integer.parseInt(b) > 10000) {
                throw new IllegalArgumentException("So a, b nam trong khoang tu -10000 den 10000");
            }else {
                int sum = 0;
                sum = Integer.parseInt(a) + Integer.parseInt(b);
                return sum;
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("a, b phai là so nguyen");
        }
    }

}
