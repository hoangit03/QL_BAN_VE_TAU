/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectDB;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection con = null;
    private static  ConnectDB instance = new ConnectDB();
    public static ConnectDB getInstance(){
        return instance;
    }
    
    public void connect(){
        String url = "jdbc:sqlserver://localhost:1433;databasename=QuanLyBanVeTau";
        String user = "PTUD";
        String pass = "123456";
        
        try {
            con = (Connection) DriverManager.getConnection(url, user, pass);                
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static Connection getConnection() {
        return con;
    }
}
