package service;

import java.util.List;

import dao.EntrepriseDao;
import dao.IEntrepriseDao;
import entities.Entreprise;
import factory.DaoFactory;


public class EntrepriseService implements IEntrepriseService {
	
	//IEntrepriseDao dao = new EntrepriseDao() ;
	
	IEntrepriseDao dao = (IEntrepriseDao) DaoFactory.createInstanceDao("en") ;

	public EntrepriseService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void saveOrUpdate(Entreprise entreprise) {
		dao.saveOrUpdate(entreprise);
	}

	public List<Entreprise> findAllEntreprise() {
		return dao.findAllEntreprise();
	}

	public List<Entreprise> findAllEntrepriseByDesignation(String designation) {

		return dao.findAllEntrepriseByDesignation(designation);
	}

	public Entreprise findOneeById(Long id) {
		return dao.findOneByID(id);
	}

	public void deleteEntreprise(Long id) {
		dao.deleteEntreprise(id);

	}
	
	public Double calculMasseSalariale(Long id) {
		return dao.calculMasseSalariale(id) ;
	}
	

}
