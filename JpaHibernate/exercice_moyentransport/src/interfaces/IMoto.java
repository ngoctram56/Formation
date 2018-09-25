package interfaces;

import java.util.List;

import entities.Moto;


public interface IMoto {
	
	public void create(Moto mo) ;

	public void modifier(Moto mo) ;


	public void delete(Moto mo) ;

	public List<Moto> findAll() ;

	public Moto findOne(Long matricule) ;
	

}
