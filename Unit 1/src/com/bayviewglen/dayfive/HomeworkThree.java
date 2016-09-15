package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		/*3.	Write a program that prompts the user for a five digit 
		 * number and calculates the product of the 2nd and 4th digit.
		 */
		
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Please insert 5 digits: ");
		
		double digit1, digit2, digit3, digit4, digit5;
		
		digit1 = Keyboard.nextDouble();
		digit2 = Keyboard.nextDouble();
		digit3 = Keyboard.nextDouble();
		digit4 = Keyboard.nextDouble();
		digit5 = Keyboard.nextDouble();
		
		double sum = (digit2 + digit4);
				
		System.out.println("The sum of the second and fifth digits are " + sum + ".");

	}

}
