package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		/*Create a program that can be used to calculate the final velocity of a car 
		 * given the initial velocity, the acceleration of the car and the time that has 
		 * elapsed using the following equation:
			v_f= v_i+at
		*/
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please give the initial velocity, the acceleration and the time elapsed of the car: ");
		
		double initial = Keyboard.nextDouble();
		double acceleration = Keyboard.nextDouble();
		double time = Keyboard.nextDouble();
		
		double finalVelocity = (initial + acceleration * time);
		
		System.out.println("The final velocity is " + finalVelocity + ".");

	}

}
