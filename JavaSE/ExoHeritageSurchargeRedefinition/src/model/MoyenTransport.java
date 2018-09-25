package model;

public class MoyenTransport {
	protected double matricule;
	protected String couleur;
	protected Boolean assure;

	public MoyenTransport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoyenTransport(double matricule, String couleur, Boolean assure) {
		super();
		this.matricule = matricule;
		this.couleur = couleur;
		this.assure = assure;
	}

	public double getMatricule() {
		return matricule;
	}

	public void setMatricule(double matricule) {
		this.matricule = matricule;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Boolean getAssure() {
		return assure;
	}

	public void setAssure(Boolean assure) {
		this.assure = assure;
	}

	@Override
	public String toString() {
		return "MoyenTransport [matricule=" + matricule + ", couleur=" + couleur + ", assure=" + assure + "]";
	}

}
