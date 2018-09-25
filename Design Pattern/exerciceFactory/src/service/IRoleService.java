package service;

import java.util.List;

import entities.Role;

public interface IRoleService {
	
	public void saveOrUpdate(Role role); 
	public List<Role> findAllRole() ;
	public Role findOneeById(Long id) ;
	public void deleteRole(Long id) ;

}
