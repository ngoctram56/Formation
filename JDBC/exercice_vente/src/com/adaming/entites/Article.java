package com.adaming.entites;

public class Article {
	
	private int code ;
	private String designation ;
	private double prix_unitaire ;
	private int qte_stock ;
	
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Article(int code, String designation, double prix_unitaire, int qte_stock) {
		super();
		this.code=code ;
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.qte_stock = qte_stock;
	}
	
	public Article(String designation, double prix_unitaire, int qte_stock) {
		super();
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.qte_stock = qte_stock;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getPrix_unitaire() {
		return prix_unitaire;
	}


	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}


	public int getQte_stock() {
		return qte_stock;
	}


	public void setQte_stock(int qte_stock) {
		this.qte_stock = qte_stock;
	}


	@Override
	public String toString() {
		return "Article [code=" + code + ", designation=" + designation + ", prix_unitaire=" + prix_unitaire
				+ ", qte_stock=" + qte_stock + "]";
	}
	
	
	
	
	

}
