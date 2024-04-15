package dao;

import java.util.List;

import entity.ChoNgoi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class ChoNgoiDao {
	private EntityManager em;

    public ChoNgoiDao(EntityManagerFactory emf) {
        em = emf.createEntityManager();
    }
	    
	//  lấy Chỗ ngồi bằng mã
	  public ChoNgoi getChoNgoiByMa(String ma) {
	  	return em.find(ChoNgoi.class, ma);
	  }
	//lấy toàn bộ danh sách Chỗ ngồi
	public List<ChoNgoi> getAllChoNgoi(){
		return em.createNamedQuery("ChoNgoi.findAll", ChoNgoi.class).getResultList();
	}
	
}
