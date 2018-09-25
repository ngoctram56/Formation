package com.inti.formation;


public class Employe {

	String nom;
	String prenom;
	Adresse adresse;
	boolean majeur;
	Double salaireBrut;
	double anciennete;

	public Employe() {

	}

	public Employe(String nom, String prenom, Adresse adresse, boolean majeur, Double salaireBrut, double anciennete) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.majeur = majeur;
		this.salaireBrut = salaireBrut;
		this.anciennete = anciennete;
	}
	
	public String toString () {
		
		return nom+ " "+prenom + " " +adresse + " "+majeur +" " +salaireBrut + " " +anciennete;
	}

	double calculSalaireNet(int taxe) {
		return salaireBrut - (salaireBrut * taxe / 100);
	}
}
