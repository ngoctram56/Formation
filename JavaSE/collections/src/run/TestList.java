package run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> maListe = new ArrayList<>();
		 
		maListe.add("d");
		maListe.add("a");
		maListe.add("b");
		maListe.add("b");
		maListe.add("c");
		//size
		if (maListe.isEmpty()) {
			System.out.println("liste vide");
		} else {
			System.out.println("liste contient "+maListe.size()+"éléments");

		}
		
		
		for (int i = 0; i < maListe.size(); i++) {
			System.out.println(maListe.get(i));

		}
		
		maListe.remove(4);

		if (maListe.contains("c")) {
			System.out.println("l'élement existe");
		} else {
			System.out.println("l'élement n'existe pas");

		}
		
		System.out.println("*****************");
		for (String element : maListe) {
			System.out.println(element);

		}
		
		
		System.out.println("*****************");

		Iterator<String> iterator = maListe.iterator();
		
		
		while (iterator.hasNext()) {
			String element =   iterator.next();
			System.out.println(element);
		}
		
		System.out.println("********* sort********");
		
		Collections.sort(maListe);
		
		for (String element : maListe) {
			System.out.println(element);

		}
		Collections.reverse(maListe);

		System.out.println("*****************");
		
		for (String element : maListe) {
			System.out.println(element);

		}
		
//		
 	}

}
