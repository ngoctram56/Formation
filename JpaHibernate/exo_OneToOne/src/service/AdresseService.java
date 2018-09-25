package service;

import java.util.List;

import dao.AdresseDao;
import entities.Adresse;

public class AdresseService {
	
	AdresseDao adresseDao = new AdresseDao() ;
	
	public void create (Adresse adresse) {
		
		adresseDao.create(adresse);
	}
	
	public List<Adresse> findAll() {
		
		
		return adresseDao.findAll() ;
	}

}
