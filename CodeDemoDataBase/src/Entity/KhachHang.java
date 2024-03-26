package Entity;

public class KhachHang {
	private String cCCD;
	private String hoTen;
	private String SDT;
	private String tuoi;
	
	
	
	public KhachHang(String cCCD, String hoTen, String sDT, String tuoi) {
		super();
		cCCD = cCCD;
		this.hoTen = hoTen;
		SDT = sDT;
		this.tuoi = tuoi;
	}
	public String getCCCD() {
		return cCCD;
	}
	public void setCCCD(String cCCD) {
		cCCD = cCCD;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "KhachHang [CCCD=" + cCCD + ", hoTen=" + hoTen + ", SDT=" + SDT + ", tuoi=" + tuoi + "]";
	}
	
	
}
