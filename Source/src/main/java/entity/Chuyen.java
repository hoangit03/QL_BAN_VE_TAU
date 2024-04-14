/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Chuyen implements Serializable {

    @Id
    @Column(name = "MaChuyen")
    private String maChuyen;

    @Column(name = "TenChuyen", columnDefinition = "nvarchar(255)")
    private String tenCHuyen;

    @Column(name = "GioKhoiHanh")
    private LocalTime gioKhoiHanh;

    @Column(name = "NgayKhoiHanh")
    private LocalDate ngayKhoiHanh;

    @OneToOne
    @JoinColumn(name = "MaTau", unique = true, nullable = false)
    private Tau tau;

    @ManyToOne
    @JoinColumn(name = "MaTuyen")
    private Tuyen tuyen;

    @OneToMany(mappedBy = "chuyen")
    private Set<Ve> lisVes;

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

    public Set<Ve> getLisVes() {
        return lisVes;
    }

    public void setLisVes(Set<Ve> lisVes) {
        this.lisVes = lisVes;
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
