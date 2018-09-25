package model;

import java.util.Arrays;

public class Compte {
	protected String num;
	protected Double[] transactions;
	protected Client client;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String num, Double[] transactions, Client client) {
		super();
		this.num = num;
		this.transactions = transactions;
		this.client = client;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
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
	@Override
	public String toString() {
		return "Compte [num=" + num + ", transactions=" + Arrays.toString(transactions) + ", client=" + client + "]";
	}
	
	public void afficherDetails() {
	System.out.println("num:"+num+"\t id client:"+client.id);
	}

}
