package Entity;

public class NhanVien {
	private String maNV;
	private String cCCD;
	private String SDT;
	private String diaChi;
	private String hoTen;
	private String tuoi;
	
	
	
	public NhanVien(String maNV, String cCCD, String sDT, String diaChi, String hoTen, String tuoi) {
		super();
		this.maNV = maNV;
		this.cCCD = cCCD;
		SDT = sDT;
		this.diaChi = diaChi;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getcCCD() {
		return cCCD;
	}
	public void setcCCD(String cCCD) {
		this.cCCD = cCCD;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", cCCD=" + cCCD + ", SDT=" + SDT + ", diaChi=" + diaChi + ", hoTen=" + hoTen
				+ ", tuoi=" + tuoi + "]";
	}
	
	
}
