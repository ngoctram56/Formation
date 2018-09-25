package modele;

public abstract class Article { //car il ya une méthode abstraite
	
	protected String id ;
	protected String designation ;
	protected double prixUnitaire ;
	
	
	public Article() {
		super();
	}


	public Article(String id, String designation, double prixUnitaire) {
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

	
	//Methode abstracte
	public abstract double calculPrixVente() ;
	
	
	
	

	@Override
	public String toString() {
		return "Article [id=" + id + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire + "]";
	}
	
	
	

}
