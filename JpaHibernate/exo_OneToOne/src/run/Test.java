package run;

import java.util.ArrayList;
import java.util.List;

import entities.Adresse;
import entities.Employe;
import entities.Societe;
import service.AdresseService;
import service.EmployeService;
import service.SocieteService;

public class Test {
	
	public static void main(String[] args) {
		
		
		EmployeService employeService = new EmployeService() ;
		AdresseService adresseService = new AdresseService() ;
		SocieteService societeService = new SocieteService() ;
		
		
		
		Adresse adresse1 = new Adresse(3, "adresse1", "ville1") ;
		Adresse adresse2 = new Adresse(4, "adresse2", "ville2") ;

		
		Societe societe1 = new Societe("designation1") ;
		Societe societe2 = new Societe("designation2") ;
		
		Employe employe1 = new Employe("nom1", "prenom1", adresse1, societe1) ;
		Employe employe2 = new Employe("nom2", "prenom2", adresse2, societe2) ;
		
		
	
	
//		adresseService.create(adresse1);
		employeService.create(employe1);
		
//		adresseService.create(adresse2);
		employeService.create(employe2);
		
	//	System.out.println(employeService.findAll()) ;
		//List<Adresse> listAdr=adresseService.findAll();
		

		
		
//		for (Adresse adresse : listAdr) {
//			System.out.println(adresse.getEmp());
//		}
		
		
	
		
		
		
		List<Employe> liste1 = employeService.findAll();
		

		
	
		
		

		
	}
	
	
	
	
	

}
