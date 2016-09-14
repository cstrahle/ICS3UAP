package com.bayviewglen.dayfour;

public class HomeworkTwo {

	public static void main(String[] args) {
		// 2. Create a program that assigns values to two integers, one for the
		// amount a test is out of and another indicating what a student
		// received. Display what percentage the student received on the test.
		
		int totalScore = 55;
		int studentScore = 12;
		
		double Percentage = ((double)studentScore / totalScore);
		double totalPercentage = ((double)Percentage * 100);
		
		System.out.println("The student scored " + totalPercentage + "%.");

	}

}
