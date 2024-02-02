package Entity;

public class Ga {
	private String tenGa;
	private String diaChi;
	private String gaDen;
	private String gaDi;
	public Ga(String tenGa, String diaChi, String gaDen, String gaDi) {
		super();
		this.tenGa = tenGa;
		this.diaChi = diaChi;
		this.gaDen = gaDen;
		this.gaDi = gaDi;
	}
	public String getTenGa() {
		return tenGa;
	}
	public void setTenGa(String tenGa) {
		this.tenGa = tenGa;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public String getGaDi() {
		return gaDi;
	}
	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}
	@Override
	public String toString() {
		return "Ga [tenGa=" + tenGa + ", diaChi=" + diaChi + ", gaDen=" + gaDen + ", gaDi=" + gaDi + "]";
	}
	
	
	
}
