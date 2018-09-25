package inti.formation;

public class Utilitaire {

	// M�thode 1 : calculer la somme des prix d�un tableau d�articles

	static double sommePrixArticle(Article[] tab) {
		double somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i].prixHT;
		}
		return somme;
	}

	// M�thode 2 :afficher les �l�ments d�un tableau d�articles

	static void afficheTab(Article[] tab2) {
		for (int j = 0; j < tab2.length; j++) {

			System.out.println(tab2[j]);
		}

	}
}
