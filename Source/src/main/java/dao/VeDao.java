package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import entity.Ve;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

public class VeDao {
	private EntityManager em;

	public VeDao(EntityManagerFactory emf) {
		em = emf.createEntityManager();
	}

	// Thêm Vé
	public boolean addVe(Ve ve) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(ve);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateVe(Ve ve) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(ve);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

	// lấy danh sách vé
	public List<Ve> getAllVe() {
		return em.createNamedQuery("Ve.findAll", Ve.class).getResultList();
	}

	public List<Ve> getListVeByMaHD(String mahd) {
		return em.createNamedQuery("Ve.FindByMaHd", Ve.class).setParameter("mhd", mahd).getResultList();
	}
	public List<Ve> getListVeByMaVe(String mv) {
		return em.createNamedQuery("Ve.FindByMaVe", Ve.class).setParameter("mv", mv).getResultList();
	}
//	    lấy Vé bằng mã
	public Ve getVeByMa(String ma) {
		return em.find(Ve.class, ma);
	}
	 public void updateDoiVe(String maVe, LocalDateTime localDateTime) {
	        EntityTransaction transaction = null;
	        try {
	            transaction = em.getTransaction();
	            transaction.begin();

	            em.createNamedQuery("Ve.updateDoiTra")
	                .setParameter("newThoiGianLenTau", localDateTime)
	                .setParameter("newTrangThai", false)
	                .setParameter("maVe", maVe)
	                .executeUpdate();

	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null && transaction.isActive()) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    
	    public List<Ve> layVeThuocMa(String ma){
	    	return em.createQuery("SELECT v FROM Ve v WHERE v.maVe like :maVe", Ve.class).setParameter("maVe","%"+ ma+"%").getResultList();
	    }
	    
	    public Object layTongVeTrongNgay(int nam, int thang, int ngay) {
	        try {
	            return em.createNamedQuery("Ve.TongVeNgayTheoThang")
	            		 .setParameter("nam", nam)
	                     .setParameter("thang", thang)
	                     .setParameter("ngay", ngay)
	                     .getSingleResult();
	        } catch (NoResultException e) {
	            // Xử lý nếu không có kết quả nào được trả về
	            return 0;
	        }
	    }


}
