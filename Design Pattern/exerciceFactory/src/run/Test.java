package run;

import java.util.Date;

import entities.Role;
import entities.RoleUtilisateur;
import entities.Utilisateur;
import factory.ServiceFactory;
import service.IRoleService;
import service.IRoleUtilisateurService;
import service.IUtilisateurService;

public class Test {

	public static void main(String[] args) {
		
		IRoleService roleService = (IRoleService) ServiceFactory.createInstanceService("ro") ;
		IUtilisateurService utilisateurService = (IUtilisateurService) ServiceFactory.createInstanceService("ut") ;
		IRoleUtilisateurService roleUtilisateurService = (IRoleUtilisateurService) ServiceFactory.createInstanceService("ru") ;
		
		Role r1 = new Role("designation1") ;
		Role r2 = new Role("designation2") ;
		
		Utilisateur u1 = new Utilisateur("nom1", "prenom1");
		Utilisateur u2 = new Utilisateur("nom2", "prenom2") ;
		
		RoleUtilisateur ru1 =  new RoleUtilisateur(r1, u1, new Date()) ;
		RoleUtilisateur ru2 = new RoleUtilisateur(r2, u2, new Date());
		
		roleService.saveOrUpdate(r1);
		roleService.saveOrUpdate(r2);
		
		utilisateurService.saveOrUpdate(u1);
		utilisateurService.saveOrUpdate(u2);
		
		roleUtilisateurService.saveOrUpdate(ru1);
		roleUtilisateurService.saveOrUpdate(ru2);
		
		System.out.println(roleService.findAllRole());
		System.out.println(utilisateurService.findAllUtilisateur());
		System.out.println(roleUtilisateurService.findAllRoleUtilisateur());
		
		System.out.println(roleUtilisateurService.getListRolesByUser(1l)) ;
		

	}

}
