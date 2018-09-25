package interfaces;

import java.util.List;

import entities.Voiture;


public interface IVoiture {
	
	public void create(Voiture voi) ;

	public void modifier(Voiture voi)  ;
	

	public void delete(Voiture voi) ;
	

	public List<Voiture> findAll()  ;
	
	public Voiture findOne(Long matricule) ;
	

}
