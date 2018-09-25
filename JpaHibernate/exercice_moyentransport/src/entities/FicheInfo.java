package entities;

import javax.persistence.Embeddable;

@Embeddable
public class FicheInfo {
	
	private Integer kilometrage ;
	private String nomChauffeur ;
	private String prenomChauffeur ;
	
	
	public FicheInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FicheInfo(Integer kilometrage, String nomChauffeur, String prenomChauffeur) {
		super();
		this.kilometrage = kilometrage;
		this.nomChauffeur = nomChauffeur;
		this.prenomChauffeur = prenomChauffeur;
	}


	public Integer getKilometrage() {
		return kilometrage;
	}


	public void setKilometrage(Integer kilometrage) {
		this.kilometrage = kilometrage;
	}


	public String getNomChauffeur() {
		return nomChauffeur;
	}


	public void setNomChauffeur(String nomChauffeur) {
		this.nomChauffeur = nomChauffeur;
	}


	public String getPrenomChauffeur() {
		return prenomChauffeur;
	}


	public void setPrenomChauffeur(String prenomChauffeur) {
		this.prenomChauffeur = prenomChauffeur;
	}


	@Override
	public String toString() {
		return "FicheInfo [kilometrage=" + kilometrage + ", nomChauffeur=" + nomChauffeur + ", prenomChauffeur="
				+ prenomChauffeur + "]";
	}
	
	
	
	

}
