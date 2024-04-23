package model;

import java.time.Duration;

import entity.ChoNgoi;
import entity.Chuyen;

public class Model_InfoVe {
	private Model_Tau chuyen;
	private ChoNgoi choNgoi;
	
	public Model_InfoVe(Model_Tau chuyen, ChoNgoi choNgoi) {
		super();
		this.chuyen = chuyen;
		this.choNgoi = choNgoi;
	}
	public Model_Tau getChuyen() {
		return chuyen;
	}
	public void setChuyen(Model_Tau chuyen) {
		this.chuyen = chuyen;
	}
	public ChoNgoi getChoNgoi() {
		return choNgoi;
	}
	public void setChoNgoi(ChoNgoi choNgoi) {
		this.choNgoi = choNgoi;
	}
	@Override
	public String toString() {
		return chuyen.getMaTau()+" "+chuyen.getChuyen().getTenCHuyen();
	}
	
	
	
}
