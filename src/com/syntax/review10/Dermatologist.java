package com.syntax.review10;

public class Dermatologist extends Doctor {
	
	public Dermatologist(String name, String specilty, int licenceId) {
//		super(); //java calls/executes default constructor of 
		this.name=name;
		this.specialty=specialty;
		this.licenceId=licenceId;	
	}
	@Override
	public void chargePatient() {
		System.out.println("Gets $250");
	}
	//@override
	public void checkUp(String name) {
		System.out.println("Doctor "+this.name+ " has ordered allergy ");
	}
	
	
	public void applySkinTreatment() {
		
	}
}
