package com.class21;

/** @author zamiradauyekeyeva
declare instance variable as shown below. 
int intValue ;
double  doubleValue;
char charValue;

assign the variable within the main method then print the value as ordered below.
Ouput print as ordered above.
10
10.23
z   */


public class InstanceVariableHW131 {
	int intValue = 10;
	double  doubleValue = 10.23;
	char charValue='z';
	
public static void main(String[] args) {
	
	InstanceVariableHW131 inst =new InstanceVariableHW131();
	System.out.println(inst.intValue);
	System.out.println(inst.doubleValue);
	System.out.println(inst.charValue);	
}		
}
