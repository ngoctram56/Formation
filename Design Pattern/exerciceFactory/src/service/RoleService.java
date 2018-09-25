package service;


import java.util.List;

import dao.IRoleDao;
import entities.Role;
import factory.DaoFactory;

public class RoleService implements IRoleService {
	
	IRoleDao dao = (IRoleDao) DaoFactory.createInstanceDao("ro") ;
	
	public void saveOrUpdate(Role role) {
		dao.saveOrUpdate(role);
	}

	public List<Role> findAllRole() {
		return dao.findAllRole();
	}

	public Role findOneeById(Long id) {
		return dao.findOneByID(id) ;
	}

	public void deleteRole(Long id) {
		dao.deleteRole(id);;

	}
	

}
