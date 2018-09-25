package exempleConstructeur;

public class Personne {

	String nom;
	String prenom;

	public Personne() {

	}

	public Personne(String nom, String prenom) {

		this.nom = nom; // this pour pointer sur l'objet en cours
		this.prenom = prenom;
	}

}
