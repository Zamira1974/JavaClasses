package com.class17;

public class Phone {
String Name, brand, color, size;
int memory;

void playMusic() {
	System.out.println("I can listen music on my " + Name);
}

void sendMessage() {
	System.out.println("I can send message on my " + Name);
}

void typeText() {
System.out.println("I can type text on my " + Name);
}


public static void main(String[] args) {

	Phone phone1=new Phone();
	phone1.brand="Android";
	phone1.Name="Samsung Galaxy S10";
	phone1.memory=64;
	phone1.color="Gold";
	phone1.size="5 inches"; 
	
	System.out.println("I have "+phone1.brand+" "+phone1.Name);
	phone1.playMusic();
	phone1.sendMessage();
	phone1.typeText();
	
	System.out.println("----------------------------");
	
	Phone phone2=new Phone();
	phone2.brand="Apple";
	phone2.Name="iPhone S11";
	phone2.memory=125;
	phone2.color="Pink";
	phone2.size="4 inches"; 
	
	System.out.println("I like "+phone2.brand+" "+phone2.Name);
	phone2.playMusic();
	phone2.sendMessage();
	phone2.typeText();
	
System.out.println("----------------------------");
	
	Phone phone3=new Phone();
	phone3.brand="Nokia";
	phone3.Name="3310";
	phone3.memory=32;
	phone3.color="Red";
	phone3.size="7.9 mm"; 
	
	System.out.println("I don like "+phone3.brand+" "+phone3.Name);
	phone3.playMusic();
	phone3.sendMessage();

	
	
}

}
