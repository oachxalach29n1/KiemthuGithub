package com.example.Lambai;

public class HocLuc {
    public String KiemTra(double diem){
        if (diem <0 || diem >10){
            throw new IllegalArgumentException("Diem phai lon hon 0 nho hon 10");

        }
        if (diem >=9){
            return "Xuat sac";
        }else if (diem >=7){
            return "Gioi";
        }else if (diem >=5){
            return "Trung binh";
        }else {
            return "Yeu";
        }
    }
}
