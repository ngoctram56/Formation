package run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CorrectionExerciceSet {
	public static void main(String[] args) {

		Set<String> maSet = new HashSet<>();
		Boolean saisie = true;
		Scanner sc = new Scanner(System.in);

		while (saisie) {

			sc = new Scanner(System.in);
			System.out.println("veuillez saisir un STring");
			String chaine = sc.nextLine();
			maSet.add(chaine);

			System.out.println("Voulez-vous continuer la saisie? (Y/N)");
			String suite = sc.nextLine();

			if (suite.equalsIgnoreCase("Y")) {
				saisie = true;
			} else if (suite.equalsIgnoreCase("N")) {
				saisie = false;

			}
		}

		for (String element : maSet) {
			System.out.println(element);
		}

		Iterator<String> it = maSet.iterator();

		while (it.hasNext()) {
			String element = (String) it.next();
			System.out.println(element);

		}
	}
}
