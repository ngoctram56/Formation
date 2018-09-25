package run;
import modele.*;


public class TestMain {

	public static void main(String[] args) {
		
		Joueur j1 = new Joueur(1L, 23, "poste1", 1100d) ;
		Joueur j2 = new Joueur(2L, 24, "poste2", 1200d) ;
		Joueur j3 = new Joueur(3L, 33, "poste3", 1300d) ;
		Joueur j4 = new Joueur(4L, 23, "poste4", 1400d) ;
		
		Joueur[] joueurs1 = {j1, j2} ;
		Joueur [] joueurs2 = {j3, j4} ; 

		
		Equipe e1 = new Equipe("nom1", joueurs1, j1, 3, 4, 5) ;
		Equipe e2 = new Equipe("nom2", joueurs2, j4, 4, 5, 6) ;
		Equipe e3 = new Equipe("nom3", joueurs1, j3, 2, 1, 8) ;
		Equipe e4 = new Equipe("nom4", joueurs2, j4, 4, 5, 6) ;
		
		Match m1 = new Match("stade1", e1, e2, 3, 4) ;
		Match m2 = new Match("stade2", e3, e4, 4, 5) ;
		Match m3 = new Match("stade3", e1, e4, 2, 5) ;
		
		Match [] matchs = {m1, m2, m3} ;
		Equipe [] equipes = {e1, e2, e3, e4} ;
		
		//Affichage resultat match
		for (int i = 0; i < matchs.length; i++) {
			matchs[i].afficherResultat();;
			
		}
		
		System.out.println(e4.getNbPoints());
		
		//Affichage moyenne et salaire
		System.out.println(e2.calculerMoyennedAge());
		System.out.println(e2.calculerSalaireJoueur());
	
		// Determiner la meilleure equipe, l'équipe meilleur attaque
		// meilleure défense 
		
		Equipe meilleure = equipes[0] ;
		Equipe attaque = equipes[0] ;
		Equipe defence = equipes[0] ;
		
		for (int i = 0; i < equipes.length; i++) {
			
			
			if (equipes[i].getNbPoints() >= meilleure.getNbPoints() )  {
				meilleure = equipes[i] ;
				
				
			}
			
			if (equipes[i].getTotalButsMarques() > attaque.getTotalButsMarques()) {
				
				attaque = equipes[i] ;
			
			}
			
			if (equipes[i].getTotalButsEncaisses() < defence.getTotalButsEncaisses()) {
				
				defence = equipes[i] ;
				
				
				
			}
		

	}
		
		System.out.println("La meilleure équipe est " +meilleure.getNom());
		System.out.println("Meilleure attaque est " +attaque.getNom());
		System.out.println("Meilleure défence est " +defence.getNom());


	}
		
	}


