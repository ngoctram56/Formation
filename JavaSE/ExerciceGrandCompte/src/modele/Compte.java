package modele;

import java.util.Arrays;

public class Compte {

	// Attributs
	protected Integer num;
	protected Double[] transactions;
	protected Client client;

	// Constructeurs
	public Compte() {
		super();
	}

	public Compte(Integer num, Double[] transactions, Client client) {
		super();
		this.num = num;
		this.transactions = transactions;
		this.client = client;
	}

	// Getters and Setters
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double[] getTransactions() {
		return transactions;
	}

	public void setTransactions(Double[] transactions) {
		this.transactions = transactions;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// Methodes
	public void afficherDetails() {
		System.out.println("Numéro de compte: " + this.num);
		System.out.println("Id client: " + this.client.id);
	}

	// toString
	@Override
	public String toString() {
		return "Compte [num=" + num + ", transactions=" + Arrays.toString(transactions) + ", client=" + client + "]";
	}

}
