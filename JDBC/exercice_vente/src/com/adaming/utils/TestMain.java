package com.adaming.utils;

import com.adaming.dao.ArticleDao;
import com.adaming.dao.VenteDao;
import com.adaming.entites.Article;
import com.adaming.entites.Vente;

public class TestMain {

	public static void main(String[] args) {

		ConnexionBD.seConnecter();

		ArticleDao adao = new ArticleDao();

//		Article a1 = new Article("article1", 12.5d, 5);
//		Article a2 = new Article("article2", 15d, 16);
//		Article a3 = new Article("article3", 25d, 89);
//
//		adao.inserer(a1);
//		adao.inserer(a2);
//		adao.inserer(a3);
//
//		System.out.println(adao.findall());
//
//		Article ar1 = adao.findOne(2);
//		ar1.setPrix_unitaire(45d);
//		adao.update(ar1);
//
//		System.out.println("La valeur du stock est de " + adao.valeur_stock());

		VenteDao vdao = new VenteDao();

//		Vente v1 = new Vente(ar1, 5, 2009);
//		Vente v2 = new Vente(ar1, 9, 2010);
//
//		vdao.inserer(v1);
//		vdao.inserer(v2);
//
//		Vente ve = vdao.findOne(2);
//		ve.setAnnee(2008);
//		vdao.update(ve);
//
//		System.out.println("La veleur total d'une opération de vente est de " + vdao.valeur_total());
//
//		System.out.println("La valeur total des ventes est de " + vdao.valeur_total_vente());
//
//		adao.delete(1);
//		vdao.delete(1);

		
		System.out.println(adao.findAllRecapArticle());
	}

}
