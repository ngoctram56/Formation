package modele;

import java.util.Arrays;

public final class Courant extends Compte {

	// Attributs
	private Double taxes;

	// Constructeurs
	public Courant() {
		super();
	}

	public Courant(Integer num, Double[] transactions, Client client, Double taxes) {
		super(num, transactions, client);
		this.taxes = taxes;
	}
	// Getters and Setters

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	// Methode
	public Double calculSolde() {
		Double somme = Utilitaire.calculSommeTableau(transactions);
		return somme + taxes;
	}
	// toString

	@Override
	public String toString() {
		return "Courant [taxes=" + taxes + ", num=" + num + ", transactions=" + Arrays.toString(transactions)
				+ ", client=" + client + "]";
	}

}
