package service;

import dao.Journaldao;
import entities.Journal;

public class JournalService {
	
	Journaldao journaldao = new Journaldao() ;
	
	public void create(Journal j ) {
		
		journaldao.inserer(j) ;
	}

}
