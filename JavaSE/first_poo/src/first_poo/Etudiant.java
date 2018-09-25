package first_poo;

public class Etudiant {

	long id;
	String nom;
	String prenom;
	Integer age;
	double[] notes;
	int nombreAbsences;

	void afficherDescription() {

		System.out.println("L'étudiant s'appelle : " + nom + " " + prenom + "et a " + age);
		System.out.println("son identifiant est le " + id);
	}

	void ajoutAbsences(int nbJours) {

		nombreAbsences += nbJours;

		System.out.println("Etudiant absent :" + nombreAbsences);

	}

	void supprimerAbsences(int nbJours) {

		nombreAbsences -= nbJours;

		System.out.println("Absence de l'étudiant: " + nombreAbsences);

	}

	double calculerMoyenne() {

		double somme = 0;

		for (int i = 0; i < notes.length; i++) {

			somme += notes[i];
		}

		return somme / notes.length;

	}

	void afficherNotes() {

		for (int i = 0; i < notes.length; i++) {

			System.out.println("La note est de " +notes[i]); //"note" + (i+1) + : ":" + notes

		}
	}

}
