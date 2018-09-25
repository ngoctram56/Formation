package first_poo;

public class TestLivre {

	public static void main(String[] args) {

		Livre l1 = new Livre();
		l1.codebarre = "abc";
		l1.titre = "dada";
		l1.auteur = "jiji";
		l1.prix = 3.4;
		l1.quantite = 5;

		Livre l2 = new Livre();
		l2.codebarre = "bc";
		l2.titre = "doda";
		l2.auteur = "liji";
		l2.prix = 6.4;
		l2.quantite = 7;

		Livre l3 = new Livre();
		l3.codebarre = "ac";
		l3.titre = "dadaoo";
		l3.auteur = "lija";
		l3.prix = 8.4;
		l3.quantite = 15;

		Livre[] tab = { l1, l2, l3 };

		for (int i = 0; i < tab.length; i++) {

			System.out.println("L'auteur est : " +tab[i].auteur);
			System.out.println("Le titre est : " +tab[i].titre);
			
			//methode qui return : mettre dans une variable
			double prixL1=l1.calculValeurTotale();
			System.out.println(prixL1);
			
			
			//methode void : on l'appelle directement et elle fait un ttt
			l1.afficherDetail ();

		}

	}

}
