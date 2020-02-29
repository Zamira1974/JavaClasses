package com.class17;

public class MethodMinute {

	void hours(int hour, int minute) 
	{
		System.out.println(hour+ ":"+minute);
	}
	
	public static void main(String[] args) {
		MethodMinute mm = new MethodMinute();
		mm.hours(11, 30);
	}
}
