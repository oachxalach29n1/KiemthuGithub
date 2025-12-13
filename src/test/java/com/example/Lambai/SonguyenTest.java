package com.example.Lambai;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonguyenTest {
    private Songuyen kiemTra;
    @BeforeEach
    void setup() {kiemTra = new Songuyen();}

    @Test
    public void TestBienMin(){
        assertTrue(kiemTra.KiemTra(1));
    }
    @Test
    public void TestBienMax(){
        assertTrue(kiemTra.KiemTra(100));
    }
    @Test
    public void TestCanBienMin2(){
        assertTrue(kiemTra.KiemTra(2));
    }
    @Test
    public void TestCanBienMax99(){
        assertTrue(kiemTra.KiemTra(99));
    }
    @Test
    public void TestCanBienMin0(){
        assertThrows(IllegalArgumentException.class, () -> kiemTra.KiemTra(0));
    }
    @Test
    public void TestCanBienMax101(){
        assertThrows(IllegalArgumentException.class, () ->kiemTra.KiemTra(101));
    }


}