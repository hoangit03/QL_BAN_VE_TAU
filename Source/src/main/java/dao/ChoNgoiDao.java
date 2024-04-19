package dao;

import java.util.List;

import entity.ChoNgoi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class ChoNgoiDao {
	private EntityManager em;

    public ChoNgoiDao(EntityManagerFactory emf) {
        em = emf.createEntityManager();
    }
	    
	//  lấy Chỗ ngồi bằng mã
	  public ChoNgoi getChoNgoiByMa(String ma) {
	  	return em.find(ChoNgoi.class, ma);
	  }
	//lấy toàn bộ danh sách Chỗ ngồi
	public List<ChoNgoi> getAllChoNgoi(){
		return em.createNamedQuery("ChoNgoi.findAll", ChoNgoi.class).getResultList();
	}
	
	
//	Lấy danh sách ghế còn trống
	public List<ChoNgoi> getAllChoNgoiTrong(int id1, int id2, boolean chieu) {
	    String jpql = "SELECT c FROM ChoNgoi c " +
	                  "WHERE c.maChoNgoi NOT IN (" +
	                  "    SELECT v.choNgoi.maChoNgoi " +
	                  "    FROM Ve v " +
	                  "    JOIN v.lisChiTietVes ctv " +
	                  "    WHERE v.chuyen.maChuyen = :maChuyen " +
	                  "    GROUP BY v.choNgoi.maChoNgoi " +
	                  "    HAVING " +
	                  "    MAX(CASE WHEN ctv.chieu = :chieuParam THEN ctv.ga.id END) = :id1Param " +
	                  "    OR " +
	                  "    (MAX(CASE WHEN ctv.chieu = :chieuParam THEN ctv.ga.id END) < :id1Param " +
	                  "    AND MAX(CASE WHEN ctv.chieu = :chieuOpposite THEN ctv.ga.id END) > :id1Param) " +
	                  "    OR " +
	                  "    (MAX(CASE WHEN ctv.chieu = :chieuParam THEN ctv.ga.id END) < :id2Param " +
	                  "    AND MAX(CASE WHEN ctv.chieu = :chieuOpposite THEN ctv.ga.id END) > :id2Param) " +
	                  "    OR " +
	                  "    (MAX(CASE WHEN ctv.chieu = :chieuParam THEN ctv.ga.id END) > :id1Param " +
	                  "    AND MAX(CASE WHEN ctv.chieu = :chieuOpposite THEN ctv.ga.id END) < :id2Param)" +
	                  ")";

	    List<ChoNgoi> results = em.createQuery(jpql, ChoNgoi.class)
	            .setParameter("maChuyen", "SE01123012052024BN")
	            .setParameter("chieuParam", chieu ? true : false)
	            .setParameter("chieuOpposite", chieu ? false : true)
	            .setParameter("id1Param", id1)
	            .setParameter("id2Param", id2)
	            .getResultList();

	    return results;
	}
	
}
