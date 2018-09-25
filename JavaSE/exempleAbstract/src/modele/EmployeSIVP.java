package modele;

public class EmployeSIVP extends Employe {

	private int dureeSIVP;

	public EmployeSIVP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeSIVP(String matricule, String nom, String prenom, double salaire, int dureeSIVP) {
		super(matricule, nom, prenom, salaire);
		this.dureeSIVP = dureeSIVP;
	}

	public int getDureeSIVP() {
		return dureeSIVP;
	}

	public void setDureeSIVP(int dureeSIVP) {
		this.dureeSIVP = dureeSIVP;
	}

	@Override
	public String toString() {
		return "EmployeSIVP [dureeSIVP=" + dureeSIVP + ", matricule=" + matricule + ", nom=" + nom + ", prenom="
				+ prenom + ", salaire=" + salaire + "]";
	}

	@Override
	double calculSalaireAnnuelNet() {
		return salaire * 12;

	}

}
