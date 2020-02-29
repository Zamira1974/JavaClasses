package com.syntax.review11;

public class Rectangle extends Shape2D{
	 int widht;
	 int height;
	 String color;
	
	 public Rectangle(int wight, int height, String color) {
		super(color);
		this.widht=wight;
		this.height=height;
		
	}
	 public  double calculateArea() {
			return widht*height;
		}
	
	 public  double calculatePerimeter() {
			return 2 * (widht + height);
		}
}
