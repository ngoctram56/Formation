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
public class Utilisateur {
	
	@Id
	@GeneratedValue
	private Long id ;
	
	private String nom ;
	private String prenom ;
	
	@OneToMany (mappedBy="utilisateur")
	List<RoleUtilisateur> liste = new ArrayList<>() ;
	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Utilisateur(String nom, String prenom) {
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
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
	
	
	

}
