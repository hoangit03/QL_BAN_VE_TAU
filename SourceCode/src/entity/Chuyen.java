/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Chuyen {
    private String maChuyen;
    private String tenCHuyen;
    private LocalTime gioKhoiHanh;
    private LocalDate ngayKhoiHanh;
    private Tau tau;
    private Tuyen tuyen;

    public Chuyen() {
    }

    public Chuyen(String maChuyen, String tenCHuyen, LocalTime gioKhoiHanh, LocalDate ngayKhoiHanh, Tau tau, Tuyen tuyen) {
        this.maChuyen = maChuyen;
        this.tenCHuyen = tenCHuyen;
        this.gioKhoiHanh = gioKhoiHanh;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.tau = tau;
        this.tuyen = tuyen;
    }

    public String getMaChuyen() {
        return maChuyen;
    }

    public void setMaChuyen(String maChuyen) {
        this.maChuyen = maChuyen;
    }

    public String getTenCHuyen() {
        return tenCHuyen;
    }

    public void setTenCHuyen(String tenCHuyen) {
        this.tenCHuyen = tenCHuyen;
    }

    public LocalTime getGioKhoiHanh() {
        return gioKhoiHanh;
    }

    public void setGioKhoiHanh(LocalTime gioKhoiHanh) {
        this.gioKhoiHanh = gioKhoiHanh;
    }

    public LocalDate getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(LocalDate ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public Tau getTau() {
        return tau;
    }

    public void setTau(Tau tau) {
        this.tau = tau;
    }

    public Tuyen getTuyen() {
        return tuyen;
    }

    public void setTuyen(Tuyen tuyen) {
        this.tuyen = tuyen;
    }

    @Override
    public String toString() {
        return "Chuyen{" + "maChuyen=" + maChuyen + ", tenCHuyen=" + tenCHuyen + ", gioKhoiHanh=" + gioKhoiHanh + ", ngayKhoiHanh=" + ngayKhoiHanh + ", tau=" + tau + ", tuyen=" + tuyen + '}';
    }
}
