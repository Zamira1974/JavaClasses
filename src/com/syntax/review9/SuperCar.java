package com.syntax.review9;

public class SuperCar {

	static String make, brand, manufacture;

	int year,tireNumber;
	int backFrontDist;
	int maxSpeed,carMass,carRadius,aeroDynamCoeff;
	
	public void SuperCarSpeed (int maxSpeed, int carRadius) {
	
	}
	
	public SuperCar () {
		int year=2019;
		int backfrontDist=2; 
	System.out.println("Year of a SuperCar is: "+year+" back and front distance is: "+backfrontDist);
	}
	
	public int SuperCar (int tireNumber) {
		int tN=tireNumber;
		return tN;
	}
	public int SuperCar(int carMass, int aeroDynamCoeff) {
	int cM=carMass; 
	return cM;
	}
	public void showInfo() {
		System.out.println("This a SuperCar name is: "+make+". Brand is: "+brand+", and manufacturer is: "+manufacture);
	System.out.println();
	}
	
	
}
