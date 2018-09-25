package exempleConstructeur;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne();
		p1.nom = "nom1";
		p1.prenom = "prenom1";

		System.out.println(p1.prenom + p1.nom);

		Personne p2 = new Personne("nom2", "prenom2");

		System.out.println(p2.prenom + p2.nom);

	}

}
