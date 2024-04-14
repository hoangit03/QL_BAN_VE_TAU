/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Ve implements Serializable {

    @Id
    @Column(name = "MaVe")
    private String maVe;

    @Column(name = "ThoiGianLenTau")
    private LocalDateTime thoiGianLenTau;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaChuyen")
    private Chuyen chuyen;

    @OneToOne
    @JoinColumn(name = "MaChoNgoi")
    private ChoNgoi choNgoi;

    @OneToMany(mappedBy = "ve")
    private Set<ChiTietVe> lisChiTietVes;

    @OneToOne
    @JoinColumn(name = "MaKhuyenMai")
    private KhuyenMai khuyenMai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CCCD")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHoaDon")
    private HoaDon hoaDon;

    public Ve(String maVe, LocalDateTime thoiGianLenTau, Chuyen chuyen, ChoNgoi choNgoi, Ga gaDi, Ga gaDen, KhuyenMai khuyenMai, KhachHang khachHang) {
        this.maVe = maVe;
        this.thoiGianLenTau = thoiGianLenTau;
        this.chuyen = chuyen;
        this.choNgoi = choNgoi;
        this.khuyenMai = khuyenMai;
        this.khachHang = khachHang;
    }

    public Ve() {
    }

    public Set<ChiTietVe> getLisChiTietVes() {
        return lisChiTietVes;
    }

    public void setLisChiTietVes(Set<ChiTietVe> lisChiTietVes) {
        this.lisChiTietVes = lisChiTietVes;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
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

    @Override
    public String toString() {
        return "Ve{" + "maVe=" + maVe + ", thoiGianLenTau=" + thoiGianLenTau + ", chuyen=" + chuyen + ", choNgoi=" + choNgoi + ", khuyenMai=" + khuyenMai + ", khachHang=" + khachHang + '}';
    }

}
