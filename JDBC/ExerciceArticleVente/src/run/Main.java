package run;

import com.adaming.dao.ArticleDAO;
import com.adaming.dao.VenteDAO;
import com.adaming.entities.Article;
import com.adaming.entities.Vente;
import com.adaming.utils.ConnexionDB;

public class Main {
	public static void main(String[] args) {
		
		ConnexionDB.seConnecter();
		
		ArticleDAO art = new ArticleDAO();
		// Article a1 = new Article(1, "Article 1", 10.50, 5);
		// Article a2 = new Article(2, "Article 2", 25.00, 5);
		// Article a3 = new Article(3, "Article 3", 8.24, 5);
		// art.inserer(a1);
		// art.inserer(a2);
		// art.inserer(a3);
		//
		// System.out.println(art.findAll());
		// System.out.println(art.findOne(2));
		// Article a = art.findOne(2);
		// a.setDesignation("MAJ designation");
		// art.update(a);
		//
		// art.delete(1l);
		// System.out.println(art.valeurStock());
		//
		VenteDAO vDAO = new VenteDAO();
		// Vente v1 = new Vente(a1, 12, 2015);
		// Vente v2 = new Vente(a2, 8, 2017);
		// Vente v3 = new Vente(a3, 142, 2008);
		//
		// vDAO.inserer(v1);
		// vDAO.inserer(v2);
		// vDAO.inserer(v3);
		//
		// System.out.println(vDAO.findAll());
		// System.out.println(vDAO.findOne(5));
		//
		// Vente v = vDAO.findOne(6);
		// v.setAnnee(2000);
		// vDAO.update(v);
		//
		// vDAO.delete(7);
		// System.out.println(vDAO.valeurVente(2));
		// System.out.println(vDAO.valeurTotaleVente());

//		System.out.println(art.findAllRecapArticle());
	}

}
