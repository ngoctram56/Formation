package modele;
import modele.Article;
import modele.DocuementVente;
import modele.Facture;
import modele.MatierePremiere;
import modele.ProduitFini;
import modele.BonCommande;

public class TestMain {

	public static void main(String[] args) {
		
		
		ProduitFini PF1 = new ProduitFini("id1", "designation1", 10d, "emballage1");
		MatierePremiere MP1 = new MatierePremiere("id3", "designation3", 5d); 
		
		ProduitFini PF2 = new ProduitFini("id2", "designation2", 20d, "emballage2");
		MatierePremiere MP2 = new MatierePremiere("id4", "designation4", 4d); 
		
		Article[] article1 = {PF1,PF2, MP1, MP2} ;
		Article [] article2= {PF1} ;
		
		Facture F1 = new Facture(1, 2010, article1, 12d) ;
		
		BonCommande BC1 = new BonCommande(1, 2010, article2);
		
		System.out.println(PF1.calculPrixVente());
		System.out.println(F1.calculTotal());
		
		
		
	

	}

}
