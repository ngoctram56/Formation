package college;

import java.util.ArrayList;
import java.util.List;

public class Matiere {
	private List<Note> notes = new ArrayList<>();
	private Salle salle;

	public Matiere() {
		super();
	}

	public Matiere(Salle salle) {
		super();
		this.salle = salle;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	@Override
	public String toString() {
		return "Matiere [notes=" + notes + ", salle=" + salle + "]";
	}

	public Double calculMoyenneMat() {
		Double sum = 0d;
		for (int i = 0; i < notes.size(); i++) {
			sum += notes.get(i).getNote();
		}
		return sum / notes.size();
	}
}
