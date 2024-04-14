/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Tuyen implements Serializable {

    @Id
    @Column(name = "MaTuyen", nullable = false)
    private String maTuyen;

    @Column(name = "TenTuyen", columnDefinition = "nvarchar(255)")
    private String tenTuyen;

    @OneToMany(mappedBy = "tuyen")
    private List<Chuyen> listChuyens;

    @OneToMany(mappedBy = "tuyen")
    private List<Ga> lisGas;

    public Tuyen() {
    }

    public Tuyen(String maTuyen, String tenTuyen) {
        this.maTuyen = maTuyen;
        this.tenTuyen = tenTuyen;

    }

    public List<Chuyen> getListChuyens() {
        return listChuyens;
    }

    public void setListChuyens(List<Chuyen> listChuyens) {
        this.listChuyens = listChuyens;
    }

    public List<Ga> getLisGas() {
        return lisGas;
    }

    public void setLisGas(List<Ga> lisGas) {
        this.lisGas = lisGas;
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

    @Override
    public String toString() {
        return "Tuyen{" + "maTuyen=" + maTuyen + ", tenTuyen=" + tenTuyen + '}';
    }
}
