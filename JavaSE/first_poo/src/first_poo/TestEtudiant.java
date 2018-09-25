package first_poo;

public class TestEtudiant {

	public static void main(String[] args) {

		Etudiant e1 = new Etudiant();
		e1.id = 123;
		e1.nom = "austen";
		e1.prenom = "jane";
		e1.age = 50;
		
		e1.notes= new double [3] ;
		e1.notes[0] = 2;
		e1.notes[1] = 6;
		e1.notes[2] = 7;
		
		e1.nombreAbsences = 10;

		// Methode afficher
		e1.afficherDescription();

		// Methode ajout

		e1.ajoutAbsences(2);

		// Methode supprimer

		e1.supprimerAbsences(5);

		// Methode moyenne

		double moyenne1 = e1.calculerMoyenne();

		System.out.println("La moyenne est de : " + moyenne1);

		// methode afficher notes

		e1.afficherNotes();

	}

}
