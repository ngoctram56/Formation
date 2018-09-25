
public class Utilitaire {

	// retourne la somme des prix

	static double sommePrixHT(Article[] tab) {

		double sommePrix = 0;

		for (int i = 0; i < tab.length; i++) {
			

			sommePrix = sommePrix + tab[i].prixHT;
		}
		
		return sommePrix;

	}
	
	//afficher les elements d'un tableau
	
	static void afficher(Article[] tab) {

		for (int i = 0; i < tab.length; i++) {

			System.out.println(tab[i]);

		}

	}

}
	
