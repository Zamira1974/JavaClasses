package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
	

		// 7 days a week
		// if days 2 or 4   ---> SDLC class
		// if day 6 or 7  --> Java Class
		// if day 1 or 5  --> No Class
		// if day=3 --> Review class
		
		
		
		
	/*	int day= 6;
	 * 	// false OR false  --> false
		if (day==2 || day==4) {
			System.out.println("SDLC class");
			// true OR false --> true
		
		}else if (day==6 || day==7) {
			System.out.println("Java class");
		
			// false OR false --> true
		}else if (day==1 || day==5) {
			System.out.println("No class");
		}
		else if (day==3) {
			System.out.println("Review class");
		}
		
		else {
			System.out.println("Not a valid day");
		}    */
	
	
		// 7 days a week
		// if days Tuesday or Thursday   ---> SDLC class
		// if day Saturday or Sunday  --> Java Class
		// if day Monday or Friday  --> No Class
		// if day is Wednesday --> Review class
		
		String weekDay = "Friday";

		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC class");
		} else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java class");
		} else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No class");
		} else if (weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		} else {
			System.out.println("Not a valid day");
		}

	}
}
