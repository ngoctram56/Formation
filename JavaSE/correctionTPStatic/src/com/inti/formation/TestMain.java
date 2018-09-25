package com.inti.formation;

public class TestMain {

	public static void main(String[] args) {
		// Declaration
		Lycee l1 = new Lycee("Ambroise Pare", "Laval");
		String[] tabMat1 = new String[4];
		String[] tabMat2 = new String[3];

		// Initialization
		tabMat1[0] = "Français";
		tabMat1[1] = "Maths";
		tabMat1[2] = "SVT";
		tabMat1[3] = "Chimie";

		tabMat2[0] = "Physique";
		tabMat2[1] = "Maths";
		tabMat2[2] = "Sport";

		Enseignant e1 = new Enseignant("0001", 3500d, "Dupont", "Dupond", 42, l1, tabMat1);
		Enseignant e2 = new Enseignant("0002", 4000d, "Dupont1", "Dupond1", 25, l1, tabMat1);
		Enseignant e3 = new Enseignant("0003", 2400d, "Dupont2", "Dupond2", 50, l1, tabMat2);
		Enseignant e4 = new Enseignant("0004", 3000d, "Dupont3", "Dupond3", 37, l1, tabMat2);

		// Affichage du résultat
		System.out.println(e1+"\n"+e2);
		System.out.println("Nombre total d'enseignants enregistrés : " + Enseignant.nbrEnseignant);
		System.out.println("Nombre total d'enseignants ayant un salaire de plus de 3000 euros : "+ Enseignant.nbEnseignantSalaire3000);
		System.out.println("Nombre total de lycées enregistrés : " + Lycee.nbrLycee);
	}

}
