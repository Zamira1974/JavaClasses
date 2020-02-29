package com.class21;
/*declare the instance variables as shown below. 
int aa;
String name;
float salary;
boolean value;
double age;
And then print the all. Print variables one by one the same sequence that you declare them. 

hint: output will be the default value of each variable that you created. 

Output:
0
null
0.0
false
0.0 
*/
public class InstanceVarHW133 {
	int aa;
	String name;
	float salary;
	boolean value;
	double age;

public static void main(String[] args) {
	InstanceVarHW133 iVar=new InstanceVarHW133();
	System.out.println(iVar.aa);
	System.out.println(iVar.name);
	System.out.println(iVar.salary);
	System.out.println(iVar.value);
	System.out.println(iVar.age);
}		
}
