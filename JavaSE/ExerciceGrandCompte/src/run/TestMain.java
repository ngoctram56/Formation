package run;

import modele.Client;
import modele.Compte;
import modele.Courant;
import modele.Epargne;
import modele.PersonneMorale;
import modele.PersonnePhysique;
import modele.Utilitaire;

public class TestMain {

	public static void main(String[] args) {

		// Creation des clients
		Client client1 = new PersonneMorale(0, "Nantes", "CreditAgricole");
		Client client2 = new PersonneMorale(1, "Angers", "CaisseEpargne");

		Client client3 = new PersonnePhysique(2, "Laval", "Chauvel", "Maxime");
		Client client4 = new PersonnePhysique(3, "Rennes", "Dupond", "Bastien");

		// Creation des transactions
		Double[] tabTransactions1 = new Double[5];
		tabTransactions1[0] = 50d;
		tabTransactions1[1] = -40d;
		tabTransactions1[2] = 20d;
		tabTransactions1[3] = 100d;
		tabTransactions1[4] = -150d;

		Double[] tabTransactions2 = new Double[5];
		tabTransactions2[0] = 20d;
		tabTransactions2[1] = -30d;
		tabTransactions2[2] = 50d;
		tabTransactions2[3] = 200d;
		tabTransactions2[4] = -150d;

		// Creation des comptes
		Compte c1 = new Epargne(0, tabTransactions1, client1, 200d);
		Compte c2 = new Epargne(1, tabTransactions2, client2, 400d);
		Compte c3 = new Courant(2, tabTransactions1, client3, 100d);
		Compte c4 = new Courant(3, tabTransactions2, client4, 50d);

		// Creation du tableau de comptes
		Compte[] tabComptes = new Compte[4];
		tabComptes[0] = c1;
		tabComptes[1] = c2;
		tabComptes[2] = c3;
		tabComptes[3] = c4;

		// Parcours du tableau
		Utilitaire.parcourirTableauComptes(tabComptes);

		// Lecture de l'id
		Utilitaire.lireClientCompte(tabComptes);
	}

}
