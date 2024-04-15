package dao;

import java.util.List;

import entity.Ga;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class GaDao {
	private EntityManager em;
	
	public GaDao(EntityManagerFactory emf) {
        em = emf.createEntityManager();
    }
//  lấy toàn bộ danh sách Ga
  public List<Ga> getAllGa(){
  	return em.createNamedQuery("Ga.findAll", Ga.class).getResultList();
  }
  
//  lấy Vé bằng mã
  public Ga getGaByTen(String ten) {
  	return em.find(Ga.class, ten);
  }
}
