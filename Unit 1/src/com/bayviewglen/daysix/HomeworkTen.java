package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please insert the length of the rectangle: ");
		double length = Keyboard.nextDouble();

		System.out.print("Please insert the width of the rectangle: ");
		double width = Keyboard.nextDouble();
		
		double area = length * width;
		double perimiter = length + length + width + width;
		
		System.out.println("The area of the rectange is " + area + ".");
		System.out.println("The perimiter of the rectange is " + perimiter + ".");

	}

}
