package com.syntax.review11;

public class Cube extends Shape3D {
		double side;
		
	public Cube (int side, String color) {
		super(color);
		this.side=side; 
	}
	@Override
	public double calculateVolume() {
		return (side * side * side); 
		}
	@Override
	public double calculateArea() {
		return 6*(side*side);
} }

