package model;

public class VoitureDeLuxe extends Voiture {
	private Integer nbOptions;
	private Double valeur;

	public VoitureDeLuxe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VoitureDeLuxe(double matricule, String couleur, Boolean assure, Integer nbChevaux, String marque,
			String modele, Integer nbOptions, Double valeur) {
		super(matricule, couleur, assure, nbChevaux, marque, modele);
		this.nbOptions = nbOptions;
		this.valeur = valeur;
	}

	public Integer getNbOptions() {
		return nbOptions;
	}

	public void setNbOptions(Integer nbOptions) {
		this.nbOptions = nbOptions;
	}

	public Double getValeur() {
		return valeur;
	}

	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "VoitureDeLuxe [nbOptions=" + nbOptions + ", valeur=" + valeur + ", nbChevaux=" + nbChevaux + ", marque="
				+ marque + ", modele=" + modele + ", matricule=" + matricule + ", couleur=" + couleur + ", assure="
				+ assure + "]";
	}

	public double taxeAPayer() {
		return this.nbOptions * 1000;
	}

}
