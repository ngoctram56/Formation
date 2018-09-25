package run;

import java.util.ArrayList;
import java.util.List;

import dao.DepartementDao;
import dao.EmployeDao;
import entity.Departement;
import entity.Employe;

public class Run {
	public static void main(String[] args) {

		EmployeDao employeDao = new EmployeDao();
		DepartementDao departementDao = new DepartementDao();
		//
		Departement dp1 = new Departement("12-2563");
		Departement dp2 = new Departement("22-2563");
		List<Departement> departements = new ArrayList<>();
		departements.add(dp1);
		departements.add(dp2);
		Employe emp = new Employe("nom", "prenom", departements);

		employeDao.saveOrUpdate(emp);

		System.out.println(employeDao.findAll().size());
		System.out.println(departementDao.findAll().size());
//		employeDao.remove(emp);
//		System.out.println(employeDao.findAll().size());
//		System.out.println(departementDao.findAll().size());

	}
}
