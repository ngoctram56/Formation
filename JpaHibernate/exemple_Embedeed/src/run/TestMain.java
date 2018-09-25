package run;

import dao.ClientDao;
import entities.Adresse;
import entities.Client;

public class TestMain {

	public static void main(String[] args) {
		
		Adresse a1 = new Adresse(1, "rue1", "ville1");
		Adresse a2 = new Adresse(2, "rue2", "ville2");
		
		ClientDao cdao= new ClientDao() ;
		
		Client c1 = new Client(a1, 123) ;
		Client c2 = new Client(a2, 456) ;
		
		cdao.create(c1);
		cdao.create(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setRaison_sociale(1234);
		cdao.modifier(c1);
		System.out.println(c1);
		
		//cdao.delete(c1);
		//cdao.deleteID(1l);
		
		System.out.println(cdao.findAll());
		System.out.println(cdao.findOne(2l));
		System.out.println(cdao.findOne2(1l));
		

	}

}
