package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static Connection con = null;
	private static Database insConnect = new Database();
	
	public void connect() {
		String url = "jdbc:sqlserver://localhost:1433;databasename=BVTAU";
		String user = "PTUD";
		String pwd = "123456";
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
	}
	public static Database getInsConnect() {
		return insConnect;
	}
	
	
}
