package com.example.Lambai;

public class TinhTong {
        public int KiemTra(int a, int b){
            if(a<1 || a>100 || b<1 || b>100){
                throw new IllegalArgumentException("Nhap dung 100");
            }
            return a+b;
        }
}
