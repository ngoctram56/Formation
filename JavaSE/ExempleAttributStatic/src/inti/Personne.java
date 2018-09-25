package inti;

public class Personne {
	// variables d instances
	String nom;
	String prenom;
	// variable de classe
	static int nbrPersonnes = 0;

	public Personne() {
		super();
		nbrPersonnes++;
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		nbrPersonnes++;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
