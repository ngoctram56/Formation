package form;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		List<Employe> listeEmployes = new ArrayList<>();
		Set<String> setEmployes = new HashSet<>();
		Map<String, Double> mapEmployes = new HashMap<>();

		listeEmployes.add(new Employe("aa", "nomA", "prenomA", 3000d));
		listeEmployes.add(new Employe("bb", "nomB", "prenomB", 3200d));
		listeEmployes.add(new Employe("cc", "nomC", "prenomC", 3500d));
		listeEmployes.add(new Employe("dd", "nomD", "prenomD", 2500d));
		listeEmployes.add(new Employe("ee", "nomE", "prenomE", 6000d));
		listeEmployes.add(new Employe("ff", "nomF", "prenomF", 2400d));
		listeEmployes.add(new Employe("ac", "nomA", "prenomA", 3100d));

		// insérer noms dans set et matricule+salaire dans map
		for (int j = 0; j < listeEmployes.size(); j++) {
			setEmployes.add(listeEmployes.get(j).getNom());
			mapEmployes.put(listeEmployes.get(j).getMatricule(), listeEmployes.get(j).getSalaire());
		}

		// afficher set

		for (String el : setEmployes) {
			System.out.println(el);
		}

		Iterator<String> itSet = setEmployes.iterator();
		while (itSet.hasNext()) {
			String element = itSet.next();
			System.out.println(element);
		}

		// afficher map
		Iterator<Entry<String, Double>> itMap = mapEmployes.entrySet().iterator();
		while (itMap.hasNext()) {
			Entry<String, Double> element = itMap.next();
			System.out.println(element.getKey() + "---" + element.getValue());
		}
		for (Entry<String, Double> item : mapEmployes.entrySet()) {
			System.out.println(item.getKey() + "---" + item.getValue());

		}

	}

}
