/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class ChoNgoi {
    private String maChoNgoi;
    private String moTa;
    private double gia;
    private int viTri;
    private Tau tau;
    private Toa toa;

    public ChoNgoi() {
    }

    public ChoNgoi(String maChoNgoi, String moTa, double gia, int viTri, Tau tau, Toa toa) {
        this.maChoNgoi = maChoNgoi;
        this.moTa = moTa;
        this.gia = gia;
        this.viTri = viTri;
        this.tau = tau;
        this.toa = toa;
    }

    public String getMaChoNgoi() {
        return maChoNgoi;
    }

    public void setMaChoNgoi(String maChoNgoi) {
        this.maChoNgoi = maChoNgoi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getViTri() {
        return viTri;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }

    public Tau getTau() {
        return tau;
    }

    public void setTau(Tau tau) {
        this.tau = tau;
    }

    public Toa getToa() {
        return toa;
    }

    public void setToa(Toa toa) {
        this.toa = toa;
    }

    @Override
    public String toString() {
        return "ChoNgoi{" + "maChoNgoi=" + maChoNgoi + ", moTa=" + moTa + ", gia=" + gia + ", viTri=" + viTri + ", tau=" + tau + ", toa=" + toa + '}';
    }
}
