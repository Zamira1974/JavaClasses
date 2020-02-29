package com.class10;

public class CountryArray {
	public static void main(String[] args) {

		// create an array of countries
		// While retrieving all values from an array
		// print capital for each country

		String[] countries = { "Kazakhstan", "Uzbekistan", "Italy", "Russia" };

		for (int i = 0; i < countries.length; i++) {

			if (countries[i].equals("Kazakhstan")) {
				System.out.println("Astana");

			} else if (countries[i].equals("Uzbekistan")) {
				System.out.println("Tashkent");

			} else if (countries[i].equals("Italy")) {
				System.out.println("Rome");

			} else if (countries[i].equals("Russia")) {
				System.out.println("Moscow");
			}

		}
	}
}
