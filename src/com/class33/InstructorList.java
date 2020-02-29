package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorList {

	public static void main(String[] args) {
		
//create a list that will hold 5 instructors
	List<Instructor>iList = new ArrayList<>();	
		iList.add(new Instructor("Asel", "Umurzakova"));
		iList.add(new Instructor("Diego", "Juares"));
		iList.add(new Instructor("Mohammad", "Shokiyan"));
		iList.add(new Instructor("Weqas", "Haq"));
		
		for(Instructor i : iList) {
			System.out.println(i.lastName);
			i.display();
		}	
	}
}
