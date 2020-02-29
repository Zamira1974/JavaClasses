package com.class24;

public class Country {

	public String capital, name;
	public int population;

	Country() {
		System.out.println("I am not argument constructor");
	}

	Country(String name, String capital, int population) {
		this.name = name;
		this.capital = capital;
		this.population = population;
	}

	Country(String name, String capital) {
		name=name;
		capital=capital;
	}
	
	
	public void displayInfo() {
		System.out.println(name + " " + capital);
	}

	public static void main(String[] args) {

//		Country country1=new Country();
//		country1.name="USA";
//		country1.capital="Washington DC";
//		
//		Country country2=new Country();
//		country1.name="Kazakhstan";
//		country1.capital="Astana";

//		System.out.println(country1.name);
//		System.out.println(country1.capital);
//		
//		System.out.println(country2.name);
//		System.out.println(country2.capital);
//		
//		System.out.println(country3.name);
//		System.out.println(country3.capital);
//		

		Country country1 = new Country("USA", "Washington DC", 3500000);
		
		Country country2 = new Country("Kazakhstan", "Astana", 18000000);
		Country country3 = new Country();

		country1.displayInfo();
		country2.displayInfo();
	}
}
