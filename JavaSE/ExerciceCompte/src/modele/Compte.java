package modele;

import java.util.Arrays;

public class Compte {
	
	protected Long id;
	protected Double [] transactions ;
	protected Client client ;
	
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Compte(Long id, Double[] transactions, 
			Client client) {
		super();
		this.id = id;
		this.transactions = transactions;
		this.client = client;
	}





	



	@Override
	public String toString() {
		return "Compte [id=" + id + ", transactions=" + Arrays.toString(transactions) + ", client=" + client + "]";
	}
	
	
	
	public void afficheDetail() {
		
		System.out.println("Le numero de compte est " +id 
				+ ". "+ "L'id du client est " +client.id);
		
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
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
	
	

}
