package org.lessons.java.snacks1;

import java.util.Scanner;

//definisco classe studente
public class Studente {

	String name;
	String surname;
	int age;
	String studentInfo;
	String info;
	
	Scanner input = new Scanner(System.in);
	
	//definisco costruttore
	Studente(){
		name = input.next();
		surname = input.next();
		age = input.nextInt();
		info = getStudentInfo();

	}
	
	String getStudentInfo() {
		String info = name + " " + surname + ", " + String.valueOf(age);
		return info;
	}
	
}



