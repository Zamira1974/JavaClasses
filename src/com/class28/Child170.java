package com.class28;

public class Child170 extends Parent170 {
	
	Child170(String city){
		super(city);
	}
	
	public static void main(String[] args) {
		Child170 child = new Child170("Fairfax");
		child.display();
	}	
}
