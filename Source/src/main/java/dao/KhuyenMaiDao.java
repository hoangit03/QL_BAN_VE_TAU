package dao;

import java.util.List;

import entity.KhuyenMai;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class KhuyenMaiDao {
	private EntityManager em;

    public KhuyenMaiDao(EntityManagerFactory emf) {
        em = emf.createEntityManager();
    }
	//  lấy Khuyến mãi bằng mã
	  public KhuyenMai getKhuyenMaiByMa(String ma) {
	  	return em.find(KhuyenMai.class, ma);
	  }
	//lấy Khuyến mãi bằng ten
	public KhuyenMai getKhuyenMaiByTen(String ten) {
		return em.find(KhuyenMai.class, ten);
	}
	//lấy Khuyến mãi bằng chiết khấu
	public KhuyenMai getKhuyenMaiByCK(int ck) {
		return em.find(KhuyenMai.class,ck);
	}
	  
	//lấy toàn bộ danh sách khuyến mãi
	public List<KhuyenMai> getAllKhuyenMai(){
		return em.createNamedQuery("KhuyenMai.findAll", KhuyenMai.class).getResultList();
	}
}
