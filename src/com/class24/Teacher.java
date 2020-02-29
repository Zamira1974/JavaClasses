package com.class24;
/*
 * Write a Java program called Teacher.  Identify features and
 * behavior of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and 
 * PianoTeacher that would have it their own features and behavior. Test all 4 classes 
 * */

public class Teacher  {

	public static String schoolName;
	String subject;
	int startTime;
	
	public void displayInfo (String schoolName,String subject, int startTime) {
		Teacher.schoolName=schoolName;
		this.subject=subject;
		this.startTime=startTime;
		System.out.println("My school name is "+schoolName+" and subject name is: "+subject+" which will start at: "+startTime);
	}
	public static void main(String[] args) {
		Teacher obj=new Teacher();
		obj.displayInfo("Private School", "Math", 9);
	
		MathTeacher obj1=new MathTeacher();
		obj1.displayInfo("Public Chets Creek", "Chemistry", 11);
		
		PianoTeacher obj2=new PianoTeacher();
		obj2.displayInfo("Duval Coastal", "Piano", 12);
	}
}


