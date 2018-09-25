package inti.formation;

import java.util.Scanner;

public class ScannerExemple {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir votre nom");
		Scanner sc = new Scanner(System.in); // scan import java.util et system java.lang ; déclaration du scanner

		String nom = "";

		nom = sc.nextLine(); // permet de récuperer ce que l'utilisateur a écrit sur la console
		System.out.println("Le nom saisie est" + nom);

	}

}
