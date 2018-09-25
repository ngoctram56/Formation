package modele;

public abstract class Employe {
	protected String matricule;
	protected String nom;
	protected String prenom;
	protected double salaire;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String matricule, String nom, String prenom, double salaire) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
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
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
	abstract double calculSalaireAnnuelNet();
  
}
