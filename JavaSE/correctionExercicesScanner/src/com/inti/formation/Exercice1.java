package com.inti.formation;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		System.out.println("Veuillez saisir votre note !!!!!!!!!!!!!!!!");
		Scanner sc = new Scanner(System.in);

		double note = sc.nextDouble();

		if (note >= 0 && note < 10) {
			System.out.println("refusé");
		} else if (note >= 10 && note <= 20) {
			System.out.println("admis");

		} else {
			System.out.println("note non valide");
		}
	}

}
