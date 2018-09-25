package com.adaming.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.adaming.entities.Users;
import com.adaming.utils.Connexion;

public class UsersDAO {

	public void inserer(Users util) {
		try {
			Connexion.seConnecter();

			String sql = "INSERT INTO Users (username, password, fullname, email) "
					+ " VALUES (?, ?, ?, ?)";

			PreparedStatement statement = Connexion.conn.prepareStatement(sql);

			statement.setString(1, util.getUsername());
			statement.setString(2, util.getPassword());
			statement.setString(3, util.getFullname());
			statement.setString(4, util.getEmail());

			int rows = statement.executeUpdate();
			if (rows > 0) {
				System.out.println("A new user was inserted successfully!");
			}

			Connexion.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void supprimer(Long id) {
		try {
			Connexion.seConnecter();

			String sql = "delete from  Users where userID =? ";

			PreparedStatement statement = Connexion.conn.prepareStatement(sql);
			statement.setLong(1, id);

			int rows = statement.executeUpdate();
			if (rows > 0) {
				System.out.println("A  user was deleted successfully!");
			}

			Connexion.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modifier(Users util) {
		try {
			Connexion.seConnecter();

			String sql = "update Users set username= ?, password =?, " + "fullname =?, email =? where userID= ?";

			PreparedStatement statement = Connexion.conn.prepareStatement(sql);
			statement.setString(1, util.getUsername());
			statement.setString(2, util.getPassword());
			statement.setString(3, util.getFullname());
			statement.setString(4, util.getEmail());
			statement.setLong(5, util.getUserID());

			int rows = statement.executeUpdate();
			if (rows > 0) {
				System.out.println("A  user was modififed successfully!");
			}

			Connexion.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Users> findAll() {
		List<Users> liste = new ArrayList<>();
		try {

			Connexion.seConnecter();
			String sql = "SELECT * FROM Users";

			PreparedStatement statement = Connexion.conn.prepareStatement(sql);

			ResultSet result = statement.executeQuery();

			while (result.next()) {
			 

				liste.add(new Users(result.getLong(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
			}

			Connexion.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	public Users findOne(Long idUser) {
		Users u = null;
		try {

			Connexion.seConnecter();
			String sql = "SELECT * FROM Users where userID= ?";

			PreparedStatement statement = Connexion.conn.prepareStatement(sql);
			statement.setLong(1, idUser);
			ResultSet result = statement.executeQuery();

			while (result.next()) {
			 

				u = new Users(result.getLong(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5));
			}

			Connexion.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

}
