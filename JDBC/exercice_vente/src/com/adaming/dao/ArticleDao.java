package com.adaming.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.IdUniquenessPolicyOperations;

import com.adaming.dto.RecapArticleDTO;
import com.adaming.entites.Article;
import com.adaming.interfaces.IArticle;
import com.adaming.interfaces.IDaoGeneric;
import com.adaming.utils.ConnexionBD;


public class ArticleDao implements IArticle, IDaoGeneric<Article>{

	public void inserer(Article article) {
		try {
			ConnexionBD.seConnecter();

			String sql = "INSERT INTO article (designation, prix_unitaire, qte_stock) VALUES (?, ?, ?)";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);
			
		

			statement.setString(1, article.getDesignation());
			statement.setDouble(2, article.getPrix_unitaire());
			statement.setInt(3, article.getQte_stock());

			int rows = statement.executeUpdate();
			if (rows > 0) {
				System.out.println("Un nouvel article a été ajouté!");
			}

			ConnexionBD.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public Article findOne(int code) {
		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from article where code = ?");

			statement.setLong(1, code);

			ResultSet r = statement.executeQuery();

			Article art = new Article();

			while (r.next()) {

				Article ar = new Article(r.getInt(1), r.getString(2), r.getDouble(3), r.getInt(4));

				art = ar;

			}

			ConnexionBD.seDeconnecter();
			return art;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public List<Article> findall() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from article ");

			List<Article> liste = new ArrayList<>();

			ResultSet r = statement.executeQuery();

			while (r.next()) {

				Article a = new Article(r.getInt(1), r.getString(2), r.getDouble(3), r.getInt(4));
				liste.add(a);

			}

			ConnexionBD.seDeconnecter();
			return liste;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public void update(Article article) {

		try {
			ConnexionBD.seConnecter();

			String sql = "Update article SET designation=?, prix_unitaire=?, qte_stock=? where code = ?";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);

			statement.setString(1, article.getDesignation());
			statement.setDouble(2, article.getPrix_unitaire());
			statement.setInt(3, article.getQte_stock());
			statement.setInt(4, article.getCode());

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

	public void delete(int code) {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("delete from article where code = ?");

			statement.setLong(1, code);

			int r = statement.executeUpdate();

			if (r > 0) {
				System.out.println("suppression de l'article");
			}

			ConnexionBD.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public int valeur_stock() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn
					.prepareStatement("select qte_stock as valeur_stock from article group by code;");

			ResultSet r = statement.executeQuery();

			int stock = 0;

			while (r.next()) {
				
				stock = stock +r.getInt(1) ;

			}

			ConnexionBD.seDeconnecter();
			return stock;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;

		}

	}


	public List<RecapArticleDTO> findAllRecapArticle() {
		try {
			ConnexionBD.seConnecter();
			PreparedStatement stat = ConnexionBD.conn.prepareStatement("select* from recap_article");
			ResultSet r = stat.executeQuery();
			List<RecapArticleDTO> listeDTO = new ArrayList<>();
			while (r.next()) {
				RecapArticleDTO ra = new RecapArticleDTO(r.getInt(1), r.getDouble(2), r.getInt(3), r.getInt(4),
						r.getDouble(5));
				listeDTO.add(ra);
			}
			ConnexionBD.seDeconnecter();
			return listeDTO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnexionBD.seDeconnecter();
			return null;

		}

	}





}
