package org.lessons.java.snacks1;


public class RegistroStudenti extends Studente2{
	
	public String nameRegistro;
	private Studente2 [] studenti;
	
	
	RegistroStudenti(String name){
		
		this.nameRegistro = name;
		
		studenti = new Studente2[20];
		
	}

	
	//meotodo stampa
	void stampaRegistro() {
		for (int i = 0; i < studenti.length; i++) {
			System.out.print(studenti[i].name);
		}
	}
	
	public void setUtente(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getUtente() {
		return (name + surname);
	}

	
}
