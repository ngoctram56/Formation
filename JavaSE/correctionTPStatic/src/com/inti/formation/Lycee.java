package com.inti.formation;

public class Lycee {
		//Attributs
	String designation;
	String ville;
	static int nbrLycee=0;
	public Lycee() {
		super();
		nbrLycee++;
	}
	public Lycee(String designation, String ville) {
		super();
		this.designation = designation;
		this.ville = ville;
		nbrLycee++;
	}
	@Override
	public String toString() {
		return "Lycee [designation=" + designation + ", ville=" + ville + "]";
	}
	
}
