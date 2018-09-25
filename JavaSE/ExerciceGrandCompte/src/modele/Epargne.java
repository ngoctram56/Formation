package modele;

import java.util.Arrays;

public final class Epargne extends Compte {

	// Attributs
	private Double bonus;
	// Constructeurs

	public Epargne() {
		super();
	}

	public Epargne(Integer num, Double[] transactions, Client client, Double bonus) {
		super(num, transactions, client);
		this.bonus = bonus;
	}
	// Getters and Setters

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	// Methodes
	public Double calculSoldeBrut() {
		Double somme = Utilitaire.calculSommeTableau(transactions);
		return somme;
	}

	public Double calculSoldeAvecBonus() {
		Double somme = Utilitaire.calculSommeTableau(transactions);
		return somme + bonus;
	}
	// toString

	@Override
	public String toString() {
		return "Epargne [bonus=" + bonus + ", num=" + num + ", transactions=" + Arrays.toString(transactions)
				+ ", client=" + client + "]";
	}

}
