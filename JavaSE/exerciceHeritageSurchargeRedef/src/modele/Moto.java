package modele;

public class Moto extends MoyenDeTransport{
	
	protected int nbRoues ;



	public Moto() {
		super();
	}


	public Moto(Long matricule, String couleur, Boolean assurance, int nbRoues) {
		super(matricule, couleur, assurance);
		this.nbRoues = nbRoues;
	}

	public int getNbRoues() {
		return nbRoues;
	}

	public void setNbRoues(int nbRoues) {
		this.nbRoues = nbRoues;
	}
	
	 public double TaxeApayer() {
		 
		 return nbRoues * 190 ;
	 }

	@Override
	public String toString() {
		return "Moto [nbRoues=" + nbRoues + ", matricule=" + matricule + ", couleur=" + couleur + ", assurance="
				+ assurance + "]";
	}
	
	 

}
