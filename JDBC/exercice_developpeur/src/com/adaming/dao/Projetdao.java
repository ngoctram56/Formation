package com.adaming.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adaming.entites.Projet;
import com.adaming.utils.ConnexionBD;

public class Projetdao {

	public void inserer(Projet projet) {
		try {
			ConnexionBD.seConnecter();

			String sql = "INSERT INTO projet (clients, libelle) VALUES (?, ?)";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);

			statement.setString(1, projet.getClient());
			statement.setString(2, projet.getLibelle());

			int rows = statement.executeUpdate();
			if (rows > 0) {
				System.out.println("Un nouveau projet a été ajouté!");
			}

			ConnexionBD.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void update(Projet projet) {

		try {
			ConnexionBD.seConnecter();

			String sql = "Update projet SET clients=?, libelle=? where id_projet = ?";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);

			statement.setString(1, projet.getClient());
			statement.setString(2, projet.getLibelle());
			statement.setInt(3, projet.getId_projet());

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
	
	public void delete(int id_projet) {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("delete from projet where id_projet = ?");

			statement.setInt(1, id_projet);

			int r = statement.executeUpdate();

			if (r > 0) {
				System.out.println("Suppression du projet");
			}

			ConnexionBD.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	
	}
	
	public Projet findOne(int id_projet) {
		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from projet where id_projet = ?");

			statement.setInt(1, id_projet);


			ResultSet r = statement.executeQuery();

			Projet pr = new Projet();

			while (r.next()) {

				Projet pro = new Projet(r.getInt(1),r.getString(2), r.getString(3)) ;

				pr = pro;

			}

			ConnexionBD.seDeconnecter();
			return pr ;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	


	public List<Projet> findall() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from projet ");

			List<Projet> liste = new ArrayList<>();

			ResultSet r = statement.executeQuery();

			while (r.next()) {

				Projet p = new Projet(r.getInt(1),r.getString(2), r.getString(3)) ;
				liste.add(p) ;

			}

			ConnexionBD.seDeconnecter();
			return liste;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
}
