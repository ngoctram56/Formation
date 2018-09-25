package modele;

public abstract class Animal {
	
	String nom ;

	public Animal() {
		super();
		
	}

	public Animal(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + "]";
	}
	
	public abstract void afficherDescription() ;
	
	

}
