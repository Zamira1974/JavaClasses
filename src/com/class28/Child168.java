package com.class28;

public class Child168 extends Parent168{

	public void m1() {
	  	System.out.println("m1 method in child class");
	}
	
	public void m2() {
		this.m1();
		super.m1();
	}
	
	public static void main(String[] args) {
		Child168 obj=new Child168();
		obj.m2();
	}
}


//inherit to class Parent168