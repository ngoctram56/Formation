package modele;

public final class MatierePremiere extends Article {
	
	private  final int MARGE_MP = 7 ;

	public MatierePremiere() {
		super();

	}

	public MatierePremiere(String id, String designation, double prixUnitaire) {
		super();
		this.id = id;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
	}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getPrixUnitaire() {
		return prixUnitaire;
	}


	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

//	public static int getMargeMp() { // quand on met en static 
//	}

	@Override
	public String toString() {
		return "MatierePremiere [id=" + id + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire + "]";
	}



	@Override
	public double calculPrixVente() {
		
		return prixUnitaire *  MARGE_MP;
	}
	
	
	public boolean equals (Object obj) {
		
		boolean m = false ;
		
		MatierePremiere objM = (MatierePremiere) obj ;
		
		if (this.designation.equals(objM.designation) &&
				(this.id.equals(objM.id)) &&
				(this.prixUnitaire==(objM.prixUnitaire))) {
			m = true ;
		}
		
		return m ;
	}
	
	// ou (this.id.equals((MatierePremiere))obj.id))
	
	

}
