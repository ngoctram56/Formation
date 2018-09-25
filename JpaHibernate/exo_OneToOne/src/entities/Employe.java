package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="t_employe")
public class Employe implements Serializable {
	
	@Id
	@GeneratedValue
	private Long matricule ;
	private String nom ;
	private String prenom ;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="adresse")
	private Adresse adresse ;
	@ManyToOne (cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Societe societe ;
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}



	


	public Employe(Long matricule, String nom, String prenom, Adresse adresse, Societe societe) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.societe = societe;
	}






	public Employe(String nom, String prenom, Adresse adresse, Societe societe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.societe = societe;
	}


	public Long getMatricule() {
		return matricule;
	}


	public void setMatricule(Long matricule) {
		this.matricule = matricule;
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


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	


	public Societe getSociete() {
		return societe;
	}



	public void setSociete(Societe societe) {
		this.societe = societe;
	}






	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", societe=" + societe + "]";
	}






	
	
	

}
