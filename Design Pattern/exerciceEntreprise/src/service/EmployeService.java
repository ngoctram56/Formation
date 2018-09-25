package service;

import java.util.List;

import dao.EmployeDao;
import dao.IEmployeDao;
import entities.Employe;
import factory.DaoFactory;



public class EmployeService implements IEmployeService{

	//IEmployeDao dao = new EmployeDao() ; 
	IEmployeDao dao = (IEmployeDao) DaoFactory.createInstanceDao("em");
	
	
	public EmployeService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void saveOrUpdate(Employe employe) {
		dao.saveOrUpdate(employe);
	}

	public List<Employe> findAllEmploye() {
		return dao.findAllEmploye() ;
	}

	public List<Employe> findAllEmployeByNom(String nom) {

		return dao.findAllEmployeByNom(nom);
	}

	public Employe findOneeById(Long id) {
		return dao.findOneByID(id) ;
	}

	public void deleteEmploye(Long id) {
		dao.deleteEmploye(id);;

	}
	
	public Double salaireAnnuel(Long id) {
		
		return dao.salaireAnnuel(id) ;
	}

}
