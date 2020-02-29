package com.class25;

public class TestCountry {
	public static void main(String[] args) {
		
		System.out.println("Creating an object of a Country class");
		Country con=new Country();
		Country.country="USA";
		con.population = 327000000;
		con.live();
		con.amount();
		
		System.out.println("Creating an object of a Capital class");
		Capital cap=new Capital();
		cap.capitalName="Washington DC";
		cap.theatre="National Theatre DC";
		cap.cultureCenter();
		
		System.out.println("Creating an object of a first state class");
		StateOne stOne = new StateOne();
		stOne.state1Name="New York";
		stOne.university="Columbus University";
		stOne.learningCity();
		
		System.out.println("Creating an object of a second state class");
		StateTwo stTwo = new StateTwo();
		stTwo.state2Name="Florida";
		stTwo.ocean="Atlantic Ocean";
		stTwo.getRest();
	}
}
