package service;

import java.util.List;

import dao.IRoleUtilisateurDao;
import entities.RoleUtilisateur;
import factory.DaoFactory;

public class RoleUtilisateurService implements IRoleUtilisateurService {
	
	IRoleUtilisateurDao dao = (IRoleUtilisateurDao) DaoFactory.createInstanceDao("ru") ;
	
	public void saveOrUpdate(RoleUtilisateur ru) {
		dao.saveOrUpdate(ru);
	}

	public List<RoleUtilisateur> findAllRoleUtilisateur() {
		return dao.findAllRoleUtilisateur() ;
		
	}
		

	public RoleUtilisateur findOneeById(Long id) {
		return dao.findOneByID(id) ;
	}

	public void deleteRoleUtilisateur(Long id) {
		dao.deleteRoleUti(id);

	}
	
	public List<String> getListRolesByUser (Long id)  {
		
		return dao.getListRolesByUser(id) ;
	}
	

}
