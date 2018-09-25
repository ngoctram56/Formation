package com.adaming.entities;

import java.util.Date;

public class Vente {
	private int id;
	private Article article;
	private int quantite;
	private int annee;

	public Vente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vente(int id, Article article, int quantite, int annee) {
		super();
		this.id = id;
		this.article = article;
		this.quantite = quantite;
		this.annee = annee;
	}

	public Vente(Article article, int quantite, int annee) {
		super();
		this.article = article;
		this.quantite = quantite;
		this.annee = annee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Vente [id=" + id + ", article=" + article + ", quantite=" + quantite + ", annee=" + annee + "]";
	}

}
