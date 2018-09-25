package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class LigneFacture implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private Integer qte;
	private Double PrixUnitaire;

	@ManyToOne(cascade = CascadeType.ALL)
	private Article article;

	@ManyToOne(cascade = CascadeType.ALL)
	private Facture facture;

	public LigneFacture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LigneFacture(Integer qte, Double prixUnitaire, Article article, Facture facture) {
		super();
		this.qte = qte;
		PrixUnitaire = prixUnitaire;
		this.article = article;
		this.facture = facture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public Double getPrixUnitaire() {
		return PrixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		PrixUnitaire = prixUnitaire;
	}
	
	

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	@Override
	public String toString() {
		return "LigneFacture [id=" + id + ", qte=" + qte + ", PrixUnitaire=" + PrixUnitaire + ", article=" + article
				+ ", facture=" + facture + "]";
	}

	
}
