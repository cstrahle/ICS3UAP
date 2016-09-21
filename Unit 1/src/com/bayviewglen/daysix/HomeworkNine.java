package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please insert the amount of items you sold: ");
		
		double itemSold = Keyboard.nextDouble();
		
		double totalSalary = itemSold * 0.27;
		
		System.out.println("With " + itemSold + " items sold your overall salary is " + totalSalary + ".");

	}

}
