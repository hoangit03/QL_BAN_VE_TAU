/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

public class KhachHang {
    private String cccd;
    private String hoTen;
    private String email;
    private String sdt;
    private String doiTuong;

    public KhachHang(String cccd, String hoTen, String email, String sdt, String doiTuong) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.doiTuong = doiTuong;
    }

    public KhachHang() {
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "cccd=" + cccd + ", hoTen=" + hoTen + ", email=" + email + ", sdt=" + sdt + ", doiTuong=" + doiTuong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.cccd);
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
        final KhachHang other = (KhachHang) obj;
        return Objects.equals(this.cccd, other.cccd);
    }
}
