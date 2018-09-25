package run;

import java.util.Scanner;

import modele.*;

public class TestClient {

	public static void main(String[] args) {

		Client c1 = new Client(1L, "adresse1");
		Client c2 = new Client(2L, "adresse2");

		Double[] tr1 = { 10d, 20d };
		Double[] tr2 = { -10d, 50d };

		Compte cp1 = new Compte(11L, tr1, c1);
		Compte cp2 = new Compte(22L, tr2, c2);

		Compte epa1 = new Epargne(111l, tr1, c1, 10d);

		Compte cr2 = new Courant(222L, tr2, c2, 20d);

		// Creation d'un tableau de compte
		Compte[] comptes = { cp1, cp2, epa1, cr2 };

		for (int i = 0; i < comptes.length; i++) {

			comptes[i].afficheDetail();

			if (comptes[i] instanceof Epargne) {

				System.out.println(((Epargne) comptes[i]).calculSoldeAvecBonus());
				System.out.println(((Epargne) comptes[i]).calculSoldeBrut());

			}

			if (comptes[i] instanceof Courant) {

				System.out.println(((Courant) comptes[i]).calculSolde());

			}

		}

		// Saisie du clavier

		System.out.println("Veuillez saisir votre id : ");
		Scanner sc = new Scanner(System.in);
		Long idsc = sc.nextLong();
		
		Compte compteVide = new Compte() ;

		for (int j = 0; j < comptes.length; j++) {
	


			if (idsc.equals(comptes[j].getClient().getId())) {
				
				
				compteVide = comptes[j] ;
				comptes[j].afficheDetail();
				

				if (comptes[j] instanceof Epargne) {

					System.out.println(((Epargne) comptes[j]).calculSoldeAvecBonus());
					System.out.println(((Epargne) comptes[j]).calculSoldeBrut());

				}

				if (comptes[j] instanceof Courant) {

					System.out.println(((Courant) comptes[j]).calculSolde());

				}

			}
			
	

			} System.out.println(compteVide);

		}

	

}
