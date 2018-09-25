package run;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Consultant;
import entities.Projet;
import entities.ProjetConsultatnt;
import service.ConsultantService;
import service.ProjetConsultantService;
import service.ProjetService;

public class TestMain {

	public static void main(String[] args) {

		ConsultantService serviceC = new ConsultantService();
		ProjetService serviceP = new ProjetService();
		ProjetConsultantService servicePP = new ProjetConsultantService();

		Projet p1 = new Projet("designation");
		Projet p2 = new Projet("designation");

		Consultant c1 = new Consultant("nom1", "prenom1");
		Consultant c2 = new Consultant("nom2", "prenom2");
		Consultant c3 = new Consultant("nom3", "prenom3");
		Consultant c4 = new Consultant("nom4", "prenom4");

		ProjetConsultatnt pc1 = new ProjetConsultatnt(p1, c1, new Date());
		ProjetConsultatnt pc2 = new ProjetConsultatnt(p2, c2, new Date());
		
		
		
		serviceC.save(c1);
		serviceC.save(c2);
		serviceP.save(p1);
		serviceP.save(p2);
		servicePP.save(pc1);
		servicePP.save(pc2);



	}

}
