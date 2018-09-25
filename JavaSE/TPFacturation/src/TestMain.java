
public class TestMain {

	public static void main(String[] args) {

		Adresse a1 = new Adresse(5, "rue1", "ville1");
		Adresse a2 = new Adresse(6, "rue2", "ville2");

		Client c1 = new Client(123, a1);
		Client c2 = new Client(456, a2);

		Article ar1 = new Article(111d, "libelle1", 1.1d);
		Article ar2 = new Article(222d, "libelle2", 2.2d);

		Article[] article1 = { ar1, ar2 };
		Article[] article2 = { ar1, ar2, ar1 };

		Facture f1 = new Facture(1, c1, article1, 8.8d, 7.7d, 1.8d);
		Facture f2 = new Facture(2, c2, article2, 8.9d, 7.97d, 1.9d);

		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println("Nombre d'article : " +Article.nbArticle);
		
		System.out.println("La somme est de " +Utilitaire.sommePrixHT(article1));
		
		Utilitaire.afficher(article1);
		
		System.out.println("Prix TTC :" +f1.prixTTC());
		
	

	}

}
