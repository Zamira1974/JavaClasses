package com.class24;

public class Test {

	public static void main(String[] args) {

		Child1 ch1 = new Child1();
		System.out.println(Child1.race);
		System.out.println(ch1.hairColor);
		System.out.println(ch1.eyeColor);
		ch1.sing();
		ch1.code();

		Child2 ch2 = new Child2();
		System.out.println(Child2.race);
		System.out.println(ch2.hairColor);
		System.out.println(ch2.eyeColor);
		ch2.learn();

		Parent parent = new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(Parent.race);
		parent.sing();
		// parent.code(); compiler will give an error
	}
}
