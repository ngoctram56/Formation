package service;

import java.util.List;

import dao.ProjetDao;
import entities.Projet;

public class ProjetService {
	
	ProjetDao projetDao = new ProjetDao() ;
	
	public void save(Projet projet) {
		
		projetDao.save(projet);
	}
	
	public void delete (Projet projet) {
		
		projetDao.delete(projet);
	}
	
	public List<Projet> findAll() {
		
		return projetDao.findAll() ;
	}

}
