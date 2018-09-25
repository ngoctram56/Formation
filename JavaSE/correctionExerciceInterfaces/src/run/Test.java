package run;

import modele.Equipe;
import modele.Joueur;
import modele.Match;

public class Test {
	public static void main(String[] args) {
		Joueur j1 = new Joueur("Sergio Ramos", 29, "DC", 70234d);
		Joueur j2 = new Joueur("Ronaldo", 31, "AG", 8709430d);
		Joueur j3 = new Joueur("Modric", 28, "MOC", 64789d);

		Joueur j4 = new Joueur("De Gea", 24, "GK", 35410d);
		Joueur j5 = new Joueur("Pogba", 23, "MC", 53201d);
		Joueur j6 = new Joueur("Lukaku", 21, "AC", 36874d);

		Joueur j7 = new Joueur("Totti", 40, "AC", 24136d);
		Joueur j8 = new Joueur("De Rossi", 37, "MC", 17465d);
		Joueur j9 = new Joueur("Nainggolan", 27, "MOC", 45326d);

		Joueur j10 = new Joueur("Falcao", 34, "AC", 63412d);
		Joueur j11 = new Joueur("Sidibe", 21, "LD", 21360d);
		Joueur j12 = new Joueur("Lopes", 22, "MD", 17600d);

		Joueur[] equipeMadrid = { j1, j2, j3 };
		Joueur[] equipeManchester = { j4, j5, j6 };
		Joueur[] equipeRoma = { j7, j8, j9 };
		Joueur[] equipeMonaco = { j10, j11, j12 };

		Equipe Madrid = new Equipe("Real Madrid", equipeMadrid, j1);
		Equipe Manchester = new Equipe("Manchester", equipeManchester, j4);
		Equipe Roma = new Equipe("Roma", equipeRoma, j7);
		Equipe Monaco = new Equipe("Monaco", equipeMonaco, j10);

		Equipe[] tableauEquipe = { Madrid, Manchester, Roma, Monaco };

		Match m1 = new Match("Bernabeu", Madrid, Manchester, 1, 3);
		Match m2 = new Match("Bernabeu", Madrid, Roma, 4, 1);
		Match m3 = new Match("Louis II", Monaco, Madrid, 0, 6);
		Match m4 = new Match("Old trafford", Manchester, Roma, 3, 1);
		Match m5 = new Match("Olf trafford", Manchester, Monaco, 2, 0);
		Match m6 = new Match("Stadio Olimpico", Roma, Monaco, 2, 2);

		Match[] tabMatch = { m1, m2, m3, m4, m5, m6 };
for (int i = 0; i < tabMatch.length; i++) {
	tabMatch[i].afficherResultas(); 
}
		  
		Equipe meilleureEquipe = tableauEquipe[0];
		Equipe meilleureAttaque = tableauEquipe[0];
		Equipe meilleureDefense = tableauEquipe[0];

		for (int i = 0; i < tableauEquipe.length; i++) {
			if (tableauEquipe[i].getNbPoints() > meilleureEquipe.getNbPoints()) {
				meilleureEquipe = tableauEquipe[i];
			}
			if (tableauEquipe[i].getTotalButsMarques() > meilleureAttaque.getTotalButsMarques()) {
				meilleureAttaque = tableauEquipe[i];
			}
			if (tableauEquipe[i].getTotalButsencaisses() < meilleureDefense.getTotalButsencaisses()) {
				meilleureDefense = tableauEquipe[i];
			}
		}
		System.out.println("La meilleure equipe du tournoi est bien evidemment : " + meilleureEquipe.getNom());
		System.out.println("La meilleure attaque du tournoi est bien evidemment : " + meilleureAttaque.getNom());
		System.out.println("La meilleure defense du tournoi est bien evidemment : " + meilleureDefense.getNom());
	}

}
