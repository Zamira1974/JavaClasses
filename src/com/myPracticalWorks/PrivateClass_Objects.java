package com.myPracticalWorks;

public class PrivateClass_Objects {
	
public static void main(String[] args) {
	
	Person person1 = new Person();
	person1.setName("");
	person1.setAge(-5);
	System.out.println("We call variable name in main method: "+person1.getName());
	System.out.println("We call variable age in main method: "+person1.getAge());	
	}
}

class Person{
	private String name;  //вы должны ограничивать свои поля от других классов(не доступно юзерам), 
	private int age;      //и доступ к этим полям мы должны осущ-ть через getter & setter
	
	public void setName(String userName) {
		if(userName.isEmpty()){
			System.out.println("You entered empty name");
		} else {
			name=userName;
		}
		
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int userAge) {
		if(userAge<0){
			System.out.println("You entered incorrect age");
		} else {
		age=userAge;
		}
	}
		public int getAge() {
		
		return age;
	}
	
	
	int calculateYearsToRetirement() {
		int years = 65-age;
		return years;
	}
	void speak () {
		for(int i=0; i<3; i++) {
			System.out.println("My name is "+name+". I am "+age+" years old.");
		}
	}	
}