package org.lessons.java.snacks1;

public class TestMainUtilities3 {
	
	public static void main (String[]args) {
		
		RegistroStudenti registro1 = new RegistroStudenti();
		
		registro1.aggiungiUtente("Nicola", "Morrone", 28);
		
		
		System.out.println(registro1.Studente[0]);
	}

}
