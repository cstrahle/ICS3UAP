package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please insert the number you want squared: ");
		
		double number;
		
		number = Keyboard.nextDouble();		
		
		double Product = Math.sqrt(number);
		
		System.out.println("The number selected is " + number + " and the square root is " + Product + ".");
		
		
		
		
		
		
		

	}

}
