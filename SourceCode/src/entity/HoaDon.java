/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class HoaDon {
    private String maHoaDon;
    private LocalTime gioTao;
    private LocalDate ngayTao;
    private String trangThai;
    private NhanVien nhanVien;
    private KhachHang khachHang;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, LocalTime gioTao, LocalDate ngayTao, String trangThai, NhanVien nhanVien, KhachHang khachHang) {
        this.maHoaDon = maHoaDon;
        this.gioTao = gioTao;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.nhanVien = nhanVien;
        this.khachHang = khachHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalTime getGioTao() {
        return gioTao;
    }

    public void setGioTao(LocalTime gioTao) {
        this.gioTao = gioTao;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", gioTao=" + gioTao + ", ngayTao=" + ngayTao + ", trangThai=" + trangThai + ", nhanVien=" + nhanVien + ", khachHang=" + khachHang + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.maHoaDon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HoaDon other = (HoaDon) obj;
        return Objects.equals(this.maHoaDon, other.maHoaDon);
    } 
}
