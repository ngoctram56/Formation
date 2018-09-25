package com.adaming.entities;

public class Article {
	private int code;
	private String designation;
	private double prixUnitaire;
	private int qteStock;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(int l, String designation, double prixUnitaire, int qteStock) {
		super();
		this.code = l;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.qteStock = qteStock;
	}
	
	public Article(String designation, double prixUnitaire, int qteStock) {
		super();
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.qteStock = qteStock;
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
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	@Override
	public String toString() {
		return "Article [code=" + code + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire
				+ ", qteStock=" + qteStock + "]";
	}
	
	
}
