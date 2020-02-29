package com.syntax.review11;
public class Sphere extends Shape3D{
	double pi=3.14; 
	int radius;
	
public Sphere (int radius, String color) {
		super(color);
		this.radius = radius;
	}
@Override
public double calculateVolume() {
	return 4/3 *(pi*(radius * radius));
	}
@Override
public double calculateArea() {
	return 4*pi*(radius*radius);
	}		
}
