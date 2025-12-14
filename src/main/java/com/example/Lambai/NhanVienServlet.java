package com.example.Lambai;

import java.util.ArrayList;
import java.util.List;

public class NhanVienServlet {
    private List<NhanVien> danhSachNhanVien = new ArrayList<>();

    public boolean themNhanVien(NhanVien nv) {
        if (nv == null) {
            throw new IllegalArgumentException("Nhan vien khong duoc null");
        }
        if (nv.getMaNV() == null || nv.getMaNV().trim().isEmpty()) {
            throw new IllegalArgumentException("Ma nhan vien khong duoc de trong");
        }

        for (NhanVien nhanVienTonTai : danhSachNhanVien) {
            if (nhanVienTonTai.getMaNV().equalsIgnoreCase(nv.getMaNV())) {
                throw new IllegalArgumentException("Ma nhan vien khong duoc trung nhau");
            }
        }
        if (nv.getTenNV() == null || nv.getTenNV().trim().isEmpty()) {
            throw new IllegalArgumentException("Ten nhan vien khong duoc de trong");
        }
        if (nv.getLuong() <= 0 || nv.getLuong() > 100000000) {
            throw new IllegalArgumentException("Luong phai > 0 va <= 100 trieu");
        }
        if (nv.getTuoi() <  18 || nv.getTuoi() > 30){
            throw new IllegalArgumentException("Tuoi lon hon 18 va be hon 30");
        }
        if (nv.getPhongBan() == null || nv.getPhongBan().trim().isEmpty()){
            throw new IllegalArgumentException("Phong ban ko dc de trong");
        }
        danhSachNhanVien.add(nv);
        return true;
    }
}


