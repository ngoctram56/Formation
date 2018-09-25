package service;

import java.util.List;

import entities.Utilisateur;

public interface IUtilisateurService {

	public void saveOrUpdate(Utilisateur uti);

	public List<Utilisateur> findAllUtilisateur();

	public Utilisateur findOneeById(Long id);

	public void deleteUtilisateur(Long id);

}
