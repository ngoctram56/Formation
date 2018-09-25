package com.adaming.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adaming.entites.Developpeur;
import com.adaming.utils.ConnexionBD;

public class Developpeurdao {
	
	Equipedao edao = new Equipedao() ;
	
	
public void inserer (Developpeur dev) {
		
		
		ConnexionBD.seConnecter();
		
		try {
			PreparedStatement st = ConnexionBD.conn.prepareStatement("insert into developpeur(nom, prenom, horaire, id_equipe) values (?,?,?,?)") ;
			

			st.setString(1, dev.getNom());
			st.setString(2, dev.getPrenom());
			st.setInt(3, dev.getHoraire());
			st.setInt(4, dev.getEquipes().getId_equipe());
			
			int rows = st.executeUpdate();
			if (rows > 0) {
				System.out.println("Un nouveau developpeur a a été ajoutée!");
			}
			
			
			ConnexionBD.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

	public void update(Developpeur dev) {

		try {
			ConnexionBD.seConnecter();

			String sql = "Update developpeur SET nom=?, prenom=?, horaire=?, id_equipe=? where id_dev = ?";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);


			statement.setString(1, dev.getNom());
			statement.setString(2, dev.getPrenom());
			statement.setInt(3, dev.getHoraire());
			statement.setInt(4, dev.getEquipes().getId_equipe());
			statement.setInt(5, dev.getId_dev());

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

	public void delete(int id_dev) {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("delete from developpeur where id_dev = ?");

			statement.setInt(1, id_dev);

			int r = statement.executeUpdate();

			if (r > 0) {
				System.out.println("Suppression du developeur");
			}

			ConnexionBD.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	
	public Developpeur findOne(int id_dev) {
		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from developpeur where id_dev = ?");

			statement.setInt(1, id_dev);


			ResultSet r = statement.executeQuery();

			Developpeur dev = new Developpeur();

			while (r.next()) {

				Developpeur de = new Developpeur(r.getInt(1), r.getString(2), r.getString(3), r.getInt(4), edao.findOne(r.getInt(5)));

				dev = de;

			}

			ConnexionBD.seDeconnecter();
			return dev;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public List<Developpeur> findall() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from developpeur ");

			List<Developpeur> liste = new ArrayList<>();

			ResultSet r = statement.executeQuery();

			while (r.next()) {
				Developpeur de = new Developpeur(r.getInt(1), r.getString(2), r.getString(3), r.getInt(4), edao.findOne(r.getInt(5)));
				liste.add(de);

			}

			ConnexionBD.seDeconnecter();
			return liste;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	
	public int nbDeveloppeur() {
		
		
		
		
		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn
					.prepareStatement("select count(id_dev) from developpeur group by id_equipe");

			ResultSet r = statement.executeQuery();

			int valeur = 0;

			while (r.next()) {
				
				valeur= r.getInt(1) ;

			}

			ConnexionBD.seDeconnecter();
			return valeur;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;

		}

	}
	
	

}
