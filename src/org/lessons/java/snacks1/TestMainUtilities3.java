package org.lessons.java.snacks1;


public class TestMainUtilities3 {
	
	public static void main (String[]args) {
		
		Studente2 alunno1 = new Studente2();
		alunno1.setName("Nicola");
		alunno1.setSurname("Morrone");
		
		Studente2 alunno2 = new Studente2();
		alunno2.setName("Sara");
		alunno2.setSurname("Fiani");
		
		Studente2 alunno3 = new Studente2();
		alunno3.setName("Carmela");
		alunno3.setSurname("Morrone");
		
		Studente2 alunno4 = new Studente2();
		alunno4.setName("Emanuele");
		alunno4.setSurname("Rossi");
		
		//creo registro di classe
		RegistroStudenti registro1 = new RegistroStudenti("Registro di Classe", 4);
		//aggiungo alunni al registro
		registro1.setAlunno(alunno1, 0);
		registro1.setAlunno(alunno2, 1);
		registro1.setAlunno(alunno3, 2);
		registro1.setAlunno(alunno4, 3);
		
		
		//invoco metodo di stampa
		registro1.stampaRegistro();
}
	
}
