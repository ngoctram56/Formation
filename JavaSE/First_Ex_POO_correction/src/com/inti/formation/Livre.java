package com.inti.formation;

public class Livre 
{
	String codeBarre;
	String titre;
	String auteur;
	double prixUnitaire;
	int quantite ; 

	
	//methode pour calculer la valeur totale
	double calculValeurTotale()
	{
		return prixUnitaire*quantite;
	}
	
	//methode pour afficher titre et prix, ne renvoie rien (void)
	void afficherDetails() 
	{	
		System.out.println(titre+" prix: "+prixUnitaire);	
	}
	
	//methode pour calculer PrixVente
	
	double PrixVente(double remise) {
		return  prixUnitaire - (prixUnitaire * remise/100) ;
	}

}
