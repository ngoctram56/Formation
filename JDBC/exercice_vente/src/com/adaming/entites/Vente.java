package com.adaming.entites;

public class Vente {
	
	private int id ;
	private Article articles ;
	private int qte ;
	private int annee ;
	
	
	
	public Vente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vente(int id, Article articles, int qte, int annee) {
		super();
		this.id=id;
		this.articles = articles;
		this.qte = qte;
		this.annee = annee;
	}
	
	public Vente(Article articles, int qte, int annee) {
		super();
		this.articles = articles;
		this.qte = qte;
		this.annee = annee;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Article getArticles() {
		return articles;
	}



	public void setArticles(Article articles) {
		this.articles = articles;
	}



	public int getQte() {
		return qte;
	}



	public void setQte(int qte) {
		this.qte = qte;
	}



	public int getAnnee() {
		return annee;
	}



	public void setAnnee(int annee) {
		this.annee = annee;
	}



	@Override
	public String toString() {
		return "Vente [id=" + id + ", articles=" + articles + ", qte=" + qte + ", annee=" + annee + "]";
	}
	
	
	
	
	
	

}
