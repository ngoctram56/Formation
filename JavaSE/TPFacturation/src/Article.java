
public class Article {

	double code;
	String libelle;
	double prixHT;
	static int nbArticle =0 ; 

	public Article() {
		super();
		nbArticle++; 

	}

	public Article(double code, String libelle, double prixHT) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.prixHT = prixHT;
		
		nbArticle ++;
		
	}
			
		

	@Override
	public String toString() {
		return "Article [code=" + code + ", libelle=" + libelle + ", prixHT=" + prixHT + "]";
	}
	
	

}
