package com.inti.formation;

public class TestEmploye {

	public static void main(String[] args) 
	{
		//creation de l'employé 1
		Employe emp1 = new Employe();
		emp1.matricule = "001";
		emp1.nom = "nomEmp1";
		emp1.prenom = "prenomEmp1";
		
		//creation de l'employé 2
		Employe emp2 = new Employe();
		emp2.matricule = "002";
		emp2.nom = "belghith";
		emp2.prenom = "medhi";
		
		//on affiche l'attribut 'nom' de l'instance 'emp1' de la classe 'Employe'
		System.out.println(emp2.nom);
		
	}

}
