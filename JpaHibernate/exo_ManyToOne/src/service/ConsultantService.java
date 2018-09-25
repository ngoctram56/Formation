package service;

import java.util.List;

import dao.ConsultantDao;
import entities.Consultant;

public class ConsultantService {
	
	ConsultantDao ConsultantDao = new ConsultantDao() ;
	
	public void save(Consultant consultant) {
		
		ConsultantDao.save(consultant);
	}
	
	public void delete (Consultant consultant) {
		
		ConsultantDao.delete(consultant);
	}
	
	public List<Consultant> findAll() {
		
		return ConsultantDao.findAll() ;
	}


}
