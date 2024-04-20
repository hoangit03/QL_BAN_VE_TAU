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
	    
	    public List<Toa> getAllToaByMaChuyen(String machuyen){
	    	String jpql = "SELECT t"
	    			+ " FROM Toa t"
	    			+ " WHERE t.maToa IN("
	    			+ " SELECT cn.toa.maToa FROM Chuyen ch"
	    			+ " JOIN ch.tau tau"
	    			+ " JOIN tau.lisChoNgois cn "
	    			+ " WHERE ch.maChuyen = :maChuyen GROUP BY cn.toa.maToa)";
	    	List<Toa> result = em.createQuery(jpql, Toa.class)
	    			.setParameter("maChuyen", machuyen)
	    			.getResultList();
	    	return result;
	    }
}
