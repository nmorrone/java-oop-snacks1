package org.lessons.java.snacks1;


public class RegistroStudenti extends Studente2{
	
	private String nameRegistro;
	private Studente2 [] studenti;
	
	
	RegistroStudenti(String name, int m){
		
		this.nameRegistro = name;
		
		studenti = new Studente2[m];
		
	}

	
	//apro metodi getter e setter
	public void setRegistro(String name) {
		this.nameRegistro = name;
	}
	
	public String getRegistro() {
		return this.nameRegistro;
	}
	
	//metodo aggiunta utente array con indicazione posizione
	public void setAlunno(Studente2 s, int m) {
		studenti[m] = s;
	}
	
	//meotodo stampa
	void stampaRegistro() {
		for (int i = 0; i < studenti.length; i++) {
			System.out.print(studenti[i].getName());
		}
	}


}
