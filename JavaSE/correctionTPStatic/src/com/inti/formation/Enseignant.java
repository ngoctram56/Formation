package com.inti.formation;

import java.util.Arrays;

public class Enseignant {
		//Attributs
		String matricule;
		Double salaire;
		String nom;
		String prenom;
		Integer age;
		static int nbrEnseignant=0;
		static int nbEnseignantSalaire3000=0;
		Lycee lycee;
		String[] matieres;
		
		//Constructeurs
		public Enseignant() {
			super();
			nbrEnseignant++;
		}
		public Enseignant(String matricule, Double salaire, String nom, String prenom, Integer age, Lycee lycee,
				String[] matieres) {
			super();
			this.matricule = matricule;
			this.salaire = salaire;
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
			this.lycee = lycee;
			this.matieres = matieres;
			nbrEnseignant++;
			if(this.salaire>3000)
			{
				Enseignant.nbEnseignantSalaire3000++;
			}
		}
		
		@Override
		public String toString() {
			return "Enseignant [matricule=" + matricule + ", salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom
					+ ", age=" + age + ", lycee=" + lycee + ", matieres=" + Arrays.toString(matieres) + "]";
		}
		
}
