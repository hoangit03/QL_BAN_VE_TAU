
package dao;

import com.sun.jdi.connect.spi.Connection;
import entity.KhachHang;
import java.beans.Statement;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO {
    List<KhachHang> dsKhachHang = new ArrayList<>();

    public List<KhachHang> getAllKhachHang() {
        try  {
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  dsKhachHang;
    }
}