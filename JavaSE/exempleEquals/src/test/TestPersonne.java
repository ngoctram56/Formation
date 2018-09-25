package test;

import modele.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne(1l, "nom", "prenom") ;
		Personne p2 = new Personne(1l, "nom", "prenom") ;
		
		if (p1.equals(p2)) { 
			
			System.out.println("meme personne");
			
		}
		
		else {
			
			System.out.println("equals !!!!!!!!!!!!!!!!!");
		}


	}

}
