package run;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.EmployeDao;
import entities.Employe;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		EmployeDao edao = new EmployeDao() ;
		Employe e = new Employe("nom", "prenom", new Date(), 12) ;
		Employe e1 = new Employe("nom1", "prenom1", new Date(), 5);
		
		System.out.println("Avant insertion "+e);
		
		edao.create(e);
		edao.create(e1);
		System.out.println("Après insertion " +e);
		
		e.setAge(14);
		edao.modifier(e);
		System.out.println("après modification " +e);
		
		
		
		edao.delete(e1);
		System.out.println("après suppression " +e1);
		
		System.out.println("methode findall "+edao.findAll());
		
		System.out.println("methode findone " +edao.findOne(1l));
		
		System.out.println(edao.findAll2());

	}

}
