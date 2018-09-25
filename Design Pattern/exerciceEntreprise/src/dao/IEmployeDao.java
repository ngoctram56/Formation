package dao;

import java.util.List;

import entities.Employe;



public interface IEmployeDao {
	
	public void saveOrUpdate(Employe emp) ;

	public List<Employe> findAllEmployeByNom (String nom) ;

	public Employe findOneByID(Long id) ;

	public void deleteEmploye(Long id) ;

	public List<Employe> findAllEmploye() ;

	public Double salaireAnnuel(Long id);

}
