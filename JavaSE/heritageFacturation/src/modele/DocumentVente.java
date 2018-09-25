package modele;

import java.util.Arrays;

public abstract class DocumentVente {
	protected Long num;
	protected int annee;
	protected Article[] articles;

	public DocumentVente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocumentVente(Long num, int annee, Article[] articles) {
		super();
		this.num = num;
		this.annee = annee;
		this.articles = articles;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "DocumentVente [num=" + num + ", annee=" + annee + ", articles=" + Arrays.toString(articles) + "]";
	}

	public abstract Double calculTotal();
}
