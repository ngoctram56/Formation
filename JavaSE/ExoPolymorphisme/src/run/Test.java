package run;

import java.util.Scanner;

import model.Client;
import model.Compte;
import model.Courant;
import model.Epargne;
import model.PersonneMorale;
import model.PersonnePhysique;

public class Test {

	public static void main(String[] args) {

		PersonnePhysique cl1 = new PersonnePhysique(1l, "adresse1", "nom1", "prenom1");
		Client cl2 = new PersonnePhysique(2l, "adresse2", "nom2", "prenom2");

		PersonneMorale cl3 = new PersonneMorale(3l, "adresse3", "raisonSociale3");
		PersonneMorale cl4 = new PersonneMorale(4l, "adresse4", "raisonSociale4");

		Double[] tab1 = { -7d, 50d, 33d };

		Courant cc1 = new Courant("1", tab1, cl1, 5);
		Epargne ce1 = new Epargne("2", tab1, cl2, 10);

		Compte[] tabComptes = { cc1, ce1 };

		// for (int i = 0; i < tabComptes.length; i++) {
		// tabComptes[i].afficherDetails();
		// if (tabComptes[i] instanceof Epargne) {
		// Epargne compt=(Epargne)tabComptes[i];
		// System.out.println("solde brut:"+compt.calculSoldeBrut());
		// System.out.println("solde avec bonus:"+compt.calculSoldeBonus());
		// }
		// else if (tabComptes[i] instanceof Courant) {
		// Courant compt=(Courant)tabComptes[i];
		// System.out.println("solde"+compt.calculSolde());
		// }
		// }
		//
		//
		Long id = 0l;
		 
			System.out.println("\nVeuillez saisir votre id client");
			Scanner sc = new Scanner(System.in);

			id = sc.nextLong();
			double a = 0;
			for (int i = 0; i < tabComptes.length; i++) {


				if (tabComptes[i].getClient().getId() == id) {
					tabComptes[i].afficherDetails();
					if (tabComptes[i] instanceof Epargne) {
						Epargne compt = (Epargne) tabComptes[i];
						System.out.println("solde brut:" + compt.calculSoldeBrut());
						System.out.println("solde avec bonus:" + compt.calculSoldeBonus());
						a++;
					} else if (tabComptes[i] instanceof Courant) {
						Courant compt = (Courant) tabComptes[i];
						System.out.println("solde:" + compt.calculSolde());
						a++;
					}

					break;
				}
			}

			if (a == 0) {
				System.out.println("id invalide");

			}

		}

	 
}
