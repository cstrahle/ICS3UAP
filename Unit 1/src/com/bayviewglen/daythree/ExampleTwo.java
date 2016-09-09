package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		
		// declare 3 integers
		int numberOne, numberTwo; //notice the naming convention for variables (camelCase)
		int sum;
		
		numberOne = 7;		// numberOne is assigned 7
		//only variables can go on the left side (below the 8 wont work)
		// 8 = numberOne; 	left-hand side of an assignment must be a variable *** error ***
		numberTwo = 12;
		
		sum = numberOne + numberTwo;
		
		// + and = are operators
		
		System.out.println(sum);		// displays the value stored in the variable sum
		
		System.out.println(numberOne + "+" + numberTwo + "=" + sum);	// using string concatenation
		
		// + allows you to string the line together
		
		System.out.println(numberTwo + numberOne + "+" + numberTwo + "=" + sum);
	}

}
