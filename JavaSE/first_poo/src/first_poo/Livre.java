package first_poo;

public class Livre {
	
	String codebarre ;
	String titre ;
	String auteur ;
	double prix ; 
	int quantite ;
	
	
	// methode pour calcul de la valeur totale
	
	 double calculValeurTotale () {
		
		return prix*quantite ;
	}
	 
	 void afficherDetail () {
		 
		 System.out.println(titre + "prix : " +prix);
	 }

	 
	 // Pour la suite voir dans First_Ex_POO correction
}
