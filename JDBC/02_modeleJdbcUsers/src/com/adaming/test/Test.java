package com.adaming.test;

import java.util.List;

import com.adaming.dao.UsersDAO;
import com.adaming.entities.Users;

public class Test {

	public static void main(String[] args) {
		UsersDAO userDAO=new UsersDAO();
		userDAO.inserer(new Users("mbelghith", "215478", "belghith mehdi", "mbelghithj@adaming.fr"));
		userDAO.inserer(new Users("mbelghitazazh", "2155115478", "belghith mehdi", "mbelghithj@adaming.fr"));
		List<Users> allUsers = userDAO.findAll();
		for (Users element : allUsers) {
			System.out.println(element);
		}
		Users utilisateur = userDAO.findOne(1L);
		System.out.println(utilisateur);
		utilisateur.setUsername("username modifié");

		userDAO.modifier(utilisateur);
		userDAO.supprimer(2L);

		allUsers = userDAO.findAll();
		for (Users element : allUsers) {
			System.out.println(element);
		}
	}
}
