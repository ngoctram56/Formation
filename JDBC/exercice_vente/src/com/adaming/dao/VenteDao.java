package com.adaming.dao;


import com.adaming.entites.Vente;
import com.adaming.interfaces.IDaoGeneric;
import com.adaming.interfaces.IVente;
import com.adaming.utils.ConnexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VenteDao implements IDaoGeneric<Vente>, IVente{
	
	 
	//creation article
	
	ArticleDao adao = new ArticleDao() ;
	
	
	public void inserer (Vente vente) {
		
		
		ConnexionBD.seConnecter();
		
		try {
			PreparedStatement st = ConnexionBD.conn.prepareStatement("insert into vente(code, qte, annee) values (?,?,?)") ;
			

			st.setInt(1, vente.getArticles().getCode());
			st.setInt(2, vente.getQte());
			st.setInt(3, vente.getAnnee());
			
			int rows = st.executeUpdate();
			if (rows > 0) {
				System.out.println("Une nouvelle vente a a été ajoutée!");
			}
			
			
			ConnexionBD.seDeconnecter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public Vente findOne(int id) {
		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from vente where id = ?");

			statement.setInt(1, id);


			ResultSet r = statement.executeQuery();

			Vente ven = new Vente();

			while (r.next()) {

				Vente ve = new Vente(r.getInt(1), adao.findOne(r.getInt(2)), r.getInt(3), r.getInt(4));

				ven = ve;

			}

			ConnexionBD.seDeconnecter();
			return ven;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public List<Vente> findall() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("select * from vente ");

			List<Vente> liste = new ArrayList<>();

			ResultSet r = statement.executeQuery();

			while (r.next()) {

				Vente ve = new Vente(r.getInt(1), adao.findOne(r.getInt(2)), r.getInt(3), r.getInt(4));
				liste.add(ve);

			}

			ConnexionBD.seDeconnecter();
			return liste;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public void update(Vente vente) {

		try {
			ConnexionBD.seConnecter();

			String sql = "Update vente SET code=?, qte=?, annee=? where id = ?";

			PreparedStatement statement = ConnexionBD.conn.prepareStatement(sql);

			statement.setInt(1, vente.getArticles().getCode());
			statement.setInt(2, vente.getQte());
			statement.setInt(3, vente.getAnnee());
			statement.setInt(4, vente.getId());

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

	public void delete(int id) {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn.prepareStatement("delete from vente where id = ?");

			statement.setInt(1, id);

			int r = statement.executeUpdate();

			if (r > 0) {
				System.out.println("Suppression de la vente");
			}

			ConnexionBD.seDeconnecter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public double valeur_total() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn
			.prepareStatement("select qte_stock * prix_unitaire from vente v, article a where a.code=v.code");

			ResultSet r = statement.executeQuery();
			

			double valeur = 0;

			while (r.next()) {
				
				valeur=  r.getDouble(1) ;
			

			}

			ConnexionBD.seDeconnecter();
			return valeur;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;

		}

	}
	
	public int valeur_total_vente() {

		try {
			ConnexionBD.seConnecter();

			PreparedStatement statement = ConnexionBD.conn
					.prepareStatement("select sum(qte_stock * prix_unitaire) from vente v, article a where a.code=v.code group by a.code");

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
