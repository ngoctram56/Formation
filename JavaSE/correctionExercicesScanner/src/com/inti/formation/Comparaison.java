package com.inti.formation;

public class Comparaison {
public static void main(String[] args) {
	int a=5;
	int b=6;
	boolean majeur=true;
	
	if (a !=5) {
		System.out.println("a différent de 5");
	}
	
	if (a==5 || b==6) {
		System.out.println(" !!!!!!!!!!!!!");
	}
	
	
	if (majeur) {//majeur==true
		System.out.println("il est majeur");
	}
	
	
	
	if (!majeur) {//majeur==false 
		System.out.println("il est minuer ");
	}
}
}
