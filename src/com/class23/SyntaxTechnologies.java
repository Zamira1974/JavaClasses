package com.class23;
/* Complete the SyntaxTechnologies.java class:
Include the following class variables:
* schoolName(String)
* batch(int)
* year(String)
* lastDayOfClass(String)

Write two constructors:
* non-argument constructor
* parameterized constructor

Create two different objects of the SyntaxTechnologies class using both constructors and print the values of the properties inline
Output:
null 0 null null
Syntax 4 2019 07/30/2019
	
*/
public class SyntaxTechnologies {

	String schoolName;
	int batch;
	String year;
	String lastDayOfClass;
	
	SyntaxTechnologies() {
	}
	
	SyntaxTechnologies(String name, int sBatch, String sYear, String lDofC) {
		schoolName=name;
		batch=sBatch;
		year=sYear;
		lastDayOfClass=lDofC;
	}
	
	public static void main(String[] args) {
		SyntaxTechnologies obj1=new SyntaxTechnologies();
		SyntaxTechnologies obj2=new SyntaxTechnologies("Syntax", 4, "2019", "07/30/2019");
		obj1.displayInfo();
		obj2.displayInfo();
	}
	
	public void displayInfo() {
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
}
