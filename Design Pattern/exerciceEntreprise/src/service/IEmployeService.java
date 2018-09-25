package service;

import java.util.List;

import entities.Employe;

public interface IEmployeService {
	
	public void saveOrUpdate(Employe employe) ;
	
	public List<Employe> findAllEmploye() ;

	public List<Employe> findAllEmployeByNom(String nom) ;

	public Employe findOneeById(Long id) ;

	public void deleteEmploye(Long id) ;
	
	public Double salaireAnnuel(Long id) ; 

}
