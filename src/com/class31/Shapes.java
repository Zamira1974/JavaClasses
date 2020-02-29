package com.class31;

public interface Shapes {
	//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter . 
	//Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. 
	//Test your code.
	
	int R=3;
	int L=5;
	void calculateArea();
	void calculatePerimeter();
}
class Circle implements Shapes{
	
	@Override
	public void calculateArea() {
		System.out.println("Circle's radius is "+R+" and it's area is "+((R*3.14))*(R*3.14));
	}
	public void calculatePerimeter() {
		System.out.println("Circle's radius is "+R+" and it's  perimeter is "+(2*R*3.14));
	}
}
class Square implements Shapes{
	
	@Override
	public void calculateArea() {
		System.out.println("Square's length is "+L+" and it's area is "+(L*L));
	}
	public void calculatePerimeter() {
		System.out.println("Square's length is "+L+" and it's perimeter is "+(L*4));
	}
}
