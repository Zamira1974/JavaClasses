package com.class23;

public class Student99 {

	String name;
	int grade1, grade2, grade3;
	
	Student99(String studentName, int gr1, int gr2, int gr3) {
		name = studentName;
		grade1 = gr1;
		grade2 = gr2;
		grade3 = gr3;
	}
	void average() {
		int aver=(grade1+grade2+grade3)/3;	
		System.out.println("Average grade of the student "+name+" is: "+aver+"%");
	}
}
