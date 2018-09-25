package service;

import java.util.List;

import dao.EmployeDao;
import entities.Employe;


public class EmployeService {
	
	EmployeDao employeDao = new EmployeDao() ;
	
	public void create (Employe employe) {
		
		employeDao.create(employe);

	
	}
	
	public List<Employe> findAll() {
		
		return employeDao.findAll() ;
		
		
	}

}
