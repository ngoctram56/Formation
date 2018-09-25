package modele;

import java.util.Arrays;

import utils.Utilitaire;

public class BonCommande extends DocumentVente {

	public BonCommande() {
		super();

	}
	
	public BonCommande(int num, int annee, Article[] article) { //from superclass car pas d'attributs. Il faut le constructeur ac param
		super();
		this.num = num;
		this.annee = annee;
		this.article = article;
	}
		

	@Override
	public String toString() {
		return "BonCommande [num=" + num + ", annee=" + annee + ", article=" + Arrays.toString(article) + "]";
	}





	@Override
	public double calculTotal() {

		//	Double somme = 0d ; // Double s = new Double (0,0);
	
//		
//		for (int i = 0; i < article.length; i++) {
//			
//			
//			// s += article[i].calculPrixVente() ;
//			somme = somme + article[i].calculPrixVente() ;
//		}
	
		return Utilitaire.calculSommePrixVente(article) ;


	}
	

	
}
