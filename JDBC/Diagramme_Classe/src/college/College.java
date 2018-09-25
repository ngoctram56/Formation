package college;

import java.util.ArrayList;
import java.util.List;

public class College {
	private String nom;
	private List<Departement> departement = new ArrayList<>();
	private List<Etudiant> etudiant = new ArrayList<>();

	public College() {
		super();
	}

	public College(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Departement> getDepartement() {
		return departement;
	}

	public void setDepartement(List<Departement> departement) {
		this.departement = departement;
	}

	public List<Etudiant> getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(List<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}

	@Override
	public String toString() {
		return "College [nom=" + nom + ", departement=" + departement + ", etudiant=" + etudiant + "]";
	}

}
