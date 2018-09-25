package exempleCollection;

import java.util.*;

public class TestList {
	


	public static void main(String[] args) {
		List<String> maListe = new ArrayList<>();

		//Ajouter 
		maListe.add("d");
		maListe.add("c");
		
		//SUpprimer
		//maListe.remove(1);
		
		
		//Récuperer la liste
		System.out.println("taille" + maListe.size());

		//Récupere un booléen pour savoir si la liste est vide
		if (maListe.isEmpty()) {

			System.out.println("liste vide");
		}

		else {
			System.out.println("liste contient :" + maListe.size() + " elements");
		}
		
		//Parcourir la liste 
		//Récupere un élément selon l'indice
		for (int i = 0; i < maListe.size(); i++) {
			System.out.println(maListe.get(i));
			
		}
		
		//contient ou pas l'élément
		if (maListe.contains("c")) {
			
			System.out.println("l'élément existe");
			
		}
		
		else {
			System.out.println("L'élement n'existe pas");
		}
		
		for (String element : maListe) {
			System.out.println(element);
		}
		
		
		//iterator
		
		Iterator<String> iterator = maListe.iterator() ;
		
		while (iterator.hasNext()) {
			
			String element = iterator.next() ;
			System.out.println(element);
			System.out.println("****************");

		}
		
		
		
		// Set
		
		Set<String> maSet = new HashSet<>() ;
		maSet.add("ss");
		maSet.add("bb");
		maSet.add("dd");
		
		for (String element : maSet) {
			
			System.out.println(element);
			
		}
		
		Iterator<String> it = maSet.iterator();
		
	while (it.hasNext()) {
		String element = it.next();
		System.out.println(element);
		
	}




	}

}
