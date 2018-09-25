package  entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
 import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_Employe")
public class Employe implements Serializable {

	@Id
	@GeneratedValue
	private Long id_employe;
	@Column(name = "nom_emp")
	private String nom;
	@Column(name = "prenom_emp", length = 155)
	private String prenom;
	@Column(name = "age_emp", nullable = false)
	private int age;

	@OneToOne (cascade = CascadeType.ALL )
	@JoinColumn(name="id_adresse")
	private Adresse adresse;

	/**
	 * 
	 */
	public Employe() {
		super();

	}

	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public Employe(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	/**
	 * @param id_employe
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public Employe(Long id_employe, String nom, String prenom, int age) {
		super();
		this.id_employe = id_employe;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the id_employe
	 */
	public Long getId_employe() {
		return id_employe;
	}

	/**
	 * @param id_employe
	 *            the id_employe to set
	 */
	public void setId_employe(Long id_employe) {
		this.id_employe = id_employe;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employe [id_employe=" + id_employe + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", adresse=" + adresse + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	 

}
