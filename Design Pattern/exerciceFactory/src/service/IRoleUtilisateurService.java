package service;

import java.util.List;

import entities.RoleUtilisateur;

public interface IRoleUtilisateurService {

	public void saveOrUpdate(RoleUtilisateur ru);

	public List<RoleUtilisateur> findAllRoleUtilisateur();

	public RoleUtilisateur findOneeById(Long id);

	public void deleteRoleUtilisateur(Long id);
	
	public List<String> getListRolesByUser (Long id) ;

}
