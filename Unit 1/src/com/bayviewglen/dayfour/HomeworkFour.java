package com.bayviewglen.dayfour;

public class HomeworkFour {

	public static void main(String[] args) {
		// Create a program that can be used to calculate the final velocity
		// of a car given the initial velocity, the acceleration of the car and
		// the time that has elapsed using the following equation:
		// vf = vi+a*t
		
		int initial = 10;
		int acceleration = 15;
		double time = 2.30
				;
		
		double finalVelocity = (initial + acceleration * time);
		
		System.out.println("The final velocity is " + finalVelocity + ".");

	}

}
