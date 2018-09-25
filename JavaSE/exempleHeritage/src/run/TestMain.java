package run;

import modele.Etudiant;
import modele.Directeur ;
import modele.Employe;

public class TestMain {
	
	public static void main(String[] args) {
		
		Etudiant e = new Etudiant (1l, "nom1", "prenom1", 12.0, 17) ;
		Employe em = new Employe (2L, "nom2", "prenom2", 3550) ;
		Directeur ed = new Directeur (3L, "nom3","prenom3", 35500, 29) ;
	
		
	e.afficherDescription();
	em.afficherDescription();
	ed.afficherDescription();
	
	}

}
