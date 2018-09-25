package modele;

public final class PersonnePhysique extends Client {

	//Attributs
	private String nom;
	private String prenom;
	//Constructeurs
	public PersonnePhysique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonnePhysique(Integer id, String adresse,String nom, String prenom) {
		super(id, adresse);
		this.nom = nom;
		this.prenom = prenom;
		// TODO Auto-generated constructor stub
	}
	//Getters and Setters
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
	//Methodes
	//toString
	@Override
	public String toString() {
		return "PersonnePhysique [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", adresse=" + adresse + "]";
	}
	
	
}
