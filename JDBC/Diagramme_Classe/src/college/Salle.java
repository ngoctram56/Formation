package college;

public class Salle {
	private int nbPlaces;

	public Salle() {
		super();
	}

	public Salle(int nbPlaces) {
		super();
		this.nbPlaces = nbPlaces;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	@Override
	public String toString() {
		return "Salle [nbPlaces=" + nbPlaces + "]";
	}

}
