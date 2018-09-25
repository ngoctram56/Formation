package modele;

public class EmployeCDD  extends Employe{

	private int dureeContrat;
	
	public EmployeCDD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeCDD(String matricule, String nom, String prenom, double salaire, int dureeContrat) {
		super(matricule, nom, prenom, salaire);
		this.dureeContrat = dureeContrat;
	}


	public int getDureeContrat() {
		return dureeContrat;
	}


	public void setDureeContrat(int dureeContrat) {
		this.dureeContrat = dureeContrat;
	}


	@Override
	double calculSalaireAnnuelNet() {
 		return salaire*12*0.7;
	}

	

}
