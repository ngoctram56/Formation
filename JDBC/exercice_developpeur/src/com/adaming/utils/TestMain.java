package com.adaming.utils;

import com.adaming.dao.Affectationdao;
import com.adaming.dao.Developpeurdao;
import com.adaming.dao.Equipedao;
import com.adaming.dao.Projetdao;
import com.adaming.entites.Affectation;
import com.adaming.entites.Developpeur;
import com.adaming.entites.Equipe;
import com.adaming.entites.Projet;

public class TestMain {

	public static void main(String[] args) {

		ConnexionBD.seConnecter();

		
		Equipedao edao = new Equipedao() ;
		Developpeurdao ddao = new Developpeurdao() ;
		Affectationdao adao = new Affectationdao() ;
		Projetdao pdao = new Projetdao() ; 
		
		// Creation d'équipe
		Equipe e1 = new Equipe("equipe 1");
		Equipe e2 = new Equipe("equipe 2");
		
//		edao.inserer(e1);
//		edao.inserer(e2);
//		

	
//		Equipe ex = edao.findOne(1) ;
//		ex.setDesignation("equipe21");
//		edao.update(ex);

		
		Projet p1 = new Projet("client1", "libelle1") ;
		
//		pdao.inserer(p1);
		
//		Projet px = pdao.findOne(1) ;
//		px.setClient("client4");
//		pdao.update(px);
		
		
		//Creation de developeur

		
		Developpeur d1 = new Developpeur( "nom1", "prenom1", 1234, edao.findOne(1)) ;
		
//		Developpeur dx = ddao.findOne(3) ;
//		dx.setHoraire(789);
//		ddao.update(dx);
//		
//		ddao.inserer(d1);
		
		//Creation d'affectation
		
		Affectation a1 = new Affectation (pdao.findOne(1), ddao.findOne(1), 200) ;
		
//		adao.inserer(a1);
		
//		Affectation ax = adao.findOne(2) ;
//		ax.setDuree(100);
//		adao.update(ax);
		
//		System.out.println(edao.findall()) ;
//		System.out.println(pdao.findall()) ;
//		System.out.println(ddao.findall()) ;
//		System.out.println(adao.findall()) ;
//		
		
		System.out.println("Le nombre de developpeur est de : "+ddao.nbDeveloppeur());
		
		System.out.println("La durée est de " +adao.coutDuree());
		
		

	}

}
