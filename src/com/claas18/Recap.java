package com.claas18;

public class Recap {

	int students, teachers, classRooms;
	String name, address, website;
	
	public static void main(String[] args) {
		
		Recap school=new Recap();
		school.name="Syntax";
		school.students=200;
		
		Recap school1=new Recap();
		school1.name="Pinnacle";
		school1.students=150;
		
		school1.teach();
		school.study();	
	}	
	
	void study() {
		System.out.println("Student studying at "+name);
		System.out.println("");
		System.out.println("");
	}
	void teach() {
		System.out.println("Teachers teaching at "+name);
	}	
}
