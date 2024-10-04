package org.lessons.java.snacks1;

public class Studente2{

	
	String name;
	String surname;

	Studente2 (String name, String surname){
		this.name = name;
		this.surname = surname;
		
	}
	
	Studente2(){
		setUtente(name, surname);
	}
	
	public void setUtente(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	
}
