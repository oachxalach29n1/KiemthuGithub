package com.example.Lambai;

public class Songuyen {
    public boolean Kiemtra(int a){
        if (a>100 || a<1){
            throw new IllegalArgumentException("So nguyen ko dc be hon 1 va lon hon 100");
        }
        return true;
    }
}
