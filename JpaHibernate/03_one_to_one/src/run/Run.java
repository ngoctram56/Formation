package run;

import dao.AdresseDao;
import dao.EmployeDao;
import entity.Adresse;
import entity.Employe;

public class Run {
	public static void main(String[] args) {

		EmployeDao employeDao = new EmployeDao();
		AdresseDao adresseDao = new AdresseDao();
		//
		Adresse adr1 = new Adresse(2, "adr1", "12-2563");

		Employe emp = new Employe("nom", "prenom", 25);
		emp.setAdresse(adr1);
		employeDao.saveOrUpdate(emp);

		System.out.println(employeDao.findAll().size());
		 System.out.println(adresseDao.findAll().size());
		 employeDao.remove(emp);
		 System.out.println(employeDao.findAll().size());
		 System.out.println(adresseDao.findAll().size());
		 
	}
}
