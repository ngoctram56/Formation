package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_emp")
public class Employe extends Personne implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id_emp ;
	private double salaire ;
	
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String nom, String prenom, Integer age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Employe(String nom, String prenom, Integer age, double salaire) {
		super(nom, prenom, age);
		this.salaire = salaire;
	}
	

	public Employe(String nom, String prenom, Integer age, Long id_emp, double salaire) {
		super(nom, prenom, age);
		this.id_emp = id_emp;
		this.salaire = salaire;
	}
	public Long getId_emp() {
		return id_emp;
	}
	public void setId_emp(Long id_emp) {
		this.id_emp = id_emp;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return "Employe [id_emp=" + id_emp + ", salaire=" + salaire + "]";
	}
	
	
	
	
	
	

}
