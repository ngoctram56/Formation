package com.inti.formation;


public class Adresse {
	int num;
	String rue;
	String ville;
	int cp;

	public Adresse() {

	}

	public Adresse(int num, String rue, String ville, int cp) {
		super();
		this.num = num;
		this.rue = rue;
		this.ville = ville;
		this.cp = cp;
	}
	
	public String toString () {
		
		return num+ " "+ rue + " " +ville + " " +cp; 
	}

}
