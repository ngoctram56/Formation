package modele;

import java.util.Arrays;

import utils.Utilitaire;

public final class Facture extends DocumentVente {
	private int tva;

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(Long num, int annee, Article[] articles, int tva) {
		super(num, annee, articles);
		this.tva = tva;
	}

	public int getTva() {
		return tva;
	}

	public void setTva(int tva) {
		this.tva = tva;
	}

	@Override
	public String toString() {
		return "Facture [tva=" + tva + ", num=" + num + ", annee=" + annee + ", articles=" + Arrays.toString(articles)
				+ "]";
	}

	@Override
	public Double calculTotal() {
		Double s = Utilitaire.calculSommePrixVente(articles);
		s=s+s*tva/100;
		return s;
	}

}
