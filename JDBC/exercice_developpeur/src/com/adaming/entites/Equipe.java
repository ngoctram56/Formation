package com.adaming.entites;

public class Equipe {
	
	private int id_equipe ;
	private String designation ;
	
	
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Equipe(int id_equipe, String designation) {
		super();
		this.id_equipe = id_equipe;
		this.designation = designation;
	}
	
	
	
	public Equipe(String designation) {
		super();
		this.designation = designation;
	}


	public int getId_equipe() {
		return id_equipe;
	}


	public void setId_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Equipe [id_equipe=" + id_equipe + ", designation=" + designation + "]";
	}
	
	
	
	

}

