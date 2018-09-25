package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import dao.ProjetDao;
import entities.Projet;

public class TestMainProjet {
	
	public static void main(String[] args) {
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/YYYY") ;
		SimpleDateFormat format2 = new SimpleDateFormat("hh:mm") ;
		SimpleDateFormat format3 = new SimpleDateFormat("dd/MM/YYYY hh:mm") ;
		
		try {
			Date d1 = format1.parse("15/12/2000") ;
			Date d2 = format1.parse("15/12/2010") ;
			Date d3 = format2.parse("12:15") ;
			Date d4 = format2.parse("15:15") ;
			Date d5 = format3.parse("12/12/1999 12:00") ;
			
			ProjetDao pdao = new ProjetDao() ;
			Projet p1 = new Projet("designation1", "client1", d1, d3, d2, d4, d5, 1500d) ;
			Projet p2 = new Projet("designation2", "client2", d1, d3, d2, d4, d5, 1800d) ;
			Projet p3 = new Projet("designation3", "client2", d1, d3, d2, d4, d5, 500d) ;
			Projet p4 = new Projet("designation4", "client2", d1, d3, d2, d4, d5, 1800d) ;
			

			
			pdao.create(p1);
			pdao.create(p2);
			pdao.create(p3);
			pdao.create(p4);
			
	
			
			System.out.println("Création projet " +p1);
			
			p1.setClient("client01");
			pdao.modifier(p1);
			System.out.println("Modification du projet " +p1);
			
			//pdao.delete(p1);
			System.out.println("Suppression du projet " +p1);
			
			System.out.println("FindAll "+pdao.findAll());
			
			System.out.println("FindOne "+pdao.findOne(2l));
			
			System.out.println("nbprojet " +pdao.nbProjet());
			
			System.out.println("cout total " +pdao.coutTotal());
			
			System.out.println(pdao.listeClient("client2"));
			
			System.out.println(pdao.listeIntervalle(1000d, 2000d));
			
			
		
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}


}
