package com.adaming.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adaming.entites.Equipe;
import com.adaming.utils.ConnexionBD;

public class Equipedao {

	public void inserer(Equipe equipe) {
		try {
			ConnexionBD.seConnecter();

			String sql = "INSERT INTO equipe (designation) VALUES (?)";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);

			statement.setString(1, equipe.getDesignation());

			int rows = statement.executeUpdate();
			if (rows > 0) {
				System.out.println("Une nouvelle equipe a été ajouté!");
			}

			ConnexionBD.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void update(Equipe equipe) {

		try {
			ConnexionBD.seConnecter();

			String sql = "Update equipe SET designation=? where id_equipe = ?";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);

			statement.setString(1, equipe.getDesignation());
			statement.setInt(2, equipe.getId_equipe());

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
	
	public void delete(int id_equipe) {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("delete from equipe where id_equipe = ?");

			statement.setInt(1, id_equipe);

			int r = statement.executeUpdate();

			if (r > 0) {
				System.out.println("Suppression de l'équpe");
			}

			ConnexionBD.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	
	}
	
	public Equipe findOne(int id_equipe) {
		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from equipe where id_equipe = ?");

			statement.setInt(1, id_equipe);


			ResultSet r = statement.executeQuery();

			Equipe eq = new Equipe();

			while (r.next()) {

				Equipe equi = new Equipe (r.getInt(1), r.getString(2)) ;

				eq = equi;

			}

			ConnexionBD.seDeconnecter();
			return eq ;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	


	public List<Equipe> findall() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from equipe ");

			List<Equipe> liste = new ArrayList<>();

			ResultSet r = statement.executeQuery();

			while (r.next()) {

				Equipe e = new Equipe (r.getInt(1), r.getString(2));
				liste.add(e);

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
