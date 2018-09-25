package dao;

import java.util.List;



import entities.Utilisateur;

public interface IUtilisateurDao {

	public void saveOrUpdate(Utilisateur uti);

	public Utilisateur findOneByID(Long id);

	public void deleteUtilisateur(Long id);

	public List<Utilisateur> findAllUtilisateur();

}
