package modele;

import java.util.Arrays;

import utils.Utilitaire;

public class Courant extends Compte {
	
	private double taxe ;

	public Courant() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Courant(Long id, Double[] transactions, Client client, double taxe) {
		super(id, transactions, client);
		this.taxe = taxe;
	}




	public double getTaxe() {
		return taxe;
	}

	public void setTaxe(double taxe) {
		this.taxe = taxe;
	}




	@Override
	public String toString() {
		return "Courant [taxe=" + taxe + ", id=" + id + ", transactions=" + Arrays.toString(transactions) + ", client="
				+ client + "]";
	}
	
	
	
	public double calculSolde () {
		
		return Utilitaire.calculSomme(transactions) - taxe ;
	}
	
	
	
	

}
