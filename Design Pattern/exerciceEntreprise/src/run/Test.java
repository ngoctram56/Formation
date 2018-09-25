package run;

import java.util.ArrayList;

import entities.Employe;
import entities.Entreprise;
import factory.DaoFactory;
import factory.ServiceFactory;
import service.EmployeService;
import service.EntrepriseService;
import service.IEmployeService;
import service.IEntrepriseService;

public class Test {

	
	public static void main(String[] args) {
		
		IEntrepriseService entrepriseService = (IEntrepriseService) ServiceFactory.createInstanceService("en") ;
		IEmployeService employeService = (IEmployeService) ServiceFactory.createInstanceService("em") ;
	
		

		Entreprise e1 = new Entreprise("designation1", "adresse1") ;
		
		Employe emp1 = new Employe("nom1", "prenom1", 2200d, e1) ;
		
		
		entrepriseService.saveOrUpdate(e1);
		employeService.saveOrUpdate(emp1);

		
		System.out.println(entrepriseService.findAllEntreprise());
		System.out.println(employeService.findAllEmploye());
		
		System.out.println(employeService.salaireAnnuel(1l));
		System.out.println(entrepriseService.calculMasseSalariale(1l));
		


	
	
		 }

}
