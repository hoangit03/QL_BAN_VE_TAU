package dao;

import java.util.List;

import entity.KhuyenMai;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class KhuyenMaiDao {
	private EntityManager em;

	public KhuyenMaiDao(EntityManagerFactory emf) {
		em = emf.createEntityManager();
	}
	
	public boolean updateKhuyenMai(KhuyenMai khuyenMai) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(khuyenMai);
			tx.commit();
			return true;
		}
		catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean addKhuyenMai(KhuyenMai khuyenMai) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(khuyenMai);
			tx.commit();
			return true;
		}
		catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

	// lấy Khuyến mãi bằng mã
	public KhuyenMai getKhuyenMaiByMa(String ma) {
		return em.find(KhuyenMai.class, ma);
	}

	// lấy toàn bộ danh sách khuyến mãi
	public List<KhuyenMai> getAllKhuyenMai() {
		return em.createNamedQuery("KhuyenMai.findAll", KhuyenMai.class).getResultList();
	}

	// lấy toàn bộ danh sách khuyến mãi khach hang
	public List<KhuyenMai> getAllKhuyenMaiKH() {
		return em.createNamedQuery("KhuyenMai.findAllKMKH", KhuyenMai.class).setParameter("loai", "KMHD").getResultList();
	}

	// lấy toàn bộ danh sách khuyến mãi tren hoa don
	public List<KhuyenMai> getAllKhuyenMaiHD() {
		return em.createNamedQuery("KhuyenMai.findAllKMHD", KhuyenMai.class).setParameter("loai", "KMHD").getResultList();
	}

	public List<KhuyenMai> getAllKhuyenMaiByNumber(String ma) {
		return em.createNamedQuery("KhuyenMai.findAllKMNB", KhuyenMai.class).setParameter("ma","%"+ma+"%").getResultList();
	}
}
