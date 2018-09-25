package run;

import modele.Etudiant;

public class TestEtudiant {

	public static void main(String[] args) {

		double[] n1 = { 5, 6, 7 };
		double[] n2 = { 8, 9, 17 };

		Etudiant e1 = new Etudiant("matricule1", 23, n1);
		Etudiant e2 = new Etudiant("matricule2", 13, n2);

		Etudiant[] etudiant = { e1, e2 };

		// Affichage du tableau etudiant

		for (int i = 0; i < etudiant.length; i++) {

			if (etudiant[i].getAge() >= 18) {

				etudiant[i].setMajeur(true);

			}

			else {
				etudiant[i].setMajeur(false);

			}

			if (etudiant[i].moyenne() >= 10) {

				etudiant[i].setAdmis(true);

			}

			else {
				etudiant[i].setAdmis(false);
			}

		}

		Etudiant.afficher(etudiant);

	}
}
