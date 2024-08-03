package com.example.assKT.Bai1;

import java.util.List;

public class TrungBinhCong {
    public static double tbc(List<Integer> i) {
        if (i == null || i.isEmpty()) {
            throw new ArithmeticException("Danh sach khong duoc rong");
        }

        int sum = 0;
        for (int number : i) {
            sum += number;
        }

        return sum / (double) i.size();
    }
}
