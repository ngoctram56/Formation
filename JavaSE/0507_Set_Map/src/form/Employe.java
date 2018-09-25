package form;

public class Employe 
{
	private String matricule, nom, prenom;
	private Double salaire;
	//constructeurs
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String matricule, String nom, String prenom, Double salaire) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	//get/set
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	//toString
	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
	
	
}
