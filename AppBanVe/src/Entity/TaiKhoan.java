package Entity;

public class TaiKhoan {
	private String user;
	private String pass;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public TaiKhoan(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "TaiKhoan [user=" + user + ", pass=" + pass + "]";
	}
	
	
}
