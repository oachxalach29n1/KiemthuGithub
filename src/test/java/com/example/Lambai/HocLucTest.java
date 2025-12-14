package com.example.Lambai;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocLucTest {
    private HocLuc hocLuc;
    @BeforeEach
    void setup(){hocLuc = new HocLuc();}
    @Test
    public void TestXepLoaiYeu(){
        String result = hocLuc.KiemTra(4.5);
        Assertions.assertEquals("Yeu", result);
    }
    @Test
    public void TestXepLoaiTB(){
        String result = hocLuc.KiemTra(5);
        Assertions.assertEquals("Trung binh", result);
    }
    @Test
    public void TestXepLoaiGioi(){
        String result = hocLuc.KiemTra(7);
        Assertions.assertEquals("Gioi", result);
    }
    @Test
    public void TestXepLoaiXuatSac(){
        String result = hocLuc.KiemTra(9);
        Assertions.assertEquals("Xuat sac", result);
    }
    @Test
    public void TestDiemAm() {
        assertThrows(IllegalArgumentException.class, () -> hocLuc.KiemTra(-1));
    }
}