package com.adaming.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "T_Employe", schema = "db_hibernate_annotation")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEmploye;
	@Column(name = "nom_emp", unique = true, length = 254)
	private String nom;
	@Column(name = "prenom_emp", length = 155)
	private String prenom;
 	private int age;
	@Column
	@Temporal(value = TemporalType.DATE)
	private Date dateNaissance;

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
	 * @param idEmploye
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public Employe(Long idEmploye, String nom, String prenom, int age) {
		super();
		this.idEmploye = idEmploye;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	/**
	 * @return the idEmploye
	 */
	public Long getidEmploye() {
		return idEmploye;
	}

	/**
	 * @param idEmploye
	 *            the idEmploye to set
	 */
	public void setidEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
