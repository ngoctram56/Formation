package com.adaming.dto;

public class RecapArticleDTO {
	private int code;
	private double prixUnitaire;
	private int qteStock;
	private int qte;
	private double totalVente;

	public RecapArticleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecapArticleDTO(int code, double prixUnitaire, int qteStock, int qte, double totalVente) {
		super();
		this.code = code;
		this.prixUnitaire = prixUnitaire;
		this.qteStock = qteStock;
		this.qte = qte;
		this.totalVente = totalVente;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public double getTotalVente() {
		return totalVente;
	}

	public void setTotalVente(double totalVente) {
		this.totalVente = totalVente;
	}

	@Override
	public String toString() {
		return "RecapArticleDTO [code=" + code + ", prixUnitaire=" + prixUnitaire + ", qteStock=" + qteStock + ", qte="
				+ qte + ", totalVente=" + totalVente + "]";
	}

}
