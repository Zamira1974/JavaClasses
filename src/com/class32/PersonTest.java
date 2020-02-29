package com.class32;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
		p.setFirstName("John");
		System.out.println(p.getFirstName());
		
		p.setLastName("Doe");
		System.out.println(p.getLastName());
		
		p.formatBirthday();
		
		p.setSSN("123-45-6789");
		System.out.println(p.getSSN());
		
	}
}
