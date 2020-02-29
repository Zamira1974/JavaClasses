package com.class11;

public class ClassTask3 {

	public static void main(String[] args) {
	
		//Create an array of countries. While retrieving all values 
		//from an array print capital for each country. (use 2 different loops).

		
		String [] countries = {"France", "USA", "China", "Libanon", "Bangladesh", "Brasil"};
	
		for(String getCountry:countries) {
			if(getCountry.equals("Libanon")) {
				System.out.println("The capital of Libanon is Beirut");
			}
		}	
		}
	
}
