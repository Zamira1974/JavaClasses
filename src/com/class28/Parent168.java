package com.class28;
/*super method calling 
In Parent class
create  instance method  m1 saying "m1 method in parent class"

In Child class. 
Inherit to Parent class. 
override m1 method by saying "m1 method in child class"
create another method m2 in child class 
First call child class  m1 method using this keyword. 
Then call the parent class m1 method using super keyword. 

in Main class. 
Create and object of child class and call m2 method using the object. 

Output:
m1 method in child class
m1 method in parent class
 */
 
public class Parent168 {
	
	public void m1() {
	  	System.out.println("m1 method in parent class");
	}
	
}
//inherit to class Child168