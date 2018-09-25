package college;

public class Note {
	private Matiere matiere;
	private Etudiant etudiant;
	private Double note;

	public Note() {
		super();
	}

	public Note(Matiere matiere, Etudiant etudiant, Double note) {
		super();
		this.matiere = matiere;
		this.etudiant = etudiant;
		this.note = note;

		matiere.getNotes().add(this);
		etudiant.getNotes().add(this);
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Note [matiere=" + matiere + ", note=" + note + "]";
	}

}
