package com.inti.formation;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir l entier a");
		int a = sc.nextInt();
		System.out.println("Veuillez saisir l entier b");

		sc = new Scanner(System.in);
		int b = sc.nextInt();

		System.out.println("Veuillez choisir votre op arith.");
		sc = new Scanner(System.in);
		String op = sc.nextLine();

		if (op.equals("*")) {
			System.out.println(a * b);
		} else if (op.equals("+")) {
			System.out.println(a + b);

		} else if (op.equals("-")) {
			System.out.println(a - b);

		} else if (op.equals("/")) {
			System.out.println(a / b);

		} else {
			System.out.println("opération non valide");
		}
	}

}
