package service;

import dao.MotoDao;
import entities.Moto;


public class MotoService {
	
	MotoDao motoDao = new MotoDao() ;
	
	public void create(Moto m) {
		
		motoDao.create(m);
	}
	
	public Moto findOneSQL(Long matricule) {
		
		return motoDao.findOneSQL(matricule) ;
	}
	
	
	public Moto findOneHQL (Long matricule) {
		
		return motoDao.findOneHQL(matricule) ;
	}
	
	

}
