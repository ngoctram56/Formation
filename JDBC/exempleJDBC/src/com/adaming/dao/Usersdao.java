package com.adaming.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adaming.entities.Users;
import com.adaming.utils.ConnexionBD;


public class Usersdao {

	public void inserer(Users util) {
		try {
			ConnexionBD.seConnecter();

			String sql = "INSERT INTO Users (username, password, fullname, email) " + " VALUES (?, ?, ?, ?)";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql); // car statiqye

			statement.setString(1, util.getUsername());
			statement.setString(2, util.getPassword());
			statement.setString(3, util.getFullname());
			statement.setString(4, util.getEmail());

			int rows = statement.executeUpdate();
			if (rows > 0) {
				System.out.println("A new user was inserted successfully!");
			}

			ConnexionBD.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public List<Users> findall() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from users");

			List<Users> listeU = new ArrayList<>();

			ResultSet r = statement.executeQuery();

			while (r.next()) {

				Users a = new Users(r.getLong(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5));
				listeU.add(a);

			}

			ConnexionBD.seDeconnecter();
			return listeU;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public void update(Users util) {

		try {
			ConnexionBD.seConnecter();

			String sql = "Update Users SET username=?, password=?, fullname=?, email=? where userID = ?";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);

			statement.setString(1, util.getUsername());
			statement.setString(2, util.getPassword());
			statement.setString(3, util.getFullname());
			statement.setString(4, util.getEmail());
			statement.setLong(5, util.getUserID());

			int rows = statement.executeUpdate();

			if (rows > 0) {
				System.out.println("Modification ok");
			}

			ConnexionBD.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void delete(long userID) {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("delete from users where userID = ?");

			statement.setLong(1, userID);

			int r = statement.executeUpdate();

			if (r > 0) {
				System.out.println("supprime!");
			}

			ConnexionBD.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public Users findOne(Long userID) {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from users where userID = ?");

			statement.setLong(1, userID);

			ResultSet r = statement.executeQuery();

			Users userR = new Users();

			while (r.next()) {

				Users user = new Users(r.getLong(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5));

				userR = user;

			}

			ConnexionBD.seDeconnecter();
			return userR;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
