package inti;

public class Utilitaire {
	
	public static Double calculSomme(Article[] tab) {
		Double sum=0d;
		for (int i = 0; i < tab.length; i++) {
			sum+=tab[i].getPrixHT(); //changement du prix HT en getPrixHT
		}
		return sum;
	}
	
	public static void show(Article[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		
	}
	
}
