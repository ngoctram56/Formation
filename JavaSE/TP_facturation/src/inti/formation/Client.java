package inti.formation;

public class Client {

	String raisonSociale;
	Adresse adresse;

	public Client() {
		super();
	}

	public Client(String raisonSociale, Adresse adresse) {
		super();
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [raisonSociale=" + raisonSociale + ", adresse=" + adresse + "]";
	}

}
