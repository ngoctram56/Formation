package modele;

public class Directeur  extends Employe{
	
	private int anciennete ;

	public Directeur() {
		super();
		
	}



	public Directeur(Long matricule, String nom, String prenom, double salaire, int anciennete) {
		super(matricule, nom, prenom, salaire);
		this.anciennete = anciennete;
	}



	public int getAnciennete() {
		return anciennete;
	}

	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}

	@Override
	public String toString() {
		return "Directeur [anciennete=" + anciennete + ", matricule=" + matricule + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}
	
	

}
