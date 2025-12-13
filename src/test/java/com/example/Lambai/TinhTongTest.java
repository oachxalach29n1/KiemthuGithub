package com.example.Lambai;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    private TinhTong kiemTra;
    @BeforeEach
    void setup() {kiemTra = new TinhTong();}
    @Test
    void Test_Tinh_Tong_Voi_Bien_Min(){
        int thucTe =kiemTra.KiemTra(1,1);
        int mongMuon = 2;
        assertEquals(mongMuon,thucTe);
    }
    @Test
    void Test_Tinh_Tong_Voi_Bien_Max(){
        int thucTe = kiemTra.KiemTra(100, 100);
        int mongMuon = 200;
        assertEquals(mongMuon,thucTe);
    }
    @Test
    void Test_Tinh_Tong_Voi_Bien_Min_Cong_1(){
        int thucTe =kiemTra.KiemTra(2,2);
        int mongMuon = 4;
        assertEquals(mongMuon,thucTe);
    }
    @Test
    void Test_Tinh_Tong_Voi_Bien_Max_Tru_1(){
        int thucTe =kiemTra.KiemTra(99,99);
        int mongMuon = 198;
        assertEquals(mongMuon,thucTe);
    }
    @Test
    void Test_Tinh_Tong_Voi_Tuong_Duong(){
        int thucTe =kiemTra.KiemTra(50,50);
        int mongMuon = 100;
        assertEquals(mongMuon,thucTe);
    }
}
