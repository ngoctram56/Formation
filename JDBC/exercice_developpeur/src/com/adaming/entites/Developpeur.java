package com.adaming.entites;

public class Developpeur {
	
	private int id_dev ;
	private String nom ;
	private String prenom ;
	private int horaire ;
	private Equipe equipes ;
	
	
	public Developpeur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Developpeur(int id_dev, String nom, String prenom, int horaire, Equipe equipes) {
		super();
		this.id_dev = id_dev;
		this.nom = nom;
		this.prenom = prenom;
		this.horaire = horaire;
		this.equipes = equipes;
	}


	public Developpeur(String nom, String prenom, int horaire, Equipe equipes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.horaire = horaire;
		this.equipes = equipes;
	}


	public int getId_dev() {
		return id_dev;
	}


	public void setId_dev(int id_dev) {
		this.id_dev = id_dev;
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


	public int getHoraire() {
		return horaire;
	}


	public void setHoraire(int horaire) {
		this.horaire = horaire;
	}


	public Equipe getEquipes() {
		return equipes;
	}


	public void setEquipes(Equipe equipes) {
		this.equipes = equipes;
	}


	@Override
	public String toString() {
		return "developpeur [id_dev=" + id_dev + ", nom=" + nom + ", prenom=" + prenom + ", horaire=" + horaire
				+ ", equipes=" + equipes + "]";
	}
	
	
	
	

}
