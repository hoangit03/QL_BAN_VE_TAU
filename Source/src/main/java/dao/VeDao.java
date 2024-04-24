package dao;

import java.util.List;

import entity.Ve;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class VeDao {
	 private EntityManager em;

	 public VeDao(EntityManagerFactory emf) {
	      em = emf.createEntityManager();
	   }
	 //    Thêm Vé
	    public boolean addVe(Ve ve){
	        EntityTransaction tx = em.getTransaction();
	        try{
	            tx.begin();
	            em.persist(ve
	            		);
	            tx.commit();
	            return true;
	        }
	        catch (Exception e) {
	        	tx.rollback();
				e.printStackTrace();
			}
	        return false;
	    }
	    // lấy danh sách vé
	    public List<Ve> getAllVe(){
	    	return em.createNamedQuery("Ve.findAll", Ve.class).getResultList();
	    }
	    
//	    lấy Vé bằng mã
	    public Ve getVeByMa(String ma) {
	    	return em.find(Ve.class, ma);
	    }
	    
	    public List<Ve> layVeThuocMa(String ma){
	    	return em.createQuery("SELECT v FROM Ve v WHERE v.maVe like :maVe", Ve.class).setParameter("maVe","%"+ ma+"%").getResultList();
	    }
}
