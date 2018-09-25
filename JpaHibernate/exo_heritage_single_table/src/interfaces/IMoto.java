package interfaces;

import entities.Moto;

public interface IMoto {
	
	void create (Moto moto) ;
	
	Moto findOneHQL(Long matricule) ;
	
	Moto findOneSQL(Long matricule) ; 
	
	

}
