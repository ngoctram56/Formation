package com.adaming.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adaming.entities.Vente;
import com.adaming.utils.ConnexionDB;

public class VenteDAO {

	ArticleDAO art = new ArticleDAO();

	public void inserer(Vente v) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn
					.prepareStatement("insert into vente (article, qte, annee) value (?,?,?)");
			stat.setInt(1, v.getArticle().getCode());
			stat.setInt(2, v.getQuantite());
			stat.setInt(3, v.getAnnee());

			int rows = stat.executeUpdate();
			if (rows > 0) {
				System.out.println("Une vente a été correctement insérée");
			}
			ConnexionDB.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
		}

	}

	public List<Vente> findAll() {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement("select* from vente");
			ResultSet r = stat.executeQuery();
			List<Vente> liste = new ArrayList<>();

			while (r.next()) {
				Vente v = new Vente(r.getInt(1), art.findOne(r.getInt(2)), r.getInt(3), r.getInt(4));
				liste.add(v);
			}
			ConnexionDB.seDeconnecter();
			return liste;
		} catch (SQLException e) {

			e.printStackTrace();
			ConnexionDB.seDeconnecter();
			return null;
		}
	}

	public Vente findOne(int id) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement("select * from vente where id = ?");
			stat.setInt(1, id);
			ResultSet r = stat.executeQuery();
			Vente v = null;
			while (r.next()) {
				v = new Vente(r.getInt(1), art.findOne(r.getInt(2)), r.getInt(3), r.getInt(4));
			}
			ConnexionDB.seDeconnecter();
			return v;
		} catch (SQLException e) {

			e.printStackTrace();
			ConnexionDB.seDeconnecter();
			return null;
		}

	}

	public void update(Vente vente) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn
					.prepareStatement("update vente set article = ?, qte =?, annee = ? where id = ?");
			stat.setInt(1, vente.getArticle().getCode());
			stat.setInt(2, vente.getQuantite());
			stat.setInt(3, vente.getAnnee());
			stat.setInt(4, vente.getId());

			int rows = stat.executeUpdate();
			if (rows > 0) {
				System.out.println("Mise à jour effectuée");

				ConnexionDB.seDeconnecter();
			}
		} catch (SQLException e) {

			e.printStackTrace();
			ConnexionDB.seDeconnecter();
		}
	}

	public void delete(int id) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement("delete from Vente where id = ?");
			stat.setInt(1, id);

			int rows = stat.executeUpdate();
			if (rows > 0) {
				System.out.println("Une vente a été supprimée");

				ConnexionDB.seDeconnecter();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
		}

	}

	public Double valeurVente(int id) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement(
					"select prixUnitaire*qte from vente v inner join article a on v.id = a.code where id = ?");
			stat.setInt(1, id);
			ResultSet r = stat.executeQuery();
			Double valeurVente = null;
			while (r.next()) {
				valeurVente = r.getDouble(1);

			}
			ConnexionDB.seDeconnecter();
			return valeurVente;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
		}
		return null;
	}

	public Double valeurTotaleVente() {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement(
					"select sum(prixUnitaire*qte) from vente v inner join article a on v.id = a.code");
			ResultSet r = stat.executeQuery();
			Double valeurTotale = null;
			while (r.next()) {
				valeurTotale = r.getDouble(1);
			}
			ConnexionDB.seDeconnecter();
			return valeurTotale;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
			return null;
		}
	}
}
