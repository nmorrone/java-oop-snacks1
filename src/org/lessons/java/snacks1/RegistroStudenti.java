package org.lessons.java.snacks1;


public class RegistroStudenti extends Studente{

	String [] Studente;
	
	
	RegistroStudenti(){
		
		this.aggiungiUtente(name, surname, age);
		
	}
	
	public void aggiungiUtente(String name, String surname, int age) {
		
		this.name = name;
		this.surname = surname;
		this.age = age;

	}

	
	public void stampaRegistro() {
		for (int i = 0; i < Studente.length; i++) {

		}
	}
}
