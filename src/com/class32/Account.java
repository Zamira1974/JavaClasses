package com.class32;

public class Account {

	private long acc_no;
	private String name, email;
	private double amount;
	
//getting
		public long getAccountNumber() {
			return acc_no;
		}
		public String getName(){
	        return name;
	    }
		public String getEmail(){
	        return email;
	    }
	    public double getAmount(){
	        return amount;
	    }
//setting
	   public void setAccountNumber(long acc_no) {  
		    this.acc_no=acc_no;
	   }
	   public void setName(String name){
	        this.name = name;
	   }
	   public void setEmail(String email){
	        this.email = email;
	   }
	   public void setAmount(double amount){
	        this.amount=amount;
	   }
}

//watch class AccountTest.java