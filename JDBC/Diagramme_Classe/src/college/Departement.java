package college;

import java.util.ArrayList;
import java.util.List;

public class Departement {
	private List<Enseignant> enseignant = new ArrayList<>();
	private Enseignant responsableDep;
	private College college;

	public Departement() {
		super();
	}

	public Departement(Enseignant responsableDep, College college) {
		super();
		this.responsableDep = responsableDep;
		this.college = college;

		college.getDepartement().add(this);
	}

	public List<Enseignant> getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(List<Enseignant> enseignant) {
		this.enseignant = enseignant;
	}

	public Enseignant getResponsableDep() {
		return responsableDep;
	}

	public void setResponsableDep(Enseignant responsableDep) {
		this.responsableDep = responsableDep;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Departement [enseignant=" + enseignant + ", responsableDep=" + responsableDep + ", college=" + college
				+ "]";
	}

	public Double calculMoyenneDep() {
		Double sum = 0d;
		for (int i = 0; i < enseignant.size(); i++) {
			sum += enseignant.get(i).getMatiere().calculMoyenneMat();
		}
		return sum / enseignant.size();
	}
}
