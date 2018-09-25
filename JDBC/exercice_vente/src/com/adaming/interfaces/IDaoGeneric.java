package com.adaming.interfaces;

import java.util.List;

public interface IDaoGeneric <T> {
	
	public void inserer (T objet) ;
	public void update(T objet) ;
	public void delete(int id)  ;
	public T findOne(int code) ; //changer en long
	public List<T> findall() ;

}
