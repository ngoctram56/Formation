package model;

public class Voiture extends MoyenTransport {
	protected Integer nbChevaux;
	protected String marque;
	protected String modele;
	private  final Double PI=3.14;
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(double matricule, String couleur, Boolean assure, Integer nbChevaux, String marque, String modele) {
		super(matricule, couleur, assure);
		this.nbChevaux = nbChevaux;
		this.marque = marque;
		this.modele = modele;
	}

	public Integer getNbChevaux() {
		return nbChevaux;
	}

	public void setNbChevaux(Integer nbChevaux) {
		this.nbChevaux = nbChevaux;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Override
	public String toString() {
		return "Voiture [nbChevaux=" + nbChevaux + ", marque=" + marque + ", modele=" + modele + ", matricule="
				+ matricule + ", couleur=" + couleur + ", assure=" + assure + "]";
	}

	public double taxeAPayer() {
		return  nbChevaux * 100 * PI;
	}

}
