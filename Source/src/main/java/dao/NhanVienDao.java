
package dao;

import java.util.List;

import entity.NhanVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class NhanVienDao {
	private EntityManager em;

	public NhanVienDao(EntityManagerFactory emf) {
		em = emf.createEntityManager();
	}

//    Thêm nhân viên
	public boolean addNhanVien(NhanVien nhanVien) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(nhanVien);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

//    cập nhật nhân viên
	public boolean updateNhanVien(NhanVien nhanVien) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(nhanVien);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

//    lấy nhân viên bằng mã
	public NhanVien getNhanVienByMa(String ma) {
		return em.find(NhanVien.class, ma);
	}

//    lấy nhân viên bằng số điện thoại
	public NhanVien getNhanVienBySDT(String sdt) {
		return em.createNamedQuery("NhanVien.findSdt", NhanVien.class).setParameter("sdt", sdt).getSingleResult();
	}

//    Lấy nhân viên bằng căn cước công dân
	public NhanVien getNhanVienByCCCD(String cccd) {
		try {
			return em.createNamedQuery("NhanVien.findCccd", NhanVien.class).setParameter("cccd", cccd)
					.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

//    lấy toàn bộ danh sách nhân viên
	public List<NhanVien> getAllNhanVien() {
		try {

			return em.createNamedQuery("NhanVien.findAll", NhanVien.class).setParameter("loai", "User").getResultList();
		} catch (Exception e) {
			return null;
		}
	}


	public List<NhanVien> getAllNhanVienByMa(String ma) {
		return em.createNamedQuery("NhanVien.findAllByMa", NhanVien.class).setParameter("ma", "%" + ma + "%")
				.getResultList();
	}

}
