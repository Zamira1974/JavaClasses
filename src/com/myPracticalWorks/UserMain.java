package com.myPracticalWorks;

public class UserMain {

	public static void main(String[] args) {
		User user = new User();
		user.firstName = "Zara";     //setting a property
		user.lastName ="Dali";
		System.out.println(user.getFullName());
		
	}
}
