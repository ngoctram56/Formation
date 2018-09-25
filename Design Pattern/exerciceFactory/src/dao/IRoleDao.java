package dao;

import java.util.List;


import entities.Role;


public interface IRoleDao {
	
public void saveOrUpdate(Role role) ;

	public Role findOneByID(Long id) ;

	public void deleteRole(Long id) ;

	public List<Role> findAllRole() ;

}
