package dao;

import java.util.List;



import entities.RoleUtilisateur;


public interface IRoleUtilisateurDao {

	public void saveOrUpdate(RoleUtilisateur uti);

	public RoleUtilisateur findOneByID(Long id);

	public void deleteRoleUti(Long id);

	public List<RoleUtilisateur> findAllRoleUtilisateur();
	
	public List<String> getListRolesByUser (Long id) ;
	


}
