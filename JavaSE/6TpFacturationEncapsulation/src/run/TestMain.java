package run;

import inti.Adresse;
import inti.Article;
import inti.Client;
import inti.Facture;
import inti.Utilitaire;

public class TestMain {

	public static void main(String[] args) {

		Adresse ad1 = new Adresse(1,"rue1", "ville1");
		Adresse ad2 = new Adresse(2,"rue2", "ville2");
		Adresse ad3 = new Adresse(3,"rue3", "ville3");
		Adresse ad4 = new Adresse(4,"rue4", "ville4");
		
		Client c1 = new Client("SAS",ad1);
		Client c2 = new Client("SA",ad2);
		
		Article a1 = new Article(1l, "libelle1", 10d);
		Article a2 = new Article(2l, "libelle2", 20d);
		Article a3 = new Article(3l, "libelle3", 33d);
		Article a4 = new Article(4l, "libelle4", 44d);
		
		Article[] t1= {a1,a2};
		Article[] t2= {a1,a3};
		
		
		Facture f1 = new Facture(1l, c1, t1, 10d, 1d, 4.1d);
		Facture f2 = new Facture(2l, c2, t2, 25d, 2d, 4.2d);
		Facture f3 = new Facture(3l, c2, t1, 35d, 1.5d, 4.6d);
		
		System.out.println(f1);
		
		System.out.println(Article.nbarticle);
		
		System.out.println(Utilitaire.calculSomme(t1));//méthode statique
		System.out.println(Utilitaire.calculSomme(t2));
		
		Utilitaire.show(t1);
		
		System.out.println(f1.prixTTC());//méthode non statique
		f1.show();
	}
}
