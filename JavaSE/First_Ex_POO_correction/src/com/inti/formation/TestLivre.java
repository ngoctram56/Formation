package com.inti.formation;

import java.util.Scanner;

public class TestLivre {
	public static void main(String[] args) {

		// on crée un tableau de Livres
		Livre[] tabLivres = new Livre[3];

		// on crée 3 instances Livres
		Livre livre1 = new Livre();
		Livre livre2 = new Livre();
		Livre livre3 = new Livre();

		// On donne les caractéristiques de chaque livre
		livre1.codeBarre = "1aa";
		livre1.titre = "Lord of the Flies";
		livre1.auteur = "W. G.";
		livre1.prixUnitaire = 10.25;
		livre1.quantite = 2;

		livre2.codeBarre = "3ab";
		livre2.titre = "Jane Eyre";
		livre2.auteur = "Brontë";
		livre2.prixUnitaire = 9;
		livre2.quantite = 5;

		livre3.codeBarre = "5fd";
		livre3.titre = "Emma";
		livre3.auteur = "J. Austen";
		livre3.prixUnitaire = 8.50;
		livre3.quantite = 0;

		// on remplit le tableau
		tabLivres[0] = livre1;
		tabLivres[1] = livre2;
		tabLivres[2] = livre3;
		// on peut créer le tableau et le remplir directement après avoir créé les
		// livres, c'est même mieux
		// Livre[] tabLivres = {livre1, livre2, livre3};

		// on parcourt le tableau et on affiche le titre et l'auteur
		for (int i = 0; i < tabLivres.length; i++) {
			System.out.println("L'auteur du livre " + tabLivres[i].titre + " est " + tabLivres[i].auteur);
		}

		// methode qui return : mettre dans une variable
		double prixL1 = livre1.calculValeurTotale();
		System.out.println(prixL1);
		// methode void : on l'appelle directement et elle fait un ttt
		livre1.afficherDetails();

		// methode qui retourne le prix de vente
		
//		System.out.println("Veuillez saisir votre remise");
//		Scanner sc = new Scanner(System.in); 
//
//		double remise ;
//
//		remise = sc.nextDouble(); 
//		System.out.println("Le remise saisie est " + remise);
		
		double PrixVenteL1 = livre1.PrixVente(20) ;
		System.out.println("Le Prix de vente est de : " +PrixVenteL1);
		

	}

}
