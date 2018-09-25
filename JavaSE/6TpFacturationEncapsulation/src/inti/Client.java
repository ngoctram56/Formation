package inti;

public class Client {
	private String raisonSociale;
	private Adresse adresse;
	
	
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
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
