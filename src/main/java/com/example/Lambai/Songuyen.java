package com.example.Lambai;

public class Songuyen {
    public boolean KiemTra(int a){
        if(a>100 || a<1){
            throw new IllegalArgumentException("So nguyen khong duoc be hon 1 va lon hon 100");
        }
        return true;
    }
}
