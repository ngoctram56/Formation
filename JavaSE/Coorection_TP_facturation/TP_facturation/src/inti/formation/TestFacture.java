package inti.formation;

public class TestFacture {

	public static void main(String[] args) {

		// Création des factures

		Adresse adresse1 = new Adresse(10, "rue1", "ville1");
		Adresse adresse2 = new Adresse(24, "rue2", "ville2");

		Client client1 = new Client("rais1", adresse1);
		Client client2 = new Client("rais2", adresse2);

		Article article1 = new Article(1, "libelle1", 10.2d);
		Article article2 = new Article(2, "libelle2", 5.6d);
		Article article3 = new Article(3, "libelle3", 25d);

		Article[] tabFacture1 = { article1, article2 };
		Article[] tabFacture2 = { article3 };

		Facture facture1 = new Facture(1, client1, tabFacture1, 1.5, 4, 4.5);
		Facture facture2 = new Facture(2, client2, tabFacture2, 1.5, 1, 3.2);

		System.out.println(facture1);
		System.out.println(facture2);

		// Afficher le nombre d'articles:

		System.out.println(Article.nbArticle);

		// Calcul prix TTC

		System.out.println("Le prix TTC de la premiere facture est : " + facture1.calculPrix());

		System.out.println("Le prix TTC de la deuxieme facture est : " + facture2.calculPrix());

		// Affichage de la liste d'article

		 facture1.displayArticles();
		 facture2.displayArticles();

	}

}
