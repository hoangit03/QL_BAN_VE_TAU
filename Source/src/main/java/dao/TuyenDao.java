package dao;

import java.util.List;

import entity.Tuyen;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class TuyenDao {
	 private EntityManager em;

	    public TuyenDao(EntityManagerFactory emf) {
	        em = emf.createEntityManager();
	    }
//	    lấy Tuyen bằng mã
	    public Tuyen getTuyenByMa(String ma) {
	    	return em.find(Tuyen.class, ma);
	    }
//	    lấy toàn bộ danh sách Tuyến
	    public List<Tuyen> getAllTuyen(){
	    	return em.createNamedQuery("Tuyen.findAll", Tuyen.class).getResultList();
	    }
}
