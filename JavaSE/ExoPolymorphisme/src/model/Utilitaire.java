package model;

public class Utilitaire {
	
	public static double calculSomme(Double[]tab) {
		double sum=0;
		for (int i = 0; i < tab.length; i++) {
			sum+=tab[i];
		}
		return sum;
	}

}
