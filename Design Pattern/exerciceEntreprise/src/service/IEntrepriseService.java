package service;

import java.util.List;

import entities.Entreprise;

public interface IEntrepriseService {
	
	public void saveOrUpdate(Entreprise entreprise) ;

	public List<Entreprise> findAllEntreprise() ;

	public List<Entreprise> findAllEntrepriseByDesignation(String designation) ;

	public Entreprise findOneeById(Long id) ;
	
	public void deleteEntreprise(Long id) ;
	
	public Double calculMasseSalariale(Long id) ;

}
