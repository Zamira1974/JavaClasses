package com.syntax.review10;

public class ENT extends Doctor {
	
	//Child class does not inherit Parent Class constructor
	//Child class call/executes/uses one of the Parent Class constructors
	
//This is default constructor already there
//	public ENT() {
//		super();
//	}
	
	public ENT(String name, String specialty, int licenceId) {
		
		super(name,specialty,licenceId);
		
	}
	public void chargePatient() {
		System.out.println("Gets $1000");
	}
}
