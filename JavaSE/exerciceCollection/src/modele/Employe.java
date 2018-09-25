package modele;

public class Employe {
	
	private String matricule ;
	private String nom ;
	private Integer salaire ;
	
	
	public Employe() {
		super();
	
	}


	public Employe(String matricule, String nom, Integer salaire) {
		super();
		this.matricule = matricule;
		this.nom = nom;
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


	public Integer getSalaire() {
		return salaire;
	}


	public void setSalaire(Integer salaire) {
		this.salaire = salaire;
	}


	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", salaire=" + salaire + "]";
	}
	
	
	

	
	
}
