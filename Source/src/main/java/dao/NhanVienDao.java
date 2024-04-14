
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
    public boolean addNhanVien(NhanVien nhanVien){
        EntityTransaction tx = em.getTransaction();
        try{
            tx.begin();
            em.persist(nhanVien);
            tx.commit();
            return true;
        }
        catch (Exception e) {
        	tx.rollback();
			e.printStackTrace();
		}
        return false;
    }
    
    
//    cập nhật nhân viên
    public boolean updateNhanVien(NhanVien nhanVien){
        EntityTransaction tx = em.getTransaction();
        try{
            tx.begin();
            em.merge(nhanVien);
            tx.commit();
            return true;
        }
        catch (Exception e) {
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
    
//    lấy toàn bộ danh sách nhân viên
    public List<NhanVien> getAllNhanVien(){
    	return em.createNamedQuery("NhanVien.findAll", NhanVien.class).getResultList();
    }
    
    

}
