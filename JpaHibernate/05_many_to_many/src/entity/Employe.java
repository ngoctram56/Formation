package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYE")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID")
	private long id;

	@Column(name = "nom", nullable = false)
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "affectation", joinColumns = @JoinColumn(name = "employe"), inverseJoinColumns = @JoinColumn(name = "departement")) // pour
	 private List<Departement> departments;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(long id, String nom, String prenom, List<Departement> departments) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.departments = departments;
	}

	public Employe(String nom, String prenom, List<Departement> departments) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.departments = departments;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public List<Departement> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Departement> departments) {
		this.departments = departments;
	}

}
