package dao;


import java.util.List;

import entity.HoaDon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class HoaDonDao {
	private EntityManager em;

    public HoaDonDao(EntityManagerFactory emf) {
        em = emf.createEntityManager();
    }
//  Thêm Hóa Đơn
  public boolean addHoaDon(HoaDon hoaDon){
      EntityTransaction tx = em.getTransaction();
      try{
          tx.begin();
          em.persist(hoaDon);
          tx.commit();
          return true;
      }
      catch (Exception e) {
      	tx.rollback();
			e.printStackTrace();
		}
      return false;
  }
    
//  lấy Hoa Don bằng mã
  public HoaDon getHoaDonByMa(String ma) {
  	return em.find(HoaDon.class, ma);
  }
//lấy toàn bộ danh sách HoaDon
 public List<HoaDon> getAllHoaDon(){
	return em.createNamedQuery("HoaDon.findAll", HoaDon.class).getResultList();
}
//lấy Hoa Don bằng thời gian tạo
public HoaDon getHoaDonByTime(String ngayTao) {
	return em.find(HoaDon.class, ngayTao);
}

  
}
