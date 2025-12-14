package com.example.Lambai;

import org.checkerframework.checker.units.qual.N;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServletTest {
    private NhanVienServlet servlet;
    @BeforeEach
    void setup(){servlet = new NhanVienServlet();}

    @Test
    public void TestThemNV(){
        NhanVien nhanVien = new NhanVien("NV01","Pham Xuan Khanh",18,10000000,"P01");
        assertTrue(servlet.themNhanVien(nhanVien));
    }
    @Test
    public void TestTenTrong(){
        NhanVien nhanVien = new NhanVien("NV02","",18,10000000,"P01");
        assertThrows(IllegalArgumentException.class, () ->servlet.themNhanVien(nhanVien));
    }
}