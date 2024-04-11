/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.util.Objects;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private String cccd;
    private String sdt;
    private String email;
    private String diaChi;
    private String loaiNV;
    private String trangThai;
    private LocalDate ngaySinh;
    private LocalDate ngayVaoLam;

    public NhanVien(String maNhanVien, String hoTen, String cccd, String sdt, String email, String diaChi, String loaiNV, String trangThai, LocalDate ngaySinh, LocalDate ngayVaoLam) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.loaiNV = loaiNV;
        this.trangThai = trangThai;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
    }

    public NhanVien() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", hoTen=" + hoTen + ", cccd=" + cccd + ", sdt=" + sdt + ", email=" + email + ", diaChi=" + diaChi + ", loaiNV=" + loaiNV + ", trangThai=" + trangThai + ", ngaySinh=" + ngaySinh + ", ngayVaoLam=" + ngayVaoLam + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.maNhanVien);
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
        final NhanVien other = (NhanVien) obj;
        return Objects.equals(this.maNhanVien, other.maNhanVien);
    }
}
