package com.inti;

public class Etudiant {

	Long id;
	String nom;
	String prenom;
	Integer age;
	Double[] notes;
	int abs; // absences

	public Etudiant() {

	}

	public Etudiant(long id, String nom, String prenom, Double[] notes, int age) {

		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.notes = notes;
		this.age = age;
	}

	void afficherDescription() {
		System.out.println("M." + nom + " " + prenom);
	}

	void ajoutAbs(int nbjours) {
		abs += nbjours;
	}

	void suppAbs(int nbjours) {
		abs -= nbjours; // abs=abs-nbjours
	}

	void affichernotes() {
		for (int j = 0; j < notes.length; j++) {
			System.out.println("note" + (j + 1) + ":" + notes[j]);
		}
	}

	double calculmoyenne() {
		double sum = 0;
		for (int i = 0; i < notes.length; i++) {
			sum += notes[i];
		}
		;
		return sum / notes.length;
	}
}
