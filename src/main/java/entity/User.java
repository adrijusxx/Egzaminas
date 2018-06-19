package entity;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class User {
	private int id;
	
	@Pattern(regexp="[A-Za-z0-9 ]{5,15}+", message="Bloga patiekalo grupe!")
	private String patiekaloGrupe;
	
	@Pattern(regexp="[A-Za-z0-9 ]{5,15}+", message="Blogas patiekalo pavadinimas!")
	private String patiekaloPav;
	
	@DecimalMin("0.1")
	@DecimalMax("10000")
	private double kaina;
	
	@DecimalMin("0")
	@DecimalMax("10000")
	private int kalorijuSk;
	
	public User() {
		
	}

	public User(int id, String patiekaloGrupe, String patiekaloPav, int kalorijuSk, double kaina) {
		this.id = id;
		this.patiekaloGrupe = patiekaloGrupe;
		this.patiekaloPav = patiekaloPav;
		this.kalorijuSk = kalorijuSk;
		this.kaina = kaina;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatiekaloGrupe() {
		return patiekaloGrupe;
	}

	public void setPatiekaloGrupe(String patiekaloGrupe) {
		this.patiekaloGrupe = patiekaloGrupe;
	}

	public String getPatiekaloPav() {
		return patiekaloPav;
	}

	public void setPatiekaloPav(String patiekaloPav) {
		this.patiekaloPav = patiekaloPav;
	}

	public double getKaina() {
		return kaina;
	}

	public void setKaina(double kaina) {
		this.kaina = kaina;
	}

	public int getKalorijuSk() {
		return kalorijuSk;
	}

	public void setKalorijuSk(int kalorijuSk) {
		this.kalorijuSk = kalorijuSk;
	}

	
	
}
