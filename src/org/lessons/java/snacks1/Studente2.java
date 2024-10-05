package org.lessons.java.snacks1;

public class Studente2{

	
	private String name;
	private String surname;

	Studente2 (String name, String surname){
		this.name = name;
		this.surname = surname;
		
	}

	Studente2(){
		setName(name);
		setSurname(surname);
	}

	
	//apro metodi getter e setter
	public void setName (String name) {
		this.name = name;
		
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setSurname (String surname) {
		this.surname = surname;
		
	}
	
	public String getSurname () {
		return this.surname;
	}
	
}
