package com.inti.formation;

public class Test1D {

	public static void main(String[] args) {
		int[] tab = { 5, 47, 89, 63, 122, 48, 56, 78, 95 };
		int somme = 0;
		int moyenne = 0;
		int min = tab[0];
		int max = tab[0];

		for (int i = 0; i < tab.length; i++) {
			somme += tab[i]; // somme=somme+tab[i];
			if (tab[i] < min) {
				min = tab[i];
			}
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		System.out.println("somme:" + somme);
		moyenne = somme / tab.length;
		System.out.println("moyenne:" + moyenne);
		System.out.println("min:" + min);
		System.out.println("max:" + max);
	}

}
