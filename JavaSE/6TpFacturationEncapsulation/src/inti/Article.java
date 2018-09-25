package inti;

public class Article {
	private Long code;
	private String libelle;
	private Double prixHT;
	public static int nbarticle=0;
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(Double prixHT) {
		this.prixHT = prixHT;
	}
	public static int getNbarticle() {
		return nbarticle;
	}
	public static void setNbarticle(int nbarticle) {
		Article.nbarticle = nbarticle;
	}
	public Article() {
		super();
		nbarticle++;
	}
	public Article(Long code, String libelle, Double prixHT) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.prixHT = prixHT;
		nbarticle++;
	}
	@Override
	public String toString() {
		return "Article [code=" + code + ", libelle=" + libelle + ", prixHT=" + prixHT + "]";
	}

}
