package inti.formation;

import java.util.Scanner;

public class ScannerExemple {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir votre nom");
		Scanner sc = new Scanner(System.in); // scan import java.util et system java.lang ; d�claration du scanner

		String nom = "";

		nom = sc.nextLine(); // permet de r�cuperer ce que l'utilisateur a �crit sur la console
		System.out.println("Le nom saisie est" + nom);

	}

}
