package com.inti;

public class TestEtudiant {
	public static void main(String[] args) {

		Etudiant e1 = new Etudiant();
		e1.id = 1l;
		e1.nom = "Pada";
		e1.prenom = "Adrien";
		e1.age = 1;
		e1.abs = 1;

		e1.notes = new Double[3];
		e1.notes[0] = 12d;
		e1.notes[1] = 10d;
		e1.notes[2] = 20d;

		e1.afficherDescription();

		System.out.println(e1.abs);
		e1.ajoutAbs(5);
		System.out.println(e1.abs);
		e1.suppAbs(2);
		System.out.println(e1.abs);

		e1.affichernotes();
		
		double moye = e1.calculmoyenne();
		System.out.println("\n"+"moyenne:"+moye);
		
		
		Double[] notes = {3d,5d,6d } ;
		Etudiant e2 = new Etudiant (456, "nom2", "prenom2", notes, 2);
		
		
		e2.afficherDescription();
		
		
	}
}