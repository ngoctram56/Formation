package run;

import dao.PersonneDao;
import entites.Personne;
import entites.PersonnePK;

public class TestMain {

	public static void main(String[] args) {
		
	
	
	PersonneDao pdao = new PersonneDao() ;
	
	PersonnePK ppk1 = new PersonnePK("nom1", "prenom1") ;
	PersonnePK ppk2 = new PersonnePK("nom2", "prenom2") ;
	PersonnePK ppk3 = new PersonnePK("nom3", "prenom3") ;
	
	Personne p1 = new Personne(ppk1, 22) ;
	Personne p2 = new Personne (ppk2, 35) ;
	Personne p3 = new Personne (ppk3, 45) ;
	
	
	pdao.create(p1);
	pdao.create(p2);
	pdao.create(p3);
	
	
	
	System.out.println(p1);
	
	System.out.println(pdao.findOne(ppk1));
	
	System.out.println(pdao.findAll());

}

}