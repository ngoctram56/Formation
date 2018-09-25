package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_etudiant")
public class Etudiant extends Personne implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id_etu ;
	private Double moyenne ;
	
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Etudiant(String nom, String prenom, Integer age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}

	
	
	

	public Etudiant(String nom, String prenom, Integer age, Long id_etu, Double moyenne) {
		super(nom, prenom, age);
		this.id_etu = id_etu;
		this.moyenne = moyenne;
	}
	
	


	public Etudiant(String nom, String prenom, Integer age,  Double moyenne) {
		super(nom, prenom, age);
		this.moyenne = moyenne;
	}


	public Long getId_etu() {
		return id_etu;
	}


	public void setId_etu(Long id_etu) {
		this.id_etu = id_etu;
	}


	public Double getMoyenne() {
		return moyenne;
	}


	public void setMoyenne(Double moyenne) {
		this.moyenne = moyenne;
	}


	@Override
	public String toString() {
		return "Etudiant [id_etu=" + id_etu + ", moyenne=" + moyenne + "]";
	}
	
	
	
	
	
	

}
