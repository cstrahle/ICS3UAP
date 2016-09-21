package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please insert an even number: ");
		
		double number = Keyboard.nextDouble();
		
		double numberRoot = Math.sqrt(number);
		double numberSquared = Math.pow(number, 2);
		
		System.out.println("The square of " + number + " is " + numberSquared + " and the square root of " + number + " is " + numberRoot + ".");
		
		
		
		
		

	}

}
