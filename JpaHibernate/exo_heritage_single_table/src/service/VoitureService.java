package service;

import java.util.List;

import dao.VoitureDao;
import entities.Voiture;

public class VoitureService {
	
	VoitureDao vdao = new VoitureDao() ;
	
	public void create (Voiture voiture) {
		
		vdao.create(voiture);
		
	}
	
	
	public List<Voiture> findAllHQL() {
		
		return vdao.findAllHQL() ;
		
		
	}
	
	public List<Voiture> findSQL() {
		
		return vdao.findAllSQL() ;
	}

}
