package modele;

public class VoitureDeLuxe extends Voiture{
	
	private int nbOption ;
	private Double valeur ;
	
	
	public VoitureDeLuxe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VoitureDeLuxe(Long matricule, String couleur, Boolean assurance, int nbCV, String marque, String modele,
			int nbOption, Double valeur) {
		super(matricule, couleur, assurance, nbCV, marque, modele);
		this.nbOption = nbOption;
		this.valeur = valeur;
	}


	public int getNbOption() {
		return nbOption;
	}


	public void setNbOption(int nbOption) {
		this.nbOption = nbOption;
	}


	public Double getValeur() {
		return valeur;
	}


	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}
	
 public double TaxeApayer() {
		
		return  nbOption * 1000 ; 
		
 }


	@Override
	public String toString() {
		return "VoitureDeLuxe [nbOption=" + nbOption + ", valeur=" + valeur + ", nbCV=" + nbCV + ", marque=" + marque
				+ ", modele=" + modele + ", matricule=" + matricule + ", couleur=" + couleur + ", assurance="
				+ assurance + "]";
	}
	
	
	
	

}
