package service;

import java.util.List;

import dao.SocieteDao;
import entities.Societe;

public class SocieteService {
	
	SocieteDao societeDao = new SocieteDao() ;
	
public void create (Societe societe) {
		
		societeDao.create(societe);

	
	}
	
	public List<Societe> findAll() {
		
		return societeDao.findAll() ;
		
		
	}


}
