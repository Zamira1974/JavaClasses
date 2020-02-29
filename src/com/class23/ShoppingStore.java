package com.class23;

/**In ShoppingStore class:
Create class level variable as below.
item,
price, 
quantity
Create one constructor with parameters of item, price and quantity. 
in constructor assign the parameter value to class level value. (use this keyword). 
Create a method with name itemTotalPrice. 
write a logic to to calculate the total values of items in stock. and print the result. 
return the total value. 

In Main Class. 
Create two Object of ShoppingStore and pass the parameters to Constructor. 
then using each object call the method itemTotalPrice. 
Store the returned value of each object. 
Calculate sum of both object and print the result. 
________________________________
Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today

Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.  */


public class ShoppingStore {
	String item;
	double price;
	double quantity;
	
	ShoppingStore (String item, double price, double quantity) {
		this.item=item;
		this.price=price;
		this.quantity=quantity;
	}
	
	public double itemTotalPrice() {
		double totalPrice=this.price * this.quantity;
		System.out.println(this.item+" Total Value "+" "+totalPrice);
		
		return totalPrice;
	}	
}
