package exempleConstructeur;

public class Employe {

	String nom;
	String prenom;
	Adresse adresse;
	boolean majeur;
	double salaireBrut;
	int anciennete;

	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, Adresse adresse, boolean majeur, double salaireBrut, int anciennete) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.majeur = majeur;
		this.salaireBrut = salaireBrut;
		this.anciennete = anciennete;
	}

	// methode pour calculer salaire net
	double calculSalaireNet(int taxe) {

		return salaireBrut - (salaireBrut * taxe/100);
	}

}
