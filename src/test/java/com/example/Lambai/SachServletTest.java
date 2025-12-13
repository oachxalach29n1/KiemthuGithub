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
    public void TestBienMinXuatBan1990(){
        assertTrue(servlet.SuaNamXuatBan(sach,"MS01","Java","Khanh",1990,10));
    }
    @Test
    public void TestBienMaxXuatBan2025(){
        assertTrue(servlet.SuaNamXuatBan(sach,"MS01","Java","Khanh",2025,10));
    }
    @Test
    public void TestCanBienMinXuatBan1989(){
       assertThrows(IllegalArgumentException.class, () -> {
           servlet.SuaNamXuatBan(sach,"MS01","Java","Khanh",1989,10);
       });
    }
    @Test
    public void TestCanBienMaxXuatBan2026(){
        assertThrows(IllegalArgumentException.class, () -> {
            servlet.SuaNamXuatBan(sach,"MS01","Java","Khanh",2026,10);
        });
    }
    @Test
    public void TestTenSachRong(){
        assertThrows(IllegalArgumentException.class, () -> {
            servlet.SuaNamXuatBan(sach,"MS01","","Khanh",2026,10);
        });
    }
}