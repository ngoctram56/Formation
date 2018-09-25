package Run;
import modele.*;

public class TestMain {

	public static void main(String[] args) {
		
		
		ProduitFini PF1 = new ProduitFini("id1", "designation1", 10d, "emballage1");
		MatierePremiere MP1 = new MatierePremiere("id3", "designation3", 5d); 
		
		ProduitFini PF2 = new ProduitFini("id2", "designation2", 20d, "emballage2");
		MatierePremiere MP2 = new MatierePremiere("id4", "designation4", 4d); 
		
		Article[] article1 = {PF1, MP1} ;
		Article [] article2= {PF2, MP2} ;
		
		Facture F1 = new Facture(1, 2010, article1, 12d) ;
		BonCommande BC1 = new BonCommande(1, 2010, article1);
		
		Facture F2 = new Facture(2, 2010, article2, 20d) ;
		BonCommande BC2 = new BonCommande(2, 2010, article2);
		
		System.out.println(PF2.calculPrixVente());
		System.out.println(F1.calculTotal());
		System.out.println(BC1.calculTotal());
		System.out.println(F1.getNum());
		
		
		
		
		
	

	}

}
