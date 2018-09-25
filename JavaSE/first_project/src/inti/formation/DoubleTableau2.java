package inti.formation;

public class DoubleTableau2 {

	public static void main(String[] args) {
		int[][] tab = { { 5, 7, 9, 11 }, { 2, 4, 6, 8 }, { 6, 10, 1, 19 } };

		int i = 0;
		
		int sommePaire = 0;
		int sommeImpaire = 0;

		while (i < tab.length) {
			
			int j=0;

			while (j < tab[i].length) {
				

				if (tab[i][j] % 2 == 0) {

					sommePaire = sommePaire + tab[i][j];

				} else { 
					sommeImpaire = sommeImpaire + tab[i][j];
					;
				}

				// System.out.println(tab[i][j]);
				j++;

			}

		
			i++;

		}

		System.out.println("La somme paire vaut " + sommePaire);
		System.out.println("La somme impaire vaut " + sommeImpaire);

	}

}
