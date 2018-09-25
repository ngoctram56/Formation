package exempleConstructeur;

public class Adresse {

	int num;
	String rue;
	String ville;
	int codePostale;

	public Adresse() {
		super();

	}

	public Adresse(int num, String rue, String ville, int codePostale) {
		super();
		this.num = num;
		this.rue = rue;
		this.ville = ville;
		this.codePostale = codePostale;
	}

}
