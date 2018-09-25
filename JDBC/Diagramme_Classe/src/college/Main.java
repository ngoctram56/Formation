package college;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		try {
			College c1 = new College("college1");
			College c2 = new College("college2");

			Etudiant etu1 = new Etudiant("nom1", "prenom1", "0672494701", "mail1", 2016l, c1);
			Etudiant etu2 = new Etudiant("nom2", "prenom2", "0672494701", "mail2", 2016l, c2);

			Enseignant resp = new Enseignant();

			Departement dep1 = new Departement(resp, c1);
			Departement dep2 = new Departement(resp, c2);

			Salle salle1 = new Salle(25);
			Matiere maths = new Matiere(salle1);
			Matiere physique = new Matiere(salle1);
			Matiere francais = new Matiere(salle1);
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
			Date d1=format.parse("17/12/2015 15:30");
			
			Enseignant ens1 = new Enseignant("nom3", "prenom3", "0672494701", "mail3", d1, 1, maths, dep1);
			Enseignant ens2 = new Enseignant("nom4", "prenom4", "0672494701", "mail4", d1, 1, francais, dep2);
			Enseignant ens3 = new Enseignant("nom5", "prenom5", "0672494701", "mail5", d1, 1, physique, dep2);

			System.out.println(ens1.getDatePriseFonction());

			Note note1 = new Note(maths, etu1, 15d);
			Note note2 = new Note(maths, etu2, 10d);
			Note note3 = new Note(francais, etu1, 9d);
			Note note4 = new Note(francais, etu2, 17d);
			Note note5 = new Note(physique, etu1, 11d);
			Note note6 = new Note(physique, etu2, 11d);

			System.out.println(etu1.calculMoyenneEtu());
			System.out.println(etu2.calculMoyenneEtu());
			System.out.println(maths.calculMoyenneMat());
			System.out.println(francais.calculMoyenneMat());
			System.out.println(physique.calculMoyenneMat());
			System.out.println(dep1.calculMoyenneDep());
			System.out.println(dep2.calculMoyenneDep());

			etu1.imprimerDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
