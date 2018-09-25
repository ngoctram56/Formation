package com.adaming.run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.adaming.dao.EmployeDAO;
import com.adaming.entity.Employe;

public class Run {
	public static void main(String[] args) {
		 
		EmployeDAO dao = new EmployeDAO();
		Employe e1 = new Employe("nom", "prenom", 25);
		Employe e2 = new Employe("nom2", "prenom", 25);
		dao.save(e1);
		dao.save(e2);
		System.out.println(e1);

		e1.setAge(55);
		dao.update(e1);
		System.out.println(dao.findOne(1L));
		List<Employe> employes = dao.findAllAvecSQL();

		for (Employe item : employes) {
			System.out.println(item);
		}

		dao.remove(e2);
		List<Employe> employesV2 = dao.findAllAvecSQL();

		for (Employe item : employesV2) {
			System.out.println(item);
		}

 	}
}
