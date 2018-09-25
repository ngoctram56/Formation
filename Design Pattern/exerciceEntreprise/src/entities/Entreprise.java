package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Entreprise {
	
	@Id
	@GeneratedValue
	private Long id ;
	private String designation ;
	private String adresse ;
	@OneToMany(mappedBy="entreprise")
	List<Employe> liste = new ArrayList<>() ;
	
	
	
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Entreprise(Long id, String designation, String adresse) {
		super();
		this.id = id;
		this.designation = designation;
		this.adresse = adresse;
	}



	public Entreprise(String designation, String adresse) {
		super();
		this.designation = designation;
		this.adresse = adresse;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public List<Employe> getListe() {
		return liste;
	}



	public void setListe(List<Employe> liste) {
		this.liste = liste;
	}



	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", designation=" + designation + ", adresse=" + adresse + "]";
	}





	
	
	
	
	
	
	

}

