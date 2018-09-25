package com.adaming.utils;

import com.adaming.dao.Usersdao;
import com.adaming.entities.Users;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ConnexionBD.seConnecter(); //seConnecter est une methode statique
	
	
	Usersdao udao = new Usersdao();
	
	Users u1 =  new Users(1l, "username", "password", "fullname", "email") ; 
	
	udao.inserer(u1); //inserer est une méthode non statique
	
	Users u2 = new Users("username2", "password2", "fullname2", "email2");
	
	udao.inserer(u2);
	
	System.out.println(udao.findall()) ;
	
	
	Users ux = udao.findOne(2l) ;
	ux.setPassword("passe");
	udao.update(ux);
	
	
	udao.delete(1l);

	
	}

}
