package service;

import java.util.Date;
import java.util.List;

import dao.Journaldao;
import dao.Motodao;
import entities.Journal;
import entities.Moto;

public class MotoService {
	
	Motodao mdao = new Motodao() ;
	Journaldao jdao = new Journaldao() ;
	
	public void create(Moto moto) {
		
		mdao.create(moto);
		Journal j = new Journal("creation d'une moto", new Date());
		jdao.inserer(j);
	}
	
	public void modifier(Moto moto) {
		
		mdao.modifier(moto);
		Journal j = new Journal("Modification d'une moto", new Date());
		jdao.inserer(j);
	}
	
	public void delete(Moto moto) {
		
		mdao.delete(moto);
		Journal j = new Journal("Suppression d'une moto", new Date());
		jdao.inserer(j);
	}
	
	public List<Moto> findAll() {
		
		return mdao.findAll() ;
		
		
	}
	
	public Moto findOne(Long id) {
		
		return mdao.findOne(id);
	}
	
	

}
