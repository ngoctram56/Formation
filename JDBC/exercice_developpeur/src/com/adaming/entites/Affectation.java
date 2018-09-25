package com.adaming.entites;

public class Affectation {
	
	private int id_affectation ;
	private Projet projets ;
	private Developpeur developpeurs ;
	private int duree ;
	
	
	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Affectation(int id_affectation, Projet projets, Developpeur developpeurs, int duree) {
		super();
		this.id_affectation = id_affectation;
		this.projets = projets;
		this.developpeurs = developpeurs;
		this.duree = duree;
	}
	
	 
	
	


	public Affectation(Projet projets, Developpeur developpeurs, int duree) {
		super();
		this.projets = projets;
		this.developpeurs = developpeurs;
		this.duree = duree;
	}


	public int getId_affectation() {
		return id_affectation;
	}


	public void setId_affectation(int id_affectation) {
		this.id_affectation = id_affectation;
	}


	public Projet getProjets() {
		return projets;
	}


	public void setProjets(Projet projets) {
		this.projets = projets;
	}


	public Developpeur getDeveloppeurs() {
		return developpeurs;
	}


	public void setDeveloppeurs(Developpeur developpeurs) {
		this.developpeurs = developpeurs;
	}


	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}


	@Override
	public String toString() {
		return "Affectation [id_affectation=" + id_affectation + ", projets=" + projets + ", developpeurs="
				+ developpeurs + ", duree=" + duree + "]";
	}
	
	
	

}
