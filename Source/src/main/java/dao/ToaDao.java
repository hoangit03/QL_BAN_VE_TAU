package dao;

import java.util.List;

import entity.Toa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class ToaDao {
	 private EntityManager em;

	    public ToaDao(EntityManagerFactory emf) {
	        em = emf.createEntityManager();
	    }
//	    lấy toa bằng mã
	    public Toa getToaByMa(String ma) {
	    	return em.find(Toa.class, ma);
	    }
//	    lấy toàn bộ danh sách toa
	    public List<Toa> getAllToa(){
	    	return em.createNamedQuery("Toa.findAll", Toa.class).getResultList();
	    }
}
