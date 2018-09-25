package modele;

public abstract class DocumentVente {
	
	protected int num ;
	protected int annee ;
	protected Article [] article ;
	
	
	public DocumentVente() {
		super();
	
	}


	public DocumentVente(int num, int annee, Article[] article) {
		super();
		this.num = num;
		this.annee = annee;
		this.article = article;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public Article[] getArticle() {
		return article;
	}


	public void setArticle(Article[] article) {
		this.article = article;
	}
	
	//methode abstracte 
	
	public abstract double calculTotal () ;


	
	

}
