package com.class26;

public class Degree {

	public void getDegree () {
	System.out.println("I got a degree");
	}	
}

 class Undergraduate extends Degree {
	
	public void grade() {
		System.out.println("I am undergraduate");
	}
}

 class Postgraduate extends Degree {
	public void grade() {
		System.out.println("I am postgraduate");
	}
}
 

 