package com.adaming.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adaming.entites.Affectation;
import com.adaming.utils.ConnexionBD;

public class Affectationdao {
	
	Projetdao pdao = new Projetdao() ;
	Developpeurdao ddao = new Developpeurdao() ;
	
public void inserer (Affectation aff) {
		
		
		ConnexionBD.seConnecter();
		
		try {
			
			
			StringBuffer sql = new StringBuffer("insert into affectation_projet_dev (id_projet, id_dev, duree)") ; 
			sql.append("values (?,?,?)") ;
			PreparedStatement st = ConnexionBD.conn.prepareStatement(sql.toString()) ;
			

			st.setInt(1, aff.getProjets().getId_projet());
			st.setInt(2, aff.getDeveloppeurs().getId_dev());
			st.setInt(3, aff.getDuree());
		
			int rows = st.executeUpdate();
			if (rows > 0) {
				System.out.println("Un nouveau affectation a été ajoutée!");
			}
			
			
			ConnexionBD.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

	public void update(Affectation aff) {

		try {
			ConnexionBD.seConnecter();

			String sql = "Update affectation_projet_dev  SET id_projet=?, id_dev=?, duree=?  where id_affectation = ?";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);

			
	
			statement.setInt(1, aff.getProjets().getId_projet());
			statement.setInt(2, aff.getDeveloppeurs().getId_dev());
			statement.setInt(3, aff.getDuree());	
			statement.setInt(4, aff.getId_affectation());
	
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

	public void delete(int id_aff) {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("delete from affectation_projet_dev  where id_affectation = ?");

			statement.setInt(1, id_aff);

			int r = statement.executeUpdate();

			if (r > 0) {
				System.out.println("Suppression de l'affectation");
			}

			ConnexionBD.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	
	public Affectation findOne(int id_aff) {
		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from affectation_projet_dev  where id_affectation  = ?");

			statement.setInt(1, id_aff);


			ResultSet r = statement.executeQuery();

			Affectation aff = new Affectation();

			while (r.next()) {

				Affectation de = new Affectation(r.getInt(1), pdao.findOne(r.getInt(2)), ddao.findOne(r.getInt(3)), r.getInt(4));

				aff = de;

			}

			ConnexionBD.seDeconnecter();
			return aff;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public List<Affectation> findall() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from affectation_projet_dev  ");

			List<Affectation> liste = new ArrayList<>();

			ResultSet r = statement.executeQuery();

			while (r.next()) {
				Affectation de = new Affectation(r.getInt(1), pdao.findOne(r.getInt(2)), ddao.findOne(r.getInt(3)), r.getInt(4));
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
	
	
	public int coutDuree() {
		
		
		
		
		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn
					.prepareStatement("Select duree*horaire from affectation_projet_dev a inner join developpeur d on a.id_dev=d.id_dev group by a.id_dev ");

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
