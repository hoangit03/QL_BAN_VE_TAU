/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Ga {
    private String tenGa;
    private double cuLy;
    private String diaChi;

    public Ga() {
    }

    public Ga(String tenGa, double cuLy, String diaChi) {
        this.tenGa = tenGa;
        this.cuLy = cuLy;
        this.diaChi = diaChi;
    }

    public String getTenGa() {
        return tenGa;
    }

    public void setTenGa(String tenGa) {
        this.tenGa = tenGa;
    }

    public double getCuLy() {
        return cuLy;
    }

    public void setCuLy(double cuLy) {
        this.cuLy = cuLy;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Ga{" + "tenGa=" + tenGa + ", cuLy=" + cuLy + ", diaChi=" + diaChi + '}';
    }
}
