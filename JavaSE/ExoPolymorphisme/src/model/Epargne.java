package model;

import java.util.Arrays;

public class Epargne extends Compte{
	private double Bonus;

	public Epargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Epargne(String num, Double[] transactions, Client client, double bonus) {
		super(num, transactions, client);
		Bonus = bonus;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	@Override
	public String toString() {
		return "Epargne [Bonus=" + Bonus + ", num=" + num + ", transactions=" + Arrays.toString(transactions)
				+ ", client=" + client + "]";
	}
	
	public double calculSoldeBrut() {
				return Utilitaire.calculSomme(transactions);
	}
	
	public double calculSoldeBonus() {
		return Utilitaire.calculSomme(transactions)+Bonus;
}

}
