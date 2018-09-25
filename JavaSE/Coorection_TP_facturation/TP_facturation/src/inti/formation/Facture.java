package inti.formation;

import java.util.Arrays;

public class Facture {
	int num;
	Client client;
	Article[] articles;
	double tva;
	double timbre;
	double fraisPort;

	public Facture() {
		super();
	}

	public Facture(int num, Client client, Article[] articles, double tva, int timbre, double fraisPort) {
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

	// Calcul prix TTC
	double calculPrix() {
		return Utilitaire.sommePrixArticle(articles) + tva + timbre + fraisPort;
	}

	void displayArticles() {
		Utilitaire.afficheTab(articles);
	}
}
