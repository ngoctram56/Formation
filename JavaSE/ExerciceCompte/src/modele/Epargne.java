package modele;

import java.util.Arrays;

import utils.Utilitaire;

public class Epargne extends Compte {
	
	private Double bonus ;

	public Epargne() {
		super();
		
	}



	public Epargne(Long id, Double[] transactions,
			Client client, double bonus) {
		super(id, transactions, client);
		this.bonus = bonus;
	}



	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Epargne [bonus=" + bonus + ", id=" + id + ", transactions=" + Arrays.toString(transactions)
				+ ", client=" + client + "]";
	}
	
	
	
	public double calculSoldeBrut() {
		
		return Utilitaire.calculSomme(transactions) ;
	}
	
	public double calculSoldeAvecBonus() {
		
		return Utilitaire.calculSomme(transactions) + bonus;
	}

}
