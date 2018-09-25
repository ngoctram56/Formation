package service;

import java.util.List;

import dao.ProjetConsultatDao;
import entities.ProjetConsultatnt;



public class ProjetConsultantService {
	
	ProjetConsultatDao ConsultantDao = new ProjetConsultatDao() ;
	
	public void save(ProjetConsultatnt projetconsultant) {
		
		ConsultantDao.save(projetconsultant);
	}
	
	public void delete (ProjetConsultatnt projetconsultant) {
		
		ConsultantDao.delete(projetconsultant);
	}
	
	public List<ProjetConsultatnt> findAll() {
		
		return ConsultantDao.findAll() ;
	}

}
