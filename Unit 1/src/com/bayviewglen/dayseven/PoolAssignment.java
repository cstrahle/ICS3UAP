package com.bayviewglen.dayseven;

import java.util.Scanner;

public class PoolAssignment {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double LINER_ONE = 0.78;
		final double LINER_TWO = 0.58;
		final double LINER_THREE = 0.88;
		
		System.out.print("Please insert the length of the pool: ");
		double length = keyboard.nextDouble();
		System.out.print("Please insert the Width of the pool: ");
		double width = keyboard.nextDouble();
		
		System.out.print("Please insert the depth of the shallow end: ");
		double shallowHeight = keyboard.nextDouble();
		System.out.print("Please insert the depth of the deap end: ");
		double deepHeight = keyboard.nextDouble();
		
		System.out.print("Please insert the length of the shallow end: ");
		double shallowLength = keyboard.nextDouble();
		System.out.print("Please insert the transition length between the deepend and shallow end: ");
		double transitionLength = keyboard.nextDouble();
		System.out.println("");
		
		//////////////Volume/////////////////
		
		double heightDifference = deepHeight - shallowHeight;
		double middleLength = Math.sqrt(Math.pow(transitionLength, 2) - Math.pow(heightDifference, 2));
		double findBadRectangle = heightDifference * shallowLength * width;
		double findBadTriangle = middleLength * heightDifference * width/2;
		double findTotalVolume = (width * length * deepHeight) - ((findBadRectangle) + (findBadTriangle));
		System.out.println("The volume of the pool is " + findTotalVolume + ".");
		double for90Percent = 0.9;
		double findPercent = findTotalVolume * for90Percent;
		double inLitres = (int)(findPercent * 100000)/100.0;
		System.out.println("The volume of 90% of the pool is " + inLitres + " litres.");
		System.out.println("");
		
		/////////////Surface Area/////////////
		
		double deepLength = length - (shallowLength + middleLength);
		double deepSurface = 2 * (width * deepLength + deepHeight * deepLength + deepHeight * width);
		double middleSurfaceArea = (2 * (width * shallowLength + shallowHeight * shallowLength + shallowHeight * width) + ((2 * (width * middleLength + heightDifference * middleLength + heightDifference * width) / 2)));
		double shallowSurfaceArea = 2 * (width * shallowLength + shallowHeight * shallowLength + shallowHeight * width);
		double totalSurfaceArea = deepSurface + middleSurfaceArea + shallowSurfaceArea;
		System.out.println("The total surface area is " + totalSurfaceArea + "m^2.");
		System.out.println("");
		
		//////////////Price//////////////////
		
		double firstLinerPrice = LINER_ONE * totalSurfaceArea;
		System.out.println("The price of the first liner is $" + firstLinerPrice + ".");
		
		double secondLinerPrice = LINER_TWO * totalSurfaceArea;
		System.out.println("The price of the second liner is $" + secondLinerPrice + ".");
		
		double thirdLinerPrice = LINER_THREE * totalSurfaceArea;
		System.out.println("The price of the third liner is $" + thirdLinerPrice + ".");
		

	}

}
