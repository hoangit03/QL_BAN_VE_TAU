package Entity;

public class Giuong {
	private String maGiuong;
	private String loaiGiuong;
	private int viTri;
	private boolean trangThai;
	
	
	
	public Giuong(String maGiuong, String loaiGiuong, int viTri, boolean trangThai) {
		super();
		this.maGiuong = maGiuong;
		this.loaiGiuong = loaiGiuong;
		this.viTri = viTri;
		this.trangThai = trangThai;
	}
	public String getMaGiuong() {
		return maGiuong;
	}
	public void setMaGiuong(String maGiuong) {
		this.maGiuong = maGiuong;
	}
	public String getLoaiGiuong() {
		return loaiGiuong;
	}
	public void setLoaiGiuong(String loaiGiuong) {
		this.loaiGiuong = loaiGiuong;
	}
	public int getViTri() {
		return viTri;
	}
	public void setViTri(int viTri) {
		this.viTri = viTri;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	@Override
	public String toString() {
		return "Giuong [maGiuong=" + maGiuong + ", loaiGiuong=" + loaiGiuong + ", viTri=" + viTri + ", trangThai="
				+ trangThai + "]";
	}
	
	
	
}
