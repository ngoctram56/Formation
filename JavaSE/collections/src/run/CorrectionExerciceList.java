package run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CorrectionExerciceList {
	public static void main(String[] args) {
		System.out.println("Saisir le nombre d' entrées");
		Scanner sc = new Scanner(System.in);
		int nbEntree = sc.nextInt();
		List<Integer> listPair = new ArrayList<>();
		List<Integer> listImpair = new ArrayList<>();

		for (int i = 0; i < nbEntree; i++) {
			System.out.println("Veuillez saisir l entier n°" + (i + 1));
			sc = new Scanner(System.in);
			int entier = sc.nextInt();
			if (entier % 2 == 0) {
				listPair.add(entier);
			} else {
				listImpair.add(entier);

			}
		}

		int j = 0;
		while (j < listPair.size()) {
			System.out.println(listPair.get(j));
			j++;
		}
		for (Integer item : listImpair) {
			System.out.println(item);
		}

		System.out.println("Veuillez saisir votre nombre pair");
		sc = new Scanner(System.in);
		int elementRecherche = sc.nextInt();

		if (listPair.contains(elementRecherche)) {
			System.out.println("élement trouvé");
		} else {
			System.out.println("élement non trouvé");

		}
	}
}
