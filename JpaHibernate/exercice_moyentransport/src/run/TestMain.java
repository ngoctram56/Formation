package run;

import java.util.Date;

import dao.Journaldao;
import dao.Motodao;
import dao.Voituredao;
import entities.FicheInfo;
import entities.Journal;
import entities.Moto;
import entities.Voiture;
import service.MotoService;
import service.VoitureService;

public class TestMain {

	public static void main(String[] args) {
		
		
		
		FicheInfo f1 = new FicheInfo(42000, "nomChauffeur1", "prenomChauffeur1") ;
		FicheInfo f2 = new FicheInfo(42000, "nomChauffeur2", "prenomChauffeur2") ;
		FicheInfo f3 = new FicheInfo(32000, "nomChauffeur3", "prenomChauffeur3") ;
		FicheInfo f4 = new FicheInfo(52000, "nomChauffeur4", "prenomChauffeur4") ;
		
//		
//		Voituredao vdao = new Voituredao() ;
//		Motodao mdao = new Motodao() ;
		
		Voiture v1 = new Voiture(1234l, "couleur1", 1000, "options1", f1) ;
		Voiture v2 = new Voiture(5678l, "couleur2", 2000, "options2", f2) ;
		
		Moto m1 = new Moto(1122l, "couleur11", 2000) ;
		Moto m2 = new Moto(2233l, "couleur22", 1000) ;
		
//		vdao.create(v1);
//		vdao.create(v2);
//		
//		v1.setCouleur("rouge");
//		vdao.modifier(v1);
//		
//		System.out.println(vdao.findAll());
//		System.out.println(vdao.findOne(1234l));
//		
//		mdao.create(m1);
//		mdao.create(m2);
//		
//		m1.setCouleur("noire");
//		mdao.modifier(m1);
//		
//		System.out.println(mdao.findAll());
//		System.out.println(mdao.findOne(1122l));
//		
//		Journal j1 = new Journal("créer une moto", new Date());
//		System.out.println(j1);
//		
		
	
		VoitureService voitureService = new VoitureService() ;
		MotoService motoService = new MotoService() ;
		
		
		
		voitureService.create(v1);
		voitureService.create(v2);
		System.out.println(v1);
		voitureService.delete(v1);
		System.out.println(voitureService.findAll());
		System.out.println(motoService.findOne(5678l));
		
		
		motoService.create(m1);
		motoService.create(m2);
		motoService.delete(m1);
		System.out.println(motoService.findOne(2233l));	
		System.out.println(motoService.findAll());
	}

}
