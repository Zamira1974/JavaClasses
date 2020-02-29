package com.class17;
public class Dogs {

	String name, breed, color;
	
	void bark() {
		System.out.println(breed + " can bark");
	}
	void run() {
		System.out.println(breed + " can run");
	}
	void play() {
		System.out.println(breed + " can play");
	}
	
	
	public static void main(String[] args) {
		
		Dogs dog1 = new Dogs();
		Dogs dog2 = new Dogs();
		Dogs dog3 = new Dogs();

		dog1.breed="Husky";
		dog1.name="Hatiko";
		dog1.color="Grey";
		
		dog2.breed="Bulldog";
		dog2.name="Bobby";
		dog2.color="White";
		
		dog3.breed="Labrador";
		dog3.name="Sharik";
		dog3.color="Black";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		dog3.bark();
		dog3.run();
		dog3.play();
		
	}
}
