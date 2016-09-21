package com.bayviewglen.daysix;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please insert the mass of the object (Only Decimal): ");
		double weight = Keyboard.nextDouble();
		
		System.out.print("Please insert the speed of the object (Only Decimal): ");
		double speed = Keyboard.nextDouble();
		
		double equSpeed = Math.pow(speed, 2);
		
		double KE = (weight * (1.0 / 2.0) * equSpeed);
		
		System.out.println("The kenetic energy of the object is " + KE + ".");

	}

}
