package modele;

public class Personne {
	
	private String nom ;
	private String prenom ;
	
	

	
	public Personne() {
		super();
	}
	


	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// Constructeurs

	public void setNom (String nom) {// permet de changer le nom
		
		this.nom=nom ;
	}
	
	public String getNom() { // recuperer le nom
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) { 
		this.prenom = prenom;
	}



	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
