package exempleMethStatic;

public class Utilitaire {

	// retourne la somme du tableau

	static int sommeTab(int[] tab) {

		int somme = 0;

		for (int i = 0; i < tab.length; i++) {

			somme = somme + tab[i];
		}
		return somme;

	}

	// afficher tableau

	static void afficher(String[] tab) {

		for (int i = 0; i < tab.length; i++) {

			System.out.println(tab[i]);

		}

	}
}
