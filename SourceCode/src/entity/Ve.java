/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;

public class Ve {
    private  String maVe;
    private LocalDateTime thoiGianLenTau;
    private Chuyen chuyen;
    private ChoNgoi choNgoi;
    private Ga gaDi;
    private Ga gaDen;
    private KhuyenMai khuyenMai;
    private KhachHang khachHang;
    private HoaDon hoaDon;

    public Ve(String maVe, LocalDateTime thoiGianLenTau, Chuyen chuyen, ChoNgoi choNgoi, Ga gaDi, Ga gaDen, KhuyenMai khuyenMai, KhachHang khachHang, HoaDon hoaDon) {
        this.maVe = maVe;
        this.thoiGianLenTau = thoiGianLenTau;
        this.chuyen = chuyen;
        this.choNgoi = choNgoi;
        this.gaDi = gaDi;
        this.gaDen = gaDen;
        this.khuyenMai = khuyenMai;
        this.khachHang = khachHang;
        this.hoaDon = hoaDon;
    }

    public Ve() {
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public LocalDateTime getThoiGianLenTau() {
        return thoiGianLenTau;
    }

    public void setThoiGianLenTau(LocalDateTime thoiGianLenTau) {
        this.thoiGianLenTau = thoiGianLenTau;
    }

    public Chuyen getChuyen() {
        return chuyen;
    }

    public void setChuyen(Chuyen chuyen) {
        this.chuyen = chuyen;
    }

    public ChoNgoi getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(ChoNgoi choNgoi) {
        this.choNgoi = choNgoi;
    }

    public Ga getGaDi() {
        return gaDi;
    }

    public void setGaDi(Ga gaDi) {
        this.gaDi = gaDi;
    }

    public Ga getGaDen() {
        return gaDen;
    }

    public void setGaDen(Ga gaDen) {
        this.gaDen = gaDen;
    }

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    @Override
    public String toString() {
        return "Ve{" + "maVe=" + maVe + ", thoiGianLenTau=" + thoiGianLenTau + ", chuyen=" + chuyen + ", choNgoi=" + choNgoi + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", khuyenMai=" + khuyenMai + ", khachHang=" + khachHang + ", hoaDon=" + hoaDon + '}';
    }
}
