package com.myPracticalWorks;

public class StudentMain {

	public static void main(String[] args) {
	
	Student stud1=new Student(1010, "John", 'A');
		
	//1st approach. Assign values by using reference variable  
	/* 
	stud1.sid=1010;
	stud1.sname="John";
	stud1.grade='A';
	
	stud1.display();  */
	

	//2nd approach. Assign values by using method 
	//stud1.getValues(1010, "John", 'A');
				
		stud1.display();
		
	//3rd approach. Constructor.	
		
		
		
		
		
	}

}
