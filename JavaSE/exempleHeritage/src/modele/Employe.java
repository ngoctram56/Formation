package modele;


public class Employe extends Personne {
	
	protected double salaire ;
	
	public Employe () {
		
		super() ; //appel au constructeur par défaut de la classe mère
	}

	public Employe(Long matricule, String nom, String prenom, 
			double salaire) {
		
		super(matricule, nom, prenom);
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


		
	
}
