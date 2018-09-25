package utils;

import modele.Article;

public class Utilitaire {

	//Factorisation de la partie commune dans calculTotal (facture et bon de commande)
	public static Double calculSommePrixVente(Article[]tab) {
		
		Double r = 0.0 ;
		
		for (int i = 0; i < tab.length; i++) {
			
			r += tab[i].calculPrixVente() ;
			
		}
		
		return r ;
	}

}
