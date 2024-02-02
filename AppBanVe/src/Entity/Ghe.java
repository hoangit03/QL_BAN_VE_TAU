package Entity;

public class Ghe {
	private String maGhe;
	private String loaiGhe;
	private int viTri;
	private boolean trangThai;
	
	
	public Ghe(String maGhe, String loaiGhe, int viTri, boolean trangThai) {
		super();
		this.maGhe = maGhe;
		this.loaiGhe = loaiGhe;
		this.viTri = viTri;
		this.trangThai = trangThai;
	}
	public String getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}
	public String getLoaiGhe() {
		return loaiGhe;
	}
	public void setLoaiGhe(String loaiGhe) {
		this.loaiGhe = loaiGhe;
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
		return "Ghe [maGhe=" + maGhe + ", loaiGhe=" + loaiGhe + ", viTri=" + viTri + ", trangThai=" + trangThai + "]";
	}

	
	
}
