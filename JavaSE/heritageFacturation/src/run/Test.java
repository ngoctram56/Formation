package run;

import modele.Article;
import modele.BonCommande;
import modele.Facture;
import modele.MatierePremiere;
import modele.ProduitFini;

public class Test {
	public static void main(String[] args) {

		Article[] tabArticles = { new MatierePremiere(12l, "designation mp", 12.53),
				new ProduitFini(15l, "designation pf ", 51.26, "N") };
		Article[] tabArticles2 = { new MatierePremiere(122l, "designation mp2", 122.53),
				new ProduitFini(152l, "designation pf2 ", 251.26, "N2") };
		
		
		Facture fact=new Facture(12l, 2018, tabArticles, 15);
		BonCommande bc=new BonCommande(13l, 2018, tabArticles2);
		
		
		
		System.out.println(fact.calculTotal());
		System.out.println(bc.calculTotal());

	}
}
