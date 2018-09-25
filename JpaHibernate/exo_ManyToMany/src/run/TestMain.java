package run;

import java.util.ArrayList;
import java.util.List;

import entities.Consultant;
import entities.Projet;
import service.ConsultantService;
import service.ProjetService;

public class TestMain {

	public static void main(String[] args) {
		
		ConsultantService serviceC = new ConsultantService() ;
		ProjetService serviceP = new ProjetService() ;
		
		Consultant c1 = new Consultant("nom1", "prenom1") ;
		Consultant c2 = new Consultant("nom2", "prenom2") ;
		Consultant c3 = new Consultant("nom3", "prenom3") ;
		Consultant c4 = new Consultant("nom4", "prenom4") ;
		
		
		
		List<Consultant> liste = new ArrayList<>() ;
		liste.add(c1) ;
		liste.add(c3) ;
		
		List<Consultant> liste2 = new ArrayList<>() ;
		liste2.add(c2) ;
		liste2.add(c4) ;
		
		Projet p1 = new Projet("designation", liste) ;
		Projet p2 = new Projet("designation", liste2) ;
		
		serviceC.save(c1);
		serviceC.save(c2) ;
		serviceP.save(p1);
		serviceP.save(p2);
		
		System.out.println(serviceC.findAll()) ;
		System.out.println(serviceP.findAll()) ;
		
		

	}

}
