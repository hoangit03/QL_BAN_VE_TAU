
package model;

import java.time.Duration;
import java.time.format.DateTimeFormatter;

import entity.Chuyen;
import entity.Ga;

public class Model_Tau {
	private String tenTau;
	private String TGDi;
	private String TGDen;
	private Chuyen chuyen;
	private String maTau;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Model_Tau() {
	}

	public Model_Tau(Chuyen chuyen, Ga gaDi, Ga gaDen, Ga gaXP) {
		this.maTau = chuyen.getTau().getMaTau();
		this.tenTau = chuyen.getTau().getMaTau();
		double time1 = Math.abs(gaXP.getCuLy() - gaDi.getCuLy()) / chuyen.getTau().getTocDo();
		this.TGDi = chuyen.getNgayKhoiHanh().format(formatter) + " " + chuyen.getGioKhoiHanh()
				.plus(Duration.ofMinutes((long) (time1 * 60 + 10 * Math.abs(gaXP.getId() - gaDi.getId())))).toString();
		double time2 = Math.abs(gaDen.getCuLy() - gaDi.getCuLy()) / chuyen.getTau().getTocDo();
		this.TGDen = chuyen.getNgayKhoiHanh().format(formatter) + " "
				+ chuyen.getGioKhoiHanh().plus(Duration.ofMinutes((long) ((time2 + time1) * 60  + 10 * (Math.abs(gaDi.getId() - gaDen.getId())-1)))).toString();
		this.chuyen = chuyen;
	}

	public String getTenTau() {
		return tenTau;
	}

	public void setTenTau(String tenTau) {
		this.tenTau = tenTau;
	}

	public String getTGDi() {
		return TGDi;
	}

	public void setTGDi(String TGDi) {
		this.TGDi = TGDi;
	}

	public String getTGDen() {
		return TGDen;
	}

	public void setTGDen(String TGDen) {
		this.TGDen = TGDen;
	}

	public Chuyen getChuyen() {
		return chuyen;
	}

	public void setChuyen(Chuyen chuyen) {
		this.chuyen = chuyen;
	}

	public String getMaTau() {
		return maTau;
	}

	public void setMaTau(String maTau) {
		this.maTau = maTau;
	}

	
}
