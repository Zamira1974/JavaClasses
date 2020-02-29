package com.class32;

public class AccountTest extends Account {

	public static void main(String[] args) {
		Account obj=new Account();
		obj.setAccountNumber(7560504000l);
		long accountNum=obj.getAccountNumber();
		System.out.print(accountNum+" ");
	
		obj.setName("Sumair");
		String name=obj.getName();
		System.out.print(name+" ");
		
		obj.setEmail("sumair@syntaxsolutions.com");
		String email=obj.getEmail();
		System.out.print(email+" ");
		
		obj.setAmount(500000.0);
		double amount=obj.getAmount();
		System.out.println(amount);
	}
}
