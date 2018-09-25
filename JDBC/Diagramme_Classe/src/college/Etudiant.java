package college;

import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {
	private Long anneeEntree;
	private List<Note> notes = new ArrayList<>();
	private College college;

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, String tel, String mail, Long anneeEntree, College college) {
		super(nom, prenom, tel, mail);
		this.anneeEntree = anneeEntree;
		this.college = college;

		college.getEtudiant().add(this);

	}

	public Long getAnneeEntree() {
		return anneeEntree;
	}

	public void setAnneeEntree(Long anneeEntree) {
		this.anneeEntree = anneeEntree;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Etudiant [anneeEntree=" + anneeEntree + ", notes=" + notes + ", college=" + college + ", nom=" + nom
				+ ", prenom=" + prenom + ", tel=" + tel + ", mail=" + mail + "]";
	}

	public Double calculMoyenneEtu() {
		Double sum = 0d;
		for (int i = 0; i < notes.size(); i++) {
			sum += notes.get(i).getNote();
		}
		return sum / notes.size();
	}

}
