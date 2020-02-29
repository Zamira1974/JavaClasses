package com.claas18;

public class MethodMaxNum {

	public static void main(String[] args) {
		
		MethodMaxNum nums=new MethodMaxNum();
		nums.largerNum(33, 23, 13);
		
	}

	void largerNum(int firstNum, int secondNum, int thirdNum) {
		
		if(firstNum>secondNum && firstNum>thirdNum) {
			System.out.println("The larger number is "+ firstNum);
		}else if (secondNum>firstNum && secondNum>thirdNum) {
			System.out.println("The larger number is "+secondNum);
		}else if (thirdNum>firstNum && thirdNum>secondNum) {
			System.out.println("The larger number is "+thirdNum);
		}else if(firstNum==secondNum && secondNum==thirdNum) {
			System.out.println("The numbers are equal");
		}else {
			System.out.println("The numbers are not valid");
		}
	}
}
