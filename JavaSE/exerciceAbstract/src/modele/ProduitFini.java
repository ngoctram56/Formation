package modele;

public final class ProduitFini extends Article {
	
	private final int MARGE_PF = 15 ; //si constante static declaration dans les classes
	private String emballage ;
	

	public ProduitFini() {
	}


	


	public ProduitFini(String id, String designation, double prixUnitaire, String emballage) {
		super(id, designation, prixUnitaire);
		this.emballage = emballage;
	}





	public String getEmballage() {
		return emballage;
	}


	public void setEmballage(String emballage) {
		this.emballage = emballage;
	}


//	public static int getMargePf() {
//		return MARGE_PF;
//	}


	@Override
	public String toString() {
		return "ProduitFini [emballage=" + emballage + ", id=" + id + ", designation=" + designation + ", prixUnitaire="
				+ prixUnitaire + "]";
	}


	@Override
	public double calculPrixVente() {
		
		return prixUnitaire + (prixUnitaire* MARGE_PF) *100 ;
	}
	
	
	
	
	

}
