package model;

public class Moto extends MoyenTransport {
	protected Integer nbRoues;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(double matricule, String couleur, Boolean assure, Integer nbRoues) {
		super(matricule, couleur, assure);
		this.nbRoues = nbRoues;
	}

	public Integer getNbRoues() {
		return nbRoues;
	}

	public void setNbRoues(Integer nbRoues) {
		this.nbRoues = nbRoues;
	}

	@Override
	public String toString() {
		return "Moto [nbRoues=" + nbRoues + ", matricule=" + matricule + ", couleur=" + couleur + ", assure=" + assure
				+ "]";
	}

	public double taxeAPayer() {
		return this.nbRoues * 100;
	}

}
