/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class ChiTietKhuyenMai {
    private HoaDon hoaDon;
    private KhuyenMai khuyenMai;

    public ChiTietKhuyenMai() {
    }

    public ChiTietKhuyenMai(HoaDon hoaDon, KhuyenMai khuyenMai) {
        this.hoaDon = hoaDon;
        this.khuyenMai = khuyenMai;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    @Override
    public String toString() {
        return "ChiTietKhuyenMai{" + "hoaDon=" + hoaDon + ", khuyenMai=" + khuyenMai + '}';
    }
}
