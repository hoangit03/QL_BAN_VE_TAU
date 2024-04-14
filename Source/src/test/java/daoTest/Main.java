package daoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dao.TaiKhoanDao;
import entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



@TestInstance(Lifecycle.PER_CLASS)
public class Main {
	private EntityManagerFactory emf;
	private TaiKhoanDao taiKhoanDao;
	
	@BeforeAll
	void setUp() {
		emf = Persistence.createEntityManagerFactory("SourceMSSQL");
		taiKhoanDao = new TaiKhoanDao(emf);
	}
	
	@Test
	void TestTaiKhoan() {
		TaiKhoan taiKhoan = taiKhoanDao.getTaiKhoanByUserName("21030001");
		assertNotNull(taiKhoan);
		assertEquals(taiKhoan.getMatKhau(), "Passw0rd");
		
		System.out.println(taiKhoan);
	}
	
	void down() {
		emf.close();
	}
}
