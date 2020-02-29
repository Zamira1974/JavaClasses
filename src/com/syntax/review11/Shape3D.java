package com.syntax.review11;

public abstract class Shape3D {
	String color;
	public Shape3D (String color) {
		this.color=color;
	}
	 public abstract double calculateVolume();
	 public abstract double calculateArea();
}
