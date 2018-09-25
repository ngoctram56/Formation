package model;

public class PersonneMorale extends Client{
	private String raisonSociale;

	public PersonneMorale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonneMorale(Long id, String adresse, String raisonSociale) {
		super(id, adresse);
		this.raisonSociale = raisonSociale;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	@Override
	public String toString() {
		return "PersonneMorale [raisonSociale=" + raisonSociale + ", id=" + id + ", adresse=" + adresse + "]";
	}

}
