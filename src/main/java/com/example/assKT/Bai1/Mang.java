package com.example.assKT.Bai1;

public class Mang {
    public static int mang(int[] array, int index) {

        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Vi tri " + index + " khong co trong mang " + array.length);
        }
        return array[index];
    }
}
