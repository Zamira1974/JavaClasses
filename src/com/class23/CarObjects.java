package com.class23;
/**In carObject class:
Create a two class level variable as below.
model
price, 
quantity
Create one constructor with parameters of price and quantity. 
in constructor assign the parameter value to class level value. (use this keyword). 
Create a method with name carStockValue. write a logic to to calculate the total values of cars in stock. and print the result. 
run the application in Main Class

Output:
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0

Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations. 
 */

public class CarObjects {

String model;
double price;
int quantity;

CarObjects (String model, double price, int quantity) {
	this.model=model;
	this.price=price; 
	this.quantity=quantity;
}

public void carStockValue() {
	double total= this.quantity * this.price;
	System.out.println(model+" Stock Value"+" "+total);
	}
}
