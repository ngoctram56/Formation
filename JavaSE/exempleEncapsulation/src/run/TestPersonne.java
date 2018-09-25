package run;

import modele.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p = new Personne("nom1", "prenom1") ;
		System.out.println(p.getNom());
		
		p.setNom("nom11");
		System.out.println(p.getNom());
	
	
	}

}
