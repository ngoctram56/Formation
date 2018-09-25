package modele;

import utils.Utilitaire;

public final class BonCommande extends DocumentVente {

	public BonCommande() {
		super();
 	}

	public BonCommande(Long num, int annee, Article[] articles) {
		super(num, annee, articles);
 	}

	@Override
	public Double calculTotal() {
		 
		return Utilitaire.calculSommePrixVente(articles);
	}

}
