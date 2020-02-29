package com.class28;

public class UserInfo extends User {

	String address;
	
	UserInfo(String name, String address, String mobileNumber) {
		super(name, mobileNumber);
		this.address=address;
	}
	public void userDetails () {
		
		System.out.println(name+" "+address+" "+mobileNumber);
	}
	
	public static void main(String[] args) {
		UserInfo obj=new UserInfo("Sonys", "12205 Stone Drive", "345-0986754");
		obj.userDetails();
	}
}