package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class ChiTietVe {
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MaVe")
	private Ve ve;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TenGa")
	private Ga ga;
	
	@Column(name = "Chieu")
	private boolean chieu;
	
}
