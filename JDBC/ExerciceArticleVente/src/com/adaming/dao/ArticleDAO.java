package com.adaming.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adaming.dto.RecapArticleDTO;
import com.adaming.entities.Article;
import com.adaming.interfaces.IGeneric;
import com.adaming.utils.ConnexionDB;

public class ArticleDAO implements IGeneric<Article> {
	public void inserer(Article art) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn
					.prepareStatement("insert into Article (designation, prixUnitaire, qte_stock) value (?,?,?)");
			stat.setString(1, art.getDesignation());
			stat.setDouble(2, art.getPrixUnitaire());
			stat.setInt(3, art.getQteStock());

			int rows = stat.executeUpdate();
			if (rows > 0) {
				System.out.println("Un article a été inséré correctement");
			}
			ConnexionDB.seDeconnecter();
		} catch (SQLException e) {
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
		}

	}

	public List<Article> findAll() {

		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement("select* from article");
			ResultSet r = stat.executeQuery();
			List<Article> liste = new ArrayList<>();
			while (r.next()) {
				Article a = new Article(r.getInt(1), r.getString(2), r.getDouble(3), r.getInt(4));
				liste.add(a);
			}
			ConnexionDB.seDeconnecter();
			return liste;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
			return null;
		}
	}

	public Article findOne(int code) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement("select* from article where code = ?");
			stat.setLong(1, code);
			ResultSet r = stat.executeQuery();
			Article art = null;
			while (r.next()) {
				art = new Article(r.getInt(1), r.getString(2), r.getDouble(3), r.getInt(4));
			}
			ConnexionDB.seDeconnecter();
			return art;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
			return null;
		}

	}

	public void update(Article art) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement(
					"update article set designation = ?, prixUnitaire =?, qte_stock =? where code =?");
			stat.setLong(4, art.getCode());
			stat.setString(1, art.getDesignation());
			stat.setDouble(2, art.getPrixUnitaire());
			stat.setLong(3, art.getQteStock());
			int rows = stat.executeUpdate();
			if (rows > 0) {
				System.out.println("A new Article have been updated");
				ConnexionDB.seDeconnecter();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
		}
	}

	public void delete(Long code) {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement("delete from article where code=?");
			stat.setLong(1, code);

			int rows = stat.executeUpdate();
			if (rows > 0) {
				System.out.println("A new Article have been deleted");
				ConnexionDB.seDeconnecter();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
		}
	}

	public Double valeurStock() {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn
					.prepareStatement("select sum(prixUnitaire*qte_stock) from article");
			ResultSet r = stat.executeQuery();

			Double valStock = null;
			while (r.next()) {
				valStock = (r.getDouble(1));
			}
			ConnexionDB.seDeconnecter();
			return valStock;
		} catch (SQLException e) {

			e.printStackTrace();
			ConnexionDB.seDeconnecter();
			return null;
		}

	}

	public List<RecapArticleDTO> findAllRecapArticle() {
		try {
			ConnexionDB.seConnecter();
			PreparedStatement stat = ConnexionDB.conn.prepareStatement("select* from recap_article");
			ResultSet r = stat.executeQuery();
			List<RecapArticleDTO> listeDTO = new ArrayList<>();
			while (r.next()) {
				RecapArticleDTO ra = new RecapArticleDTO(r.getInt(1), r.getDouble(2), r.getInt(3), r.getInt(4),
						r.getDouble(5));
				listeDTO.add(ra);
			}
			ConnexionDB.seDeconnecter();
			return listeDTO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionDB.seDeconnecter();
			return null;

		}

	}

}
