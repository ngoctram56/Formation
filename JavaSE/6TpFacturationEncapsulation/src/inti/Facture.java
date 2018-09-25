package inti;

import java.util.Arrays;

public class Facture {
	private Long num;
	private Client client;
	private Article[] articles;
	private Double tva;
	private Double timbre;
	private Double fraisPort;
	
	
	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

	public Double getTva() {
		return tva;
	}

	public void setTva(Double tva) {
		this.tva = tva;
	}

	public Double getTimbre() {
		return timbre;
	}

	public void setTimbre(Double timbre) {
		this.timbre = timbre;
	}

	public Double getFraisPort() {
		return fraisPort;
	}

	public void setFraisPort(Double fraisPort) {
		this.fraisPort = fraisPort;
	}

	public Facture() {
		super();
	}
	 
	public Facture(Long num, Client client, Article[] articles, Double tva, Double timbre, Double fraisPort) {
		super();
		this.num = num;
		this.client = client;
		this.articles = articles;
		this.tva = tva;
		this.timbre = timbre;
		this.fraisPort = fraisPort;
	}
	@Override
	public String toString() {
		return "Facture [num=" + num + ", client=" + client + ", articles=" + Arrays.toString(articles) + ", tva=" + tva
				+ ", timbre=" + timbre + ", fraisPort=" + fraisPort + "]";
	}
	
	public Double prixTTC() { //on ne rajoute pas de param car ils sont attribués à chaque facture	
	return Utilitaire.calculSomme(articles)*(1+tva/100)+timbre+fraisPort;
			}
	
	public void show () {
		Utilitaire.show(articles);
	}
	
}
