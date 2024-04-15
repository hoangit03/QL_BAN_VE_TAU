
package dao;

import entity.KhachHang;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class KhachHangDao {
    private EntityManager em;
    
    public KhachHangDao(EntityManagerFactory emf) {
		em = emf.createEntityManager();
	}
    
    // Update KhachHang
    public boolean updateKhachHang(KhachHang khachHang) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(khachHang);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}
    
	//  Get list KhachHang
	public List<KhachHang> getAllKhachHang() {
		try {

			return em.createNamedQuery("KhachHang.findAll", KhachHang.class).getResultList();
		} catch (Exception e) {
			return null;
		}
	}
}
