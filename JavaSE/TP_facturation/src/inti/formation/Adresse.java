package inti.formation;

public class Adresse {
	int num;
	String rue;
	String ville;

	public Adresse() {
		super();
	}

	public Adresse(int num, String rue, String ville) {
		super();
		this.num = num;
		this.rue = rue;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [num=" + num + ", rue=" + rue + ", ville=" + ville + "]";
	}

}
