package com.bayviewglen.dayseven;

public class ExampleOne {

	public static void main(String[] args) {
		int secondsPerMinute = 60;
		int minutesPerHour = 60;
		int hoursPerDay = 24;
		int daysPerYear = 365;
		
		int secondsPerYear = secondsPerMinute * minutesPerHour * hoursPerDay * daysPerYear;
		System.out.println("The number of seconds in a year is " + secondsPerYear + ".");
		
		////////////////////////////////////////////////////////////////////////////////
		
		final int SECONDS_PER_MINUTE = 60;
		// SECONDS_PER_MINUTE = 3; this is a compile error
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_DAY = 24;
		final int DAYS_PER_YEAR = 365;
		
		final int SECONDS_PER_YEAR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
		System.out.println("The number of seconds in a year is " + SECONDS_PER_YEAR + ".");
		
		double radius = 4.2;
		double area = Math.PI * Math.pow(radius, 2);
		
		////////////////////////////////////////////////////////////////////////////////
		
		final int NUM_SIDES = 6;
		// random number from 1 _> 6
		int topOfDie = (int)(Math.random() * NUM_SIDES + 1);
		
		
		
		// 1 - 10 = 		(int) (1+10*Math.random())
		//-10 - 10 = 		(int) (21*Math.random() - 10)
		
		//Math.random() 		Math = class 			random() - method

	}

}
