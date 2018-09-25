package inti.formation;

public class Article {
	Integer code;
	String libelle;
	Double prixHT;
	static int nbArticle = 0;

	public Article() {
		super();
		nbArticle++;
	}

	public Article(Integer code, String libelle, Double prixHT) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.prixHT = prixHT;
		nbArticle++;
	}

	@Override
	public String toString() {
		return "Article [code=" + code + ", libelle=" + libelle + ", prixHT=" + prixHT + "]";
	}

}
