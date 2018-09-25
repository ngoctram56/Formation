package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Article {
	
	@Id
	@GeneratedValue
	private Long code;
	
	private Double prixAchat ;
	private Integer qteStock ;

	
//	@OneToMany(mappedBy="ligneFacture")
//	private List<Facture> liste = new ArrayList<>() ;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}


public Article(Double prixAchat, Integer qteStock) {
	super();
	this.prixAchat = prixAchat;
	this.qteStock = qteStock;
}


public Long getCode() {
	return code;
}


public void setCode(Long code) {
	this.code = code;
}


public Double getPrixAchat() {
	return prixAchat;
}


public void setPrixAchat(Double prixAchat) {
	this.prixAchat = prixAchat;
}


public Integer getQteStock() {
	return qteStock;
}


public void setQteStock(Integer qteStock) {
	this.qteStock = qteStock;
}


@Override
public String toString() {
	return "Article [code=" + code + ", prixAchat=" + prixAchat + ", qteStock=" + qteStock + "]";
} 
	
	
	
	
	

}
