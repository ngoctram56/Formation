package modele;

public class Personne {
	private Long id;
	private String nom;
	private String prenom;

	public Personne() {
		super();
	}

	public Personne(Long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public boolean equals(Object obj) {
		boolean r = false;

		Personne objP = (Personne) obj;

		if (this.id.equals(objP.id) && this.prenom.equals(objP.prenom) && this.nom.equals(objP.nom)) {
			r = true;
		}

		return r;
	}

}
