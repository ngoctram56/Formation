package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="t_journal")

public class Journal {

	@Id
	@GeneratedValue
	private Long id_journal ;
	private String action ;
	@Temporal(value=TemporalType.DATE)
	private Date dateAction ;
	
	
	public Journal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Journal(Long id_journal, String action, Date dateAction) {
		super();
		this.id_journal = id_journal;
		this.action = action;
		this.dateAction = dateAction;
	}


	public Journal(String action, Date dateAction) {
		super();
		this.action = action;
		this.dateAction = dateAction;
	}


	public Long getId_journal() {
		return id_journal;
	}


	public void setId_journal(Long id_journal) {
		this.id_journal = id_journal;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public Date getDateAction() {
		return dateAction;
	}


	public void setDateAction(Date dateAction) {
		this.dateAction = dateAction;
	}


	@Override
	public String toString() {
		return "Journal [id_journal=" + id_journal + ", action=" + action + ", dateAction=" + dateAction + "]";
	}
	
	
	
	
	
}
