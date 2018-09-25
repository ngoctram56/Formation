package inti.formation;

public class ExerciceBoucleFor {

	public static void main(String[] args) {
		// creation d'un tableau d'entier

		int[] tabEntier = { 1, 3, 4, 8, 12 };

		// calculer la somme et la moyenne des valeurs

		int SommeTab = 0;
		int MoyenneTab;

		// Minimum et Maximum

		int max = tabEntier[0];
		int min = tabEntier[0];

		for (int i = 0; i < tabEntier.length; i++) {

			SommeTab = SommeTab + tabEntier[i]; //sommeTab+=tabEntier[i]

			if (tabEntier[i] > max) {
				max = tabEntier[i];
			}

			if (tabEntier[i] < min) {
				min = tabEntier[i];

			}
			
		}

			System.out.println("la somme est de : " +SommeTab);

			MoyenneTab = SommeTab / tabEntier.length;

			System.out.println("La moyenne est de : " +MoyenneTab);
			System.out.println("Le maximum est de : " +max);
			System.out.println("Le minimum est de : " +min);

		

	}

}
