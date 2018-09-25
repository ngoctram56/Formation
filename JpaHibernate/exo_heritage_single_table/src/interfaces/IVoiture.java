package interfaces;

import java.util.List;

import entities.Voiture;


public interface IVoiture {
	
	public void create(Voiture voi) ;

	
	public List<Voiture> findAllHQL() ;
	
	public List<Voiture> findAllSQL() ;

}
