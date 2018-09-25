package exempleConstructeur;

public class TestEmploye {

	public static void main(String[] args) {

		// creation du tableau employe
		Adresse ad1 = new Adresse(4, "rue1", "ville1", 1);
		Employe e1 = new Employe("nom1", "prenom1", ad1, false, 3400d, 5);
		// on peut faire new Adresse à la place de ad1
		
		Adresse ad2 = new Adresse(5, "rue2", "ville2", 2);
		Employe e2 = new Employe("nom2", "prenom2", ad2, false, 3700d, 9);

		Employe[] tab = { e1, e2 };

		// creation du tableau salaire net
		double s1 = e1.calculSalaireNet(20);
		double s2 = e2.calculSalaireNet(0);

		double[] salaireNet = { s1, s2 };
		//tab[i].calculSalaireNet(10) 

		// methode pour calculer le nombre d'employe majeur et salaire net >2000 +
		// ancienneté compris entre 3 et 13

		int nombreEmploye = 0;
		int nbSalaire = 0;

		for (int i = 0; i < tab.length; i++) {

			if (tab[i].majeur) {

				nombreEmploye += 1; //ou nombreEmploye++

			}

			if (salaireNet[i] > 2000 && tab[i].anciennete >= 3 && tab[i].anciennete <= 13) {

				nbSalaire += 1;

			}

		}

		System.out.println("Le nombre d'employe majeur est " + nombreEmploye);
		System.out.println("Le nombre de salarié est " + nbSalaire);
	}

}
