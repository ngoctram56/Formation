package model;

import java.util.Arrays;

public class Courant extends Compte{
	private double taxes;

	public Courant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Courant(String num, Double[] transactions, Client client, double taxes) {
		super(num, transactions, client);
		this.taxes = taxes;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	@Override
	public String toString() {
		return "Courant [taxes=" + taxes + ", num=" + num + ", transactions=" + Arrays.toString(transactions)
				+ ", client=" + client + "]";
	}
	
	public double calculSolde() {
		return Utilitaire.calculSomme(transactions)-taxes;
}

}
