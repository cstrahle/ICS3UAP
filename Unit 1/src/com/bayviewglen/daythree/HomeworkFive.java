package com.bayviewglen.daythree;

public class HomeworkFive {

	public static void main(String[] args) {
		// Write a program that given the number of pennies, nickles,
		// dimes, quarters, loonies and toonies calculates how much money the
		// user has.
		
		int pennies, nickles, dimes, quarters, loonies, toonies;
		double totalSum;
		
		pennies = 10;
		nickles = 20;
		dimes = 14;
		quarters = 3;
		loonies = 15;
		toonies = 16;
		
		totalSum = 0.01 * pennies + 0.05 * nickles + 0.10 * dimes + 0.25 * quarters + 1 * loonies + 2 * toonies; 
		System.out.println("The total comes to $ " + totalSum + ".");
		
		
	}

}
