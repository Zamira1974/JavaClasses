package com.class28;

public class Circle extends Shape {

	Circle(double radius) {
		super(radius);
	}

	public void calculateArea() {
        double pi = 3.14, area;
        area = pi * radius * radius;
        System.out.println("Area of circle: "+area);
	}
	
		public static void main(String[] args) 
	    {
	     Circle circle=new Circle(5); 
	     circle.calculateArea();
	    }
	
}
