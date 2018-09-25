package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Consultant implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id ;
	private String nom ;
	private String prenom ;
	@OneToMany (mappedBy="consultant")
	List<ProjetConsultatnt> liste= new ArrayList<>() ;
	
	
	public Consultant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Consultant(Long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}


	public Consultant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Consultant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	

}
