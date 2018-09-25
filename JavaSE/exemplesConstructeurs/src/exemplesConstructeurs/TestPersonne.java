package exemplesConstructeurs;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		System.out.println(p1.nom);
		System.out.println(p1.prenom);
		p1.nom = "bbbb";
		System.out.println(p1.nom);
		Personne p2 = new Personne("nom2", "prenom2");

	}

}
