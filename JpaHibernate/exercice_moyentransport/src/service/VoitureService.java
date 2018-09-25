package service;

import java.util.Date;
import java.util.List;

import dao.Journaldao;
import dao.Voituredao;
import entities.Journal;
import entities.Voiture;

public class VoitureService {
	
	
	Voituredao vdao = new Voituredao() ;
	Journaldao jdao = new Journaldao() ;
	
	public void create(Voiture voit) {
		
		vdao.create(voit);
		Journal j = new Journal("creation d'une voiru", new Date());
		jdao.inserer(j);
	}
	
	public void modifier(Voiture voit) {
		
		vdao.modifier(voit);
		Journal j = new Journal("Modification d'une moto", new Date());
		jdao.inserer(j);
	}
	
	public void delete(Voiture voit) {
		
		vdao.delete(voit);
		Journal j = new Journal("Suppression d'une moto", new Date());
		jdao.inserer(j);
	}
	
	public List<Voiture> findAll() {
		
		return vdao.findAll() ;
		
		
	}
	
	public Voiture findOne(Long id) {
		
		return vdao.findOne(id);
	}

}
