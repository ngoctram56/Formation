package first_poo;

public class PersonneVariable {

	//Variable d'instance
	String nom;
	String prenom;

	// Variable de classe
	static int nbPersonnes = 0;

	public PersonneVariable() {
		super();
		nbPersonnes ++ ;
		
	}

	public PersonneVariable(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		nbPersonnes ++; // pour incrémenter automatiquement quand on fait un new
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
		
	}
	
	
	
	

}
