package Entity;

public class Tuyen {
	private String maTuyen;
	private Ga gaBatDau;
	private Ga gaKetThuc;
	public Tuyen(String maTuyen, Ga gaBatDau, Ga gaKetThuc) {
		super();
		this.maTuyen = maTuyen;
		this.gaBatDau = gaBatDau;
		this.gaKetThuc = gaKetThuc;
	}
	public String getMaTuyen() {
		return maTuyen;
	}
	public void setMaTuyen(String maTuyen) {
		this.maTuyen = maTuyen;
	}
	public Ga getGaBatDau() {
		return gaBatDau;
	}
	public void setGaBatDau(Ga gaBatDau) {
		this.gaBatDau = gaBatDau;
	}
	public Ga getGaKetThuc() {
		return gaKetThuc;
	}
	public void setGaKetThuc(Ga gaKetThuc) {
		this.gaKetThuc = gaKetThuc;
	}
	@Override
	public String toString() {
		return "Tuyen [maTuyen=" + maTuyen + ", gaBatDau=" + gaBatDau + ", gaKetThuc=" + gaKetThuc + "]";
	}
	
	 
	
}
