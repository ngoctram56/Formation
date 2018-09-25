package modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exerciceListe {

	public static void main(String[] args) {
		
		System.out.println("Veuillez saisir la taille de la liste  : ");
		Scanner sc = new Scanner (System.in) ;
		int nb = sc.nextInt()  ;
	
		
	
		List<Integer> listePair = new ArrayList<>() ;
		List<Integer> listImpair = new ArrayList<>() ;
		List<Integer> listTotal = new ArrayList<>() ;
		
	
		
		for (int i = 0; i < nb; i++) {
			
			System.out.println("Entrer votre valeur : ");
			Scanner sc1 = new Scanner (System.in) ;
			int valeur = sc1.nextInt()  ;
			
			if (valeur %2 == 0) {
				
				listePair.add(valeur) ;
				
			}
			
			else {
				
				listImpair.add(valeur) ;
				
			}
			
		
		}
		
		for (int i = 0; i < listePair.size(); i++) {
			System.out.println(listePair.get(i) + " ");
					
		}

		
		for (Integer element : listImpair) {
			
			System.out.println(element + " ");
		}
		
		
		
		listTotal.addAll(listePair) ;
		listTotal.addAll(listImpair) ;
		Collections.sort(listTotal);
		Collections.reverse(listePair);
		
	
		
		
		System.out.println(listTotal);
		
		
		//Suppression d'un liste
		System.out.println("suppression d'élement ");

		
		Scanner sc2 = new Scanner (System.in) ;
		int nbsupprimer = sc2.nextInt()  ;
		
		if (listTotal.contains(nbsupprimer)) {
			
			listTotal.remove(nbsupprimer) ;
		
			
			
		}
		
		else {
			
			System.out.println("La valeur n'est pas dans la liste");
		}
	


	}

}
