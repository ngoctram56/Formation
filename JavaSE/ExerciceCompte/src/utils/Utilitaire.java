package utils;


public class Utilitaire {

	
	public static Double calculSomme(Double [] transactions) {
		
		Double somme = 0.0 ;
		
		for (int i = 0; i < transactions.length; i++) {
			
			somme += transactions[i] ;
			
		}
		
		return somme ;
	}

}