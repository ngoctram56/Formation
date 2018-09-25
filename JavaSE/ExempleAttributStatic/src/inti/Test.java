package inti;

public class Test {

	public static void main(String[] args) {

		Personne p1 = new Personne("nom1", "prenom1");
		Personne p2 = new Personne("nom2", "prenom2");

		System.out.println(p1.nom);// appel d'une variable d'instance

		System.out.println(Personne.nbrPersonnes);// appel d'une variable de classe 'static'
	}

}
