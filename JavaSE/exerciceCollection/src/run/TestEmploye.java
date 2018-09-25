package run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

import modele.Employe;

public class TestEmploye {


	public static void main(String[] args) {
		//Créer une liste d'employe
		
		Employe e1 = new Employe("matricule1", "nom1", 1200);
		Employe e2 = new Employe("matricule2", "nom2", 1300);
		Employe e3 = new Employe("matricule3", "nom3", 1400);
		
		List<Employe> listeEmploye = new ArrayList<>();
		listeEmploye.add(e1) ;
		listeEmploye.add(e2) ;
		listeEmploye.add(e3) ;
		
		Map<String, Integer> empMap = new HashMap<>();
		
		Set<String> empSet = new TreeSet<>(); //TreeSet pour afficher le nom dans l'ordre
		
		//Parcourir la liste et insérer les noms dans un set et matricule, salaire dans une map
		
		
		for (int i = 0; i < listeEmploye.size(); i++) {
			
			empSet.add(listeEmploye.get(i).getNom() );
			empMap.put(listeEmploye.get(i).getMatricule(), 
					listeEmploye.get(i).getSalaire());
			
			
		}
		
		
		//Afficher la map + set avec iterator
		
		Iterator<String> iterator =empSet.iterator();
		Iterator<Entry<String, Integer>> monIterator
		= empMap.entrySet().iterator();
		
		
		while (iterator.hasNext() && monIterator.hasNext()) {
			String element =   iterator.next();
			Entry<String, Integer> entry =   monIterator.next();
			
			System.out.println("Le nom de l'employé est " +element 
					+" a pour matricule " +entry.getKey() +
					" et a pour salaire " +entry.getValue() );
		}
		
		for (String emp1 : empSet) {
			
			System.out.println(emp1);
		}
		
		for (Entry<String, Integer> item : empMap.entrySet()) {
			
			System.out.println(item.getKey() + item.getValue());
		}
 

	}

}
