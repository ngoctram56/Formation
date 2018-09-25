package entites;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonnePK implements Serializable {
	
	private String nom ;
	private String prenom ;
	
	
	public PersonnePK() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PersonnePK(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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
		return "PersonnePK [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
	

}
