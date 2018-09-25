package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employe {
	
	@Id
	@GeneratedValue
	private Long id ;
	private String nom ;
	private String prenom ;
	private Double salaireMensuel ;
	@ManyToOne
	private Entreprise entreprise ;
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employe(Long id, String nom, String prenom, Double salaireMensuel, Entreprise entreprise) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaireMensuel = salaireMensuel;
		this.entreprise = entreprise;
	}


	public Employe(String nom, String prenom, Double salaireMensuel, Entreprise entreprise) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaireMensuel = salaireMensuel;
		this.entreprise = entreprise;
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


	public Double getSalaireMensuel() {
		return salaireMensuel;
	}


	public void setSalaireMensuel(Double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}


	public Entreprise getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", salaireMensuel=" + salaireMensuel
				+ ", entreprise=" + entreprise + "]";
	} 
	
	
	
	
	
	
	

}
