package utils;

import modele.Article;

public class Utilitaire {

	public static Double calculSommePrixVente(Article[] tab) {
		Double r = 0.0;

		for (int i = 0; i < tab.length; i++) {
			r+=tab[i].calculPrixVente();
		}
		
		return r;
	}
}
