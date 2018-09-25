package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="t_employe")
public class Employe {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id ;
	@Column(name="nom_employe", length=50, nullable=false)
	private String nom ;
	private String prenom ;
	@Temporal(value=TemporalType.DATE)
	@Column(name="date_de_naissance")
	private Date dateDeNaissance ;
	@Column(nullable=false)
	private Integer age ;
	
	
	public Employe() {
		super();
	
	}


	public Employe(Long id, String nom, String prenom, Date dateDeNaissance, Integer age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.age = age;
	}


	public Employe(String nom, String prenom, Date dateDeNaissance, Integer age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.age = age;
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


	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
				+ ", age=" + age + "]";
	}
	
	
	
	
	
	
	

}
