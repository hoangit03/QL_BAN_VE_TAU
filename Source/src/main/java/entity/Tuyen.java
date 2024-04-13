/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Tuyen {
    private String maTuyen;
    private String tenTuyen;
    private Ga ga;

    public Tuyen() {
    }

    public Tuyen(String maTuyen, String tenTuyen, Ga ga) {
        this.maTuyen = maTuyen;
        this.tenTuyen = tenTuyen;
        this.ga = ga;
    }

    public String getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(String maTuyen) {
        this.maTuyen = maTuyen;
    }

    public String getTenTuyen() {
        return tenTuyen;
    }

    public void setTenTuyen(String tenTuyen) {
        this.tenTuyen = tenTuyen;
    }

    public Ga getGa() {
        return ga;
    }

    public void setGa(Ga ga) {
        this.ga = ga;
    }

    @Override
    public String toString() {
        return "Tuyen{" + "maTuyen=" + maTuyen + ", tenTuyen=" + tenTuyen + ", ga=" + ga + '}';
    }
}
