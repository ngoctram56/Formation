package com.adaming.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {
	private final static String dbURL = "jdbc:mysql://localhost:3306/vente_db";
	private final static String username = "root";
	private final static String password = "root";

	public static Connection conn;

	public static void seConnecter() {
		// Se connecter � la BD
		try {
			conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				System.out.println("Connect�");
			} else {
				System.out.println("Connexion �chou�e");

			}
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void seDeconnecter() {

		try {
			conn.close();
			System.out.println("Connexion ferm�e");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}