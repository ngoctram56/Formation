package modele;

public class MoyenDeTransport {
	
	protected Long matricule ;
	protected String couleur ;
	protected Boolean assurance ;
	
	
	public MoyenDeTransport() {
		super();
		
	}


	public MoyenDeTransport(Long matricule, String couleur, Boolean assurance) {
		super();
		this.matricule = matricule;
		this.couleur = couleur;
		this.assurance = assurance;
	}


	public Long getMatricule() {
		return matricule;
	}


	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public Boolean getAssurance() {
		return assurance;
	}


	public void setAssurance(Boolean assurance) {
		this.assurance = assurance;
	}


	@Override
	public String toString() {
		return "MoyenDeTransport [matricule=" + matricule + ", couleur=" + couleur + ", assurance=" + assurance + "]";
	}
	
	
	
	

}
