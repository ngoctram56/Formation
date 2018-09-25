package model;

public class PersonnePhysique extends Client {
	private String nom;
	private String prenom;
	public PersonnePhysique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonnePhysique(Long id, String adresse, String nom, String prenom) {
		super(id, adresse);
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "PersonnePhysique [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", adresse=" + adresse + "]";
	}
	
	

}
