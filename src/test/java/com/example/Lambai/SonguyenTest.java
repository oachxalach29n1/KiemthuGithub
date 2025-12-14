package com.example.Lambai;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonguyenTest {
    private Songuyen kiemTra;
    @BeforeEach
    void setup(){kiemTra = new Songuyen();
    }
    @Test
    public void TestBienMin1(){
        assertTrue(kiemTra.Kiemtra(1));
    }
    @Test
    public void TestBienMax100(){
        assertTrue(kiemTra.Kiemtra(100));
    }
    @Test
    public void TestBienCanBienMin2(){
        assertTrue(kiemTra.Kiemtra(2));
    }
    @Test
    public void TestBienCanBienMax99(){
        assertTrue(kiemTra.Kiemtra(99));
    }
    @Test
    public void TestBienCanBienMin0(){
        assertThrows(IllegalArgumentException.class, () -> kiemTra.Kiemtra(0));
    }
    @Test
    public void TestCanBienMax101(){
        assertThrows(IllegalArgumentException.class, () -> kiemTra.Kiemtra(101));
    }
}
