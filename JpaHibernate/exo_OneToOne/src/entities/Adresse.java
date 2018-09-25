package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adresse implements Serializable {

	@Id
	@GeneratedValue
	private Long id ;
	private int num ; 
	private String adresse ;
	private String ville ;
	@OneToOne(mappedBy ="adresse")
	 private Employe emp ;
	
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Adresse(Long id, int num, String adresse, String ville) {
		super();
		this.id = id;
		this.num = num;
		this.adresse = adresse;
		this.ville = ville;
	}

	

	public Adresse(int num, String adresse, String ville) {
		super();
		this.num = num;
		this.adresse = adresse;
		this.ville = ville;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Adresse [id=" + id + ", num=" + num + ", adresse=" + adresse + ", ville=" + ville + "]";
	}


	public Employe getEmp() {
		return emp;
	}


	public void setEmp(Employe emp) {
		this.emp = emp;
	}
	
	
	
	
	
}
