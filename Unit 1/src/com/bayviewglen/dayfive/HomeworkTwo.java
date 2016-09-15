package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		/* 2.	Create a program that obtains two integers, one 
		 * for the amount a test is out of and another indicating what a student 
		 * received. Display what percentage the student received on the test.
		 */
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Please insert your test make and what the test was out of: ");
		
		double studentScore, totalScore;
		
		studentScore = Keyboard.nextDouble();
		totalScore = Keyboard.nextDouble();
		
		double Percentage = ((double)studentScore / totalScore);
		double totalPercentage = ((double)Percentage * 100);
		
		System.out.println("The student scored " + totalPercentage + "%.");

	}

}
