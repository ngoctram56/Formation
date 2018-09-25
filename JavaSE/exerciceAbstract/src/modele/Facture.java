package modele;

import java.util.Arrays;

import utils.Utilitaire;

public final class Facture extends DocumentVente{
	
	protected double tva ;
	
	
	
	

	public Facture() {
		super();
	
	}


	public Facture(int num, int annee, Article[] article, double tva) {
		super(num, annee, article);
		this.tva = tva;
	}



	public double getTva() {
		return tva;
	}




	public void setTva(double tva) {
		this.tva = tva;
	}




	@Override
	public String toString() {
		return "Facture [tva=" + tva + ", num=" + num + ", annee=" + annee + ", article=" + Arrays.toString(article)
				+ "]";
	}


	@Override
	public double calculTotal() {
//	Double somme = 0d ; // Double s = new Double (0,0);
//	
//		
//		for (int i = 0; i < article.length; i++) {
//			
//			
//			// s += article[i].calculPrixVente() ;
//			somme = somme + article[i].calculPrixVente() ;
//			
//		}
//	
//		return somme + tva ;
		
		Double s = Utilitaire.calculSommePrixVente(article) ;
		s = s+s*tva/100 ;
		return s ;
		
	}

	
	}



	
