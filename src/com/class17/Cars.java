package com.class17;

public class Cars {

	String Color, Name;
	int ModelYear;

	/*
	 * Create a class named 'Main' with specific attributes. For you to do:
	 * 
	 * Create two objects in which you will be assigning the following values.
	 * carColor='Black' carModelYear=2019 carName='BMW'
	 * carColor='White' carModelYear=2018 carName='Toyota' Car color is Black and
	 * car model year is 2019 and car name is BMW Car color is White and car model
	 * year is 2018 and car name is Toyota
	 */
	public static void main(String[] args) {

		Cars car1 = new Cars();
		car1.Color = "Black";
		car1.ModelYear = 2019;
		car1.Name = "BMW";
		System.out.println("Car color is " + car1.Color + " " + "and car model year is " + car1.ModelYear + " "
				+ "and car name is " + car1.Name);

		Cars car2 = new Cars();
		car2.Color = "White";
		car2.ModelYear = 2018;
		car2.Name = "Toyota";
		System.out.println("Car color is " + car2.Color + " " + "and car model year is " + car2.ModelYear + " "
				+ "and car name is " + car2.Name);
	}
}
