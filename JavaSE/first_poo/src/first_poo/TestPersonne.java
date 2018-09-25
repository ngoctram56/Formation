package first_poo;

public class TestPersonne {

	public static void main(String[] args) {
		
		
		PersonneVariable p1 = new PersonneVariable("nom1", "prenom1") ;
		PersonneVariable p2 = new PersonneVariable("nom2", "prenom2") ;
		
		System.out.println(p1.nom); //appel d'une variable d'instance
		
		System.out.println(PersonneVariable.nbPersonnes); //appel d'une variable de classe static
	}

}
