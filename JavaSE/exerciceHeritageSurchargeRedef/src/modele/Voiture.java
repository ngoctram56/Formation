package modele;


public class Voiture extends MoyenDeTransport {
	
	protected int nbCV ;
	protected String marque ;
	protected String modele ;
	private static final Double PI=3.14 ; //Déclaration d'une constante
	
	
	public Voiture() {
		super();
		
	}


	public Voiture(Long matricule, String couleur, Boolean assurance, int nbCV, String marque, String modele) {
		super(matricule, couleur, assurance);
		this.nbCV = nbCV;
		this.marque = marque;
		this.modele = modele;
	}


	public int getNbCV() {
		return nbCV;
	}


	public void setNbCV(int nbCV) {
		this.nbCV = nbCV;
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
	
	public double TaxeApayer() {
		
		return  nbCV * 100 * PI ;
		
	}


	@Override
	public String toString() {
		return "Voiture [nbCV=" + nbCV + ", marque=" + marque + ", modele=" + modele + ", matricule=" + matricule
				+ ", couleur=" + couleur + ", assurance=" + assurance + "]";
	}
	
	
	
	
	
	
	

}
