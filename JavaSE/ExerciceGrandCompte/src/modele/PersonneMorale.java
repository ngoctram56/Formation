package modele;

public class PersonneMorale extends Client {

	//Attributs
	private String raisonSociale;
	//Constructeurs

	public PersonneMorale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonneMorale(Integer id, String adresse,String raisonSociale) {
		super(id, adresse);
		this.raisonSociale = raisonSociale;
	}
	//Getters and Setters

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	//Methodes
	//toString

	@Override
	public String toString() {
		return "PersonneMorale [raisonSociale=" + raisonSociale + ", id=" + id + ", adresse=" + adresse + "]";
	}
	
	
}
