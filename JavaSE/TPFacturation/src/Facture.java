import java.util.Arrays;

public class Facture {

	int num ;
	Client client ; 
	Article [] article ;
	double tva ;
	double timbre ;
	double fraisport ;
	
	
	public Facture() {
		super();
		
	}


	public Facture(int num, Client client, Article[] article,
			double tva, double timbre, double fraisport) {
		super();
		this.num = num;
		this.client = client;
		this.article = article;
		this.tva = tva;
		this.timbre = timbre;
		this.fraisport = fraisport ;
		
	}
		
		//calcul TTC
		
		
		double prixTTC () {
			
			return Utilitaire.sommePrixHT(article) + tva + timbre + fraisport;
			
		}
		
		//afficher liste d'article
		
		void afficheArticle () {
			Utilitaire.afficher(article);
		}


	@Override
	public String toString() {
		return "Facture [num=" + num + ", client=" + client + ", article=" + Arrays.toString(article) + ", tva=" + tva
				+ ", timbre=" + timbre + ", fraisport=" + fraisport + "]";
	}
	
	
	
	
}
