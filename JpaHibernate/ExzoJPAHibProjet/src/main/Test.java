package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dao.ProjetDAO;
import entities.Projet;

public class Test {

	public static void main(String[] args) {

		ProjetDAO projetDAO = new ProjetDAO();

		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy"); // MM majuscule pour mois sinon m=minutes
		SimpleDateFormat formatHeure = new SimpleDateFormat("hh:mm");
		SimpleDateFormat formatDateHeure = new SimpleDateFormat("hh:mm,dd/MM/yyyy");

		Date date1 = null;
		Date date2 = null;
		Date date3 = null;
		Date date4 = null;
		Date date5 = null;
		try {
			date1 = formatDate.parse("25/12/2015");
			date2 = formatDate.parse("25/10/2016");
			date3 = formatHeure.parse("21:30");
			date4 = formatHeure.parse("14:15");
			date5 = formatDateHeure.parse("16:22,17/05/2017");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Projet p1 = new Projet("designation", "Dassault", date1, date3, date2, date4, date5, 1000d);
		Projet p2 = new Projet("designation2", "Dassault", date1, date3, date2, date4, date5, 25000d);
		Projet p3 = new Projet("designation", "Vinci", date1, date3, date2, date4, date5, 12000d);
		Projet p4 = new Projet("designation", "Vinci", date1, date3, date2, date4, date5, 500d);
		Projet p5 = new Projet("designation", "Bouygues", date1, date3, date2, date4, date5, 1350000d);

		projetDAO.create(p1);
		projetDAO.create(p2);
		projetDAO.create(p3);
		projetDAO.create(p4);
		projetDAO.create(p5);
		
		
		projetDAO.delete(p4);
		
		
		System.out.println(projetDAO.nombreProjetsHQL());

		System.out.println(projetDAO.coutTotal() + "\n");

		List<Projet> lp = projetDAO.projetsClient("Dassault");

		for (Projet px : lp) {
			System.out.println(px);
		}

		List<Projet> lp2 = projetDAO.projetsCouts(2000, 120000);
		for (Projet px : lp2) {
			System.out.println("\n" + px);
		}
	}
}
