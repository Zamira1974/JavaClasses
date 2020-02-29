package com.class23;

public class CarMainHW140 {

	public static void main(String[] args) 
	{
		CarHW140 car1 = new CarHW140("Toyota", "Prius", 4, 120, 30000);
		CarHW140 car2 = new CarHW140("Toyota", "Prius", 120, 30000); 
		CarHW140 car3 = new CarHW140(4, 120, 30000);
		CarHW140 car4 = new CarHW140("Toyota", "Prius", 4);
		
		car1.display();
		car2.display();
		car3.display();
		car4.display();
	}	
}
