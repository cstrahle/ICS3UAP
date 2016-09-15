/*
 * Declaring a Scanner to read input from the Keyboard.
 * 
 * Reading integer data.
 * 
 * Prompt the user for three different integers and display the average of the three numbers.
 */
package com.bayviewglen.dayfive;

// Important ******
import java.util.Scanner;
// Important ******

public class ExampleOne {

	public static void main(String[] args) {
		
		// system.out = console
		// system.in = keyboard
		// classes are indicated with CAPITALS
		// null means nothing
		
		Scanner keyboard = new Scanner(System.in); // for this to work you must have "import java.util.Scanner;" 
												   // it will show up when you hover over the red line
		
		int x, y, z;
		System.out.print("Please enter three integers: ");
		// print keeps the text on the same line, println is the equivalent of enter
		
		x = keyboard.nextInt(); // Grabs the next integer
		y = keyboard.nextInt(); // Grabs the next integer
		z = keyboard.nextInt(); // Grabs the next integer
		
		double average = (x + y + z) / 3.0;
		
		System.out.println("The average of the numbers: " + x + ", " + y + " and " + z + " is " + average);
		
		keyboard.close();
	
	}

}