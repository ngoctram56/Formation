package run;

import dao.DepartementDao;
import dao.EmployeDao;
import entity.Departement;
import entity.Employe;

public class Run {
	public static void main(String[] args) {

		EmployeDao employeDao = new EmployeDao();
		DepartementDao departementDao = new DepartementDao();
		//
		Departement dp1 = new Departement( "12-2563");

		Employe emp = new Employe("nom", "prenom", dp1);
		 
		employeDao.saveOrUpdate(emp);

		System.out.println(employeDao.findAll().size());
		 System.out.println(departementDao.findAll().size());
		 employeDao.remove(emp);
		 System.out.println(employeDao.findAll().size());
		 System.out.println(departementDao.findAll().size());
		 
	}
}
