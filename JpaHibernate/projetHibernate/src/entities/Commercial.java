package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Commercial extends Personne implements Serializable{

	
	private String nom ;
	private String prenom ;
	
	@OneToMany (mappedBy="commercial")
	List<Facture> liste = new ArrayList<>() ;
	
	public Commercial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commercial(Date dateCreation) {
		super(dateCreation);
		// TODO Auto-generated constructor stub
	}
	public Commercial(Long id, Date dateCreation) {
		super(id, dateCreation);
		// TODO Auto-generated constructor stub
	}
	public Commercial(Date dateCreation, String nom, String prenom) {
		super(dateCreation);
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
		return "Commercial [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateCreation=" + dateCreation + "]";
	}
	
	
	
	

}
