/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Toa {
    private String maToa;
    private String loaiToa;
    private int soDungTich;
    private int nganChua;

    public Toa(String maToa, String loaiToa, int soDungTich, int nganChua) {
        this.maToa = maToa;
        this.loaiToa = loaiToa;
        this.soDungTich = soDungTich;
        this.nganChua = nganChua;
    }

    public Toa() {
    }

    public String getMaToa() {
        return maToa;
    }

    public void setMaToa(String maToa) {
        this.maToa = maToa;
    }

    public String getLoaiToa() {
        return loaiToa;
    }

    public void setLoaiToa(String loaiToa) {
        this.loaiToa = loaiToa;
    }

    public int getSoDungTich() {
        return soDungTich;
    }

    public void setSoDungTich(int soDungTich) {
        this.soDungTich = soDungTich;
    }

    public int getNganChua() {
        return nganChua;
    }

    public void setNganChua(int nganChua) {
        this.nganChua = nganChua;
    }

    @Override
    public String toString() {
        return "Toa{" + "maToa=" + maToa + ", loaiToa=" + loaiToa + ", soDungTich=" + soDungTich + ", nganChua=" + nganChua + '}';
    }
}
