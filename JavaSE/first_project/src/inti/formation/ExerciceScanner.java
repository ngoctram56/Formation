package inti.formation;

import java.util.Scanner;

public class ExerciceScanner {

	public static void main(String[] args) {

		System.out.println("Veuillez saisir votre chiffre");
		Scanner sc = new Scanner(System.in); //new Scanner est la r�initialisation du scanner
		int x =sc.nextInt();
		System.out.println("Veuillez saisir votre chiffre");
		
		int y = sc.nextInt();

		

		System.out.println("Les chiffres sont " + x + " et " + y);

		// demander et lire le type d'op�ration arithm�tique

		System.out.println("Op�ration � ex�cuter : + - * / ");

		 sc = new Scanner(System.in);

		String typeOperation = sc.nextLine(); // equals est sensible � la casse

		if (typeOperation.equals(("*"))) {

			System.out.println(x * y);
		}

		else if (typeOperation.equals(("+"))) {

			System.out.println(x + y);
		}

		else if (typeOperation.equals(("-"))) {

			System.out.println(x - y);
		} else if (typeOperation.equals(("/"))) {

			System.out.println(x / y);
		} else {

			System.out.println("erreur de saisie");
		}

	}

}




