package com.example.Lambai;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServletTest {
    private SachServlet servlet;
    private Sach sach;
    @BeforeEach
    void setup(){
        servlet = new SachServlet();
        sach = new Sach("MS01","Java","Khanh",2020,10);
    }
    @Test
    public void TestBienMinNamXuatBan1990(){
        assertTrue(servlet.SuaNamXuatBan(sach,"MS01","Java","Khanh",1990,10));
    }
    @Test
    public void TestBienMaxNamXuatBan2025(){
        assertTrue(servlet.SuaNamXuatBan(sach, "MS01","Java","Khanh",2025,10));
    }
    @Test
    public void TestCanBienNXB1989(){
        assertThrows(IllegalArgumentException.class, () -> {
           servlet.SuaNamXuatBan(sach, "MS01","Java","Khanh",1989,10);
        });
    }
    @Test
    public void TestCanBienMax2026(){
        assertThrows(IllegalArgumentException.class, () ->{
            servlet.SuaNamXuatBan(sach,"MS01","Java","Khanh",2026,10);
        });
    }
    @Test
    public void TestTenSachRong(){
        assertThrows(IllegalArgumentException.class, () ->{
            servlet.SuaNamXuatBan(sach, "MS01","","Khanh",2020,10);
        });
    }
}