package com.class23;

public class Dog {
	static String dogBreed;
	String dogName;
	double dogWeight;
	
	Dog(String name, String dogBreed, double weight) {	
		dogName=name;
		dogWeight=weight;
	}
	
	Dog(String name, double weight){
		dogName=name;
		dogWeight=weight;
	}
	
	public void display() {
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	}

	public static void main(String[] args) { 
		dogBreed="Mutt";
		Dog dog1 = new Dog("Tarzan", 50);
		dog1.display();
		Dog dog2 = new Dog("Tarzan","Mutt", 50);	
	}
}	



