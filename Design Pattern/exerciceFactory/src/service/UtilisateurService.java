package service;

import java.util.List;

import dao.IUtilisateurDao;
import entities.Utilisateur;
import factory.DaoFactory;

public class UtilisateurService implements IUtilisateurService{
	

	
	IUtilisateurDao dao = (IUtilisateurDao) DaoFactory.createInstanceDao("ut") ;
	
	public void saveOrUpdate(Utilisateur uti) {
		dao.saveOrUpdate(uti);
	}

	public List<Utilisateur> findAllUtilisateur() {
		return dao.findAllUtilisateur() ;
	}

	public Utilisateur findOneeById(Long id) {
		return dao.findOneByID(id) ;
	}

	public void deleteUtilisateur(Long id) {
		dao.deleteUtilisateur(id);

	}
	

}
