package com.syntax.whileloop;

public class aaaaaaaaaaaaaaaaaaaaaa {

	public static void main(String[] args) {

		if( 1 > 2 )
		{
		System.out.println(" 1 is greater than 2");
		}
		else
		{
		System.out.println(" 2 is greater than 1");
		}	
		
		
		
		
//1.
		boolean x = true;
		boolean y = false;
		if (x || y) {
		System.out.println(true);
		} else {
		System.out.println(false);
		}
System.out.println("***************************");


// 2.		
boolean male = false;
int age = 30;

if( male ){
     if( age < 20 ){
         System.out.println("Boy");
     } else {
         System.out.println("Man");

    }
}else {

      if( age < 20 ){
          System.out.println("Girl");
       }else  {
          System.out.println("Woman");
      }
}
System.out.println("***************************");




//3. 
float f = 75.0f;
double d = 75.0;
int i = 75;

if( f == d ) {
   if( f == i ) {
      System.out.println("f, d and i are equal");
    } else {
      System.out.println("f, d are equal but i is not equal");
    }

} else {
    System.out.println("f and d are not equal");
}
	System.out.println("*****************");

//4.
int day = 7;

switch(day)
{
case 1:
System.out.println("Monday");
case 2:
System.out.println("Tuesday");
case 3:
System.out.println("Wednesday");
case 4:
System.out.println("Thursday");
case 5:
System.out.println("Friday");
}

//5. 

double discount;
char code = 'C' ;

switch ( code )
{
case 'A':
discount = 0.0;

case 'B':
discount = 0.1;

case 'C':
discount = 0.2;

default:
discount = 0.3;
}

//6.

boolean x1 = true;
boolean y1 = false;
if (x1 || y1) {
System.out.println(true);
} else {
System.out.println(false);
}


	}

}
