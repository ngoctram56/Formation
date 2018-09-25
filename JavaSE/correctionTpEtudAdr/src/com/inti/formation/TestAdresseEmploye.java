package com.inti.formation;


public class TestAdresseEmploye {

	public static void main(String[] args) {
		Adresse adresse1 = new Adresse(10, "rue1", "ville1", 86000);
		Employe employe1 = new Employe("nom1", "prenom1", adresse1, true, 1900d, 2);

		Adresse adresse2 = new Adresse(4, "rue2", "ville2", 44000);
		Employe employe2 = new Employe("nom2", "prenom2", adresse2, true, 3000d, 10);

		Adresse adresse3 = new Adresse(25, "rue3", "ville3", 95000);
		Employe employe3 = new Employe("nom3", "prenom3", adresse3, false, 1500d, 6);

		Employe[] tabEmploye = { employe1, employe2, employe3 };

		System.out.println(tabEmploye[0].adresse.rue);
		
		System.out.println(adresse1);
		System.out.println(employe2);

		int count = 0;
		int count2 = 0;
		for (int i = 0; i < tabEmploye.length; i++) {
			if (tabEmploye[i].majeur) {
				count ++;

			}

			if (tabEmploye[i].calculSalaireNet(10) > 2000 && tabEmploye[i].anciennete >= 3 && tabEmploye[i].anciennete <= 13) {
				count2 ++;

			}
		}
		System.out.println(count + " employés sont majeurs");
		System.out.println(count2 + " employés ont un salaire net > 2000 et une ancienneté comprise entre 3 et 13");

	}

}
