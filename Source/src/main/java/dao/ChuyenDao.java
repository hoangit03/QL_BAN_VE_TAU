package dao;

import java.util.List;

import entity.Chuyen;
import entity.NhanVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class ChuyenDao {
	private EntityManager em;

    public ChuyenDao(EntityManagerFactory emf) {
        em = emf.createEntityManager();
    }
    
	//  lấy Chuyến bằng mã
	  public Chuyen getChuyenByMa(String ma) {
	  	return em.find(Chuyen.class, ma);
	  }
	//  lấy Chuyến bằng tên
		  public Chuyen getChuyenByTen(String ten) {
		  	return em.find(Chuyen.class, ten);
		  }
  
	//lấy toàn bộ danh sách Chuyến
	public List<Chuyen> getAllChuyen(){
		return em.createNamedQuery("Chuyen.findAll", Chuyen.class).getResultList();
	}

}
