package com.example.assKT.bai2;

import java.util.ArrayList;
import java.util.List;

public class Sinhvienpoly {
    List<Sinhvien> list = new ArrayList<>();

    public List<Sinhvien> getList() {
        return list;
    }

    public int addSV(Sinhvien sinhvien) {
        if (sinhvien.getId().isEmpty() || sinhvien.getHoten().isEmpty() || sinhvien.getMalop().isEmpty() ||
                sinhvien.getTenlop().isEmpty() || sinhvien.getMasv().isEmpty()) {
            throw new NullPointerException("Khong duoc de trong");
        } else if (sinhvien.getTenlop().matches(".*[^a-zA-Z0-9_\\s+].*")) {
            throw new IllegalArgumentException("Ten lop khong chua ki tu dac biet");
        }  else {
            list.add(sinhvien);
            return list.size();
        }
    }

    public int timKiemTheoMa(String masv) {
        if (masv.isEmpty()) {
            throw new NullPointerException("Ma sv khong duoc de trong");
        } else {
            int count = 0;
            for (Sinhvien sinhvien : list) {
                if (sinhvien.getMasv().toLowerCase().contains(masv.toLowerCase())) {
                    count++;
                }
            }
            return count;
        }
    }
}
