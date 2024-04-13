/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;
import java.util.Set;
import java.util.jar.Attributes.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Ga {
	
	@Id
	@Column(name = "TenGa",unique = true,nullable = false,columnDefinition = "nvarchar")
    private String tenGa;
	
	@Column(name = "CuLy")
    private double cuLy;
	
	@Column(name = "DiaChi",columnDefinition = "nvarchar")
    private String diaChi;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaTuyen")
	private Tuyen tuyen;
	
	@OneToMany(mappedBy = "ga")
	private Set<ChiTietVe> lisChiTietVes;

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
