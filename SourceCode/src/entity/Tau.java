/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;

public class Tau {
    private String maTau;
    private String loaiTau;
    private String tenTau;
    private double tocDo;
    private LocalDate namSX;

    public Tau() {
    }

    public Tau(String maTau, String loaiTau, String tenTau, double tocDo, LocalDate namSX) {
        this.maTau = maTau;
        this.loaiTau = loaiTau;
        this.tenTau = tenTau;
        this.tocDo = tocDo;
        this.namSX = namSX;
    }

    public String getMaTau() {
        return maTau;
    }

    public void setMaTau(String maTau) {
        this.maTau = maTau;
    }

    public String getLoaiTau() {
        return loaiTau;
    }

    public void setLoaiTau(String loaiTau) {
        this.loaiTau = loaiTau;
    }

    public String getTenTau() {
        return tenTau;
    }

    public void setTenTau(String tenTau) {
        this.tenTau = tenTau;
    }

    public double getTocDo() {
        return tocDo;
    }

    public void setTocDo(double tocDo) {
        this.tocDo = tocDo;
    }

    public LocalDate getNamSX() {
        return namSX;
    }

    public void setNamSX(LocalDate namSX) {
        this.namSX = namSX;
    }

    @Override
    public String toString() {
        return "Tau{" + "maTau=" + maTau + ", loaiTau=" + loaiTau + ", tenTau=" + tenTau + ", tocDo=" + tocDo + ", namSX=" + namSX + '}';
    }  
}
