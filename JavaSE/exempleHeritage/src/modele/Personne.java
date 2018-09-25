package modele;

public class Personne {
	
	protected Long matricule ;
	protected String nom ;
	protected String prenom ;
	
	
	public Personne() {
		super();
	}


	public Personne(Long matricule, String nom, String prenom) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
	}



	public Long getMatricule() {
		return matricule;
	}


	public void setMatricule(Long matricule) {
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
	
	public void afficherDescription() {
		
		System.out.println(nom + "----------" +prenom);
		
	}


	@Override
	public String toString() {
		return "Personne [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
	
	

}
