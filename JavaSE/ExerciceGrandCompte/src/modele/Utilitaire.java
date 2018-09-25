package modele;

import java.util.Scanner;

public class Utilitaire {

	public static Double calculSommeTableau(Double[] tab) {
		Double somme = 0d;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme;
	}

	public static void parcourirTableauComptes(Compte[] tab) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] instanceof Epargne) {
				((Epargne) tab[i]).afficherDetails();
				System.out.println("Solde brut du compte: " + ((Epargne) tab[i]).calculSoldeBrut());
				System.out.println("Solde avec bonus du compte: " + ((Epargne) tab[i]).calculSoldeAvecBonus());
				System.out.println("\n");
			}
			if (tab[i] instanceof Courant) {
				((Courant) tab[i]).afficherDetails();
				System.out.println("Solde du compte: " + ((Courant) tab[i]).calculSolde());
				System.out.println("\n");
			}
		}
	}

	public static void lireClientCompte(Compte[] tab) {
		Integer id;
		Scanner sc = new Scanner(System.in);
		 Boolean trouve = false;
		System.out.println("Veuillez rentrer l'id du client.");
		id = sc.nextInt();

		for (int i = 0; i < tab.length; i++) {
			if (tab[i].client.id == id) {
				 trouve = true;
				tab[i].afficherDetails();
				if (tab[i] instanceof Epargne) {
					System.out.println("Solde brut du compte: " + ((Epargne) tab[i]).calculSoldeBrut());
					System.out.println("Solde avec bonus du compte: " + ((Epargne) tab[i]).calculSoldeAvecBonus());
					System.out.println("\n");
				}
				if (tab[i] instanceof Courant) {
					System.out.println("Solde du compte: " + ((Courant) tab[i]).calculSolde());
					System.out.println("\n");
				}
			}  
		}
		 if (!trouve) {
		 System.out.println("Le numero client ne correspond pas");
		 }
		sc.close();
	}
}
