package dao;

import java.util.List;

import entities.Entreprise;


public interface IEntrepriseDao {
	
	public void saveOrUpdate(Entreprise ent) ;

	public List<Entreprise> findAllEntrepriseByDesignation (String designation) ;

	public Entreprise findOneByID(Long id) ;

	public void deleteEntreprise(Long id) ;

	public List<Entreprise> findAllEntreprise() ;
	
	
	public Double calculMasseSalariale(Long id) ;
		

}
