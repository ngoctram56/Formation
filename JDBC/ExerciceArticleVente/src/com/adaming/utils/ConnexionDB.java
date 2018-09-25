package com.adaming.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {
	private final static String dbURL = "jdbc:mysql://127.0.0.1:3306/article_vente_db"; //On met 127.0.0.1 ou localhost
	private final static String username = "root";
	private final static String password = "root";

	public static Connection conn;

	public static void seConnecter() {

		try {
			conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				System.out.println("Connecté");
			} else {
				System.out.println("Connexion échouée");

			}
			 
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	public static void seDeconnecter() {

		try {
			conn.close();
			System.out.println("Connexion fermée");

		} catch (SQLException e) {

			e.printStackTrace();
		}
		


	}
	
}

