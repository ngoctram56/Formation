package com.adaming.entites;

public class Projet {
	
	private int id_projet ;
	private String client ;
	private String libelle ;
	
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Projet(int id_projet, String client, String libelle) {
		super();
		this.id_projet = id_projet;
		this.client = client;
		this.libelle = libelle;
	}


	public Projet(String client, String libelle) {
		super();
		this.client = client;
		this.libelle = libelle;
	}


	public int getId_projet() {
		return id_projet;
	}


	public void setId_projet(int id_projet) {
		this.id_projet = id_projet;
	}


	public String getClient() {
		return client;
	}


	public void setClient(String client) {
		this.client = client;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	@Override
	public String toString() {
		return "Projet [id_projet=" + id_projet + ", client=" + client + ", libelle=" + libelle + "]";
	}
	
	
	
	
	

}
