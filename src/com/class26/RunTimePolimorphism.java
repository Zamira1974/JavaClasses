package com.class26;

public class RunTimePolimorphism {

	public static void main(String[] args) {
		//creating an object on parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		
		//creating an object on child class
		Cat cat=new Cat();
		cat.eat();
		cat.meow();
		cat.sleep();
		
		
		//widening
		double d=90;
		//narrowing
		int i=(int)1.99;
		System.out.println("------------------------");
		
		//Non Primitive Typecasting
		//Widening --> creating an object of the child class 
		//             and giving reference to the Parent class
		Animal obj=new Cat();
		//narrowing
		//Cat obj2=new Animal(); --> Cannot convert from Animal to Cat
		obj.eat();  // coming from parent
		obj.sleep();// this method will come from child class --> runtime polimorphism
		
		
	}
}
