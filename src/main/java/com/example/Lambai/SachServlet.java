package com.example.Lambai;

public class SachServlet {
    public boolean SuaNamXuatBan(Sach xb,String maSach, String tenSach, String tacGia, int namXuatBan, float gia){
        if (xb == null){
            throw new IllegalArgumentException("Nha xuat ban ko ton tai");
        }
        if (maSach == null || maSach.trim().isEmpty()){
            throw new IllegalArgumentException("Ma sach ko duoc de trong");
        }
        if (tenSach == null || tenSach.trim().isEmpty()){
            throw new IllegalArgumentException("Ten sach ko dc de trong");
        }
        if (tacGia == null || tacGia.trim().isEmpty()){
            throw new IllegalArgumentException("Tac gia ko dc de trong");
        }
        if (namXuatBan < 1990 || namXuatBan > 2025 ){
            throw new IllegalArgumentException("Nam xuat ban phai tu 1990 den 2025");
        }
        if (gia <=0 ){
            throw new IllegalArgumentException("Gia phai lon hon 0");
        }
        xb.setMaSach(maSach);
        xb.setTenSach(tenSach);
        xb.setTacGia(tacGia);
        xb.setNamXuatBan(namXuatBan);
        xb.setGia(gia);
        return true;
    }
}
