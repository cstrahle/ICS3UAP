package com.bayviewglen.crosscountry;

import java.text.DecimalFormat;
import java.util.Scanner;

public class XCountryAssignment {

	public static void main(String[] args) {

		final int TOTAL_SECONDS = 60;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000");

		// Runner One

		// Initial information about the first runner
		System.out.print("Hello runner, Please enter you first and last name: ");
		String r1Name = keyboard.nextLine();
		String r1First = r1Name.split(" ")[0];
		String r1Last = r1Name.split(" ")[1];
		System.out.print(r1First + ", please enter your Mile One Time (mm:ss.sss): ");
		String r1MileOneTime = keyboard.nextLine();
		System.out.print(r1First + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String r1MileTwoTime = keyboard.nextLine();
		System.out.print(r1First + ", please enter your time to the end of the 5 km (mm:ss.sss): ");
		String r1MileThreeTime = keyboard.nextLine();
		System.out.println("");

		// Runner one Calculations

		// First Split
		int r1MileOneMinutes = Integer.parseInt(r1MileOneTime.split(":")[0]);
		double r1MileOneSeconds = Double.parseDouble(r1MileOneTime.split(":")[1]);

		double r1TotalMileOne = ((r1MileOneMinutes * TOTAL_SECONDS) + r1MileOneSeconds);

		r1MileOneMinutes = (int) (r1TotalMileOne / TOTAL_SECONDS);
		r1MileOneSeconds = (r1TotalMileOne % TOTAL_SECONDS);

		String r1MileOneSecondsFormatted = (formatter.format(r1MileOneSeconds));
		String r1MileOneFinal = (r1MileOneMinutes + ":" + r1MileOneSecondsFormatted);

		// Second Split
		int r1MileTwoMinutes = Integer.parseInt(r1MileTwoTime.split(":")[0]);
		double r1MileTwoSeconds = Double.parseDouble(r1MileTwoTime.split(":")[1]);

		double r1TotalMileTwo = (r1MileTwoMinutes * TOTAL_SECONDS) + r1MileTwoSeconds;
		double r1MileTwo = (r1TotalMileTwo - r1TotalMileOne);

		r1MileTwoMinutes = (int) (r1MileTwo / TOTAL_SECONDS);
		r1MileTwoSeconds = r1MileTwo % TOTAL_SECONDS;

		String r1MileTwoSecondsFormatted = (formatter.format(r1MileTwoSeconds));
		String r1MileTwoFormatted = (r1MileTwoMinutes + ":" + r1MileTwoSecondsFormatted);

		// Third Split
		int r1MileThreeMinutes = Integer.parseInt(r1MileThreeTime.split(":")[0]);
		double r1MileThreeSeconds = Double.parseDouble(r1MileThreeTime.split(":")[1]);

		double r1TotalMileThree = (r1MileThreeMinutes * TOTAL_SECONDS) + r1MileThreeSeconds;
		double r1MileThree = (r1TotalMileThree - r1TotalMileTwo);

		r1MileThreeMinutes = (int) (r1MileThree / TOTAL_SECONDS);
		r1MileThreeSeconds = r1MileThree % TOTAL_SECONDS;

		String r1MileThreeSecondsFormatted = (formatter.format(r1MileThreeSeconds));
		String r1MileThreeFormatted = (r1MileThreeMinutes + ":" + r1MileThreeSecondsFormatted);

		r1TotalMileThree = r1TotalMileThree - (r1MileTwo);

		// Total Time
		int r1TotalTimeMinutes = Integer.parseInt(r1MileThreeTime.split(":")[0]);
		double r1TotalTimeSeconds = Double.parseDouble(r1MileThreeTime.split(":")[1]);

		double r1TotalTime = ((r1TotalTimeMinutes * TOTAL_SECONDS) + r1TotalTimeSeconds);

		r1TotalTimeMinutes = (int) (r1TotalTime / TOTAL_SECONDS);
		r1TotalTimeSeconds = (r1TotalTime % TOTAL_SECONDS);

		String r1TotalTimeSecondsFormatted = (formatter.format(r1TotalTimeSeconds));
		String r1TotalTimeFinal = (r1TotalTimeMinutes + ":" + r1TotalTimeSecondsFormatted);

		// Total Runner One Summary

		System.out.println(r1First + ", here is your race summary:");
		System.out.println("****************************************");
		System.out.println("");

		System.out.println("Split One: " + r1MileOneFinal);
		System.out.println("Split Two: " + r1MileTwoFormatted);
		System.out.println("Split Three: " + r1MileThreeFormatted);
		System.out.println("Your total time was: " + r1TotalTimeFinal);

		System.out.println("");
		System.out.println("");

		// **********************************************************************

		// Runner Two

		// Initial information about the second runner
		System.out.print("Hello runner, Please enter you first and last name: ");
		String r2Name = keyboard.nextLine();
		String r2First = r2Name.split(" ")[0];
		String r2Last = r2Name.split(" ")[1];
		System.out.print(r2First + ", please enter your Mile One Time (mm:ss.sss): ");
		String r2MileOneTime = keyboard.nextLine();
		System.out.print(r2First + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String r2MileTwoTime = keyboard.nextLine();
		System.out.print(r2First + ", please enter your time to the end of the 5 km (mm:ss.sss): ");
		String r2MileThreeTime = keyboard.nextLine();
		System.out.println("");

		// Runner Two Calculations

		// First Split
		int r2MileOneMinutes = Integer.parseInt(r2MileOneTime.split(":")[0]);
		double r2MileOneSeconds = Double.parseDouble(r2MileOneTime.split(":")[1]);

		double r2TotalMileOne = ((r2MileOneMinutes * TOTAL_SECONDS) + r2MileOneSeconds);

		r2MileOneMinutes = (int) (r2TotalMileOne / TOTAL_SECONDS);
		r2MileOneSeconds = (r2TotalMileOne % TOTAL_SECONDS);

		String r2MileOneSecondsFormatted = (formatter.format(r2MileOneSeconds));
		String r2MileOneFinal = (r2MileOneMinutes + ":" + r2MileOneSecondsFormatted);

		// Second Split
		int r2MileTwoMinutes = Integer.parseInt(r2MileTwoTime.split(":")[0]);
		double r2MileTwoSeconds = Double.parseDouble(r2MileTwoTime.split(":")[1]);

		double r2TotalMileTwo = (r2MileTwoMinutes * TOTAL_SECONDS) + r2MileTwoSeconds;
		double r2MileTwo = (r2TotalMileTwo - r2TotalMileOne);

		r2MileTwoMinutes = (int) (r2MileTwo / TOTAL_SECONDS);
		r2MileTwoSeconds = r2MileTwo % TOTAL_SECONDS;

		String r2MileTwoSecondsFormatted = (formatter.format(r2MileTwoSeconds));
		String r2MileTwoFormatted = (r2MileTwoMinutes + ":" + r2MileTwoSecondsFormatted);

		// Third Split
		int r2MileThreeMinutes = Integer.parseInt(r2MileThreeTime.split(":")[0]);
		double r2MileThreeSeconds = Double.parseDouble(r2MileThreeTime.split(":")[1]);

		double r2TotalMileThree = (r2MileThreeMinutes * TOTAL_SECONDS) + r2MileThreeSeconds;
		double r2MileThree = (r2TotalMileThree - r2TotalMileTwo);

		r2MileThreeMinutes = (int) (r2MileThree / TOTAL_SECONDS);
		r2MileThreeSeconds = r2MileThree % TOTAL_SECONDS;

		String r2MileThreeSecondsFormatted = (formatter.format(r2MileThreeSeconds));
		String r2MileThreeFormatted = (r2MileThreeMinutes + ":" + r2MileThreeSecondsFormatted);

		r2TotalMileThree = r2TotalMileThree - (r2MileTwo);

		// Total Time
		int r2TotalTimeMinutes = Integer.parseInt(r2MileThreeTime.split(":")[0]);
		double r2TotalTimeSeconds = Double.parseDouble(r2MileThreeTime.split(":")[1]);

		double r2TotalTime = ((r2TotalTimeMinutes * TOTAL_SECONDS) + r2TotalTimeSeconds);

		r2TotalTimeMinutes = (int) (r2TotalTime / TOTAL_SECONDS);
		r2TotalTimeSeconds = (r2TotalTime % TOTAL_SECONDS);

		String r2TotalTimeSecondsFormatted = (formatter.format(r2TotalTimeSeconds));
		String r2TotalTimeFinal = (r2TotalTimeMinutes + ":" + r2TotalTimeSecondsFormatted);

		// Total Runner One Summary

		System.out.println(r2First + ", here is your race summary:");
		System.out.println("****************************************");
		System.out.println("");

		System.out.println("Split One: " + r2MileOneFinal);
		System.out.println("Split Two: " + r2MileTwoFormatted);
		System.out.println("Split Three: " + r2MileThreeFormatted);
		System.out.println("Your total time was: " + r2TotalTimeFinal);
		System.out.println("");
		System.out.println("");

		// **********************************************************************

		// Runner Three

		// Initial information about the third runner
		System.out.print("Hello runner, Please enter you first and last name: ");
		String r3Name = keyboard.nextLine();
		String r3First = r3Name.split(" ")[0];
		String r3Last = r3Name.split(" ")[1];
		System.out.print(r3First + ", please enter your Mile One Time (mm:ss.sss): ");
		String r3MileOneTime = keyboard.nextLine();
		System.out.print(r3First + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String r3MileTwoTime = keyboard.nextLine();
		System.out.print(r3First + ", please enter your time to the end of the 5 km (mm:ss.sss): ");
		String r3MileThreeTime = keyboard.nextLine();
		System.out.println("");

		// Runner Three Calculations

		// First Split
		int r3MileOneMinutes = Integer.parseInt(r3MileOneTime.split(":")[0]);
		double r3MileOneSeconds = Double.parseDouble(r3MileOneTime.split(":")[1]);

		double r3TotalMileOne = ((r3MileOneMinutes * TOTAL_SECONDS) + r3MileOneSeconds);

		r3MileOneMinutes = (int) (r3TotalMileOne / TOTAL_SECONDS);
		r3MileOneSeconds = (r3TotalMileOne % TOTAL_SECONDS);

		String r3MileOneSecondsFormatted = (formatter.format(r3MileOneSeconds));
		String r3MileOneFinal = (r3MileOneMinutes + ":" + r3MileOneSecondsFormatted);

		// Second Split
		int r3MileTwoMinutes = Integer.parseInt(r3MileTwoTime.split(":")[0]);
		double r3MileTwoSeconds = Double.parseDouble(r3MileTwoTime.split(":")[1]);

		double r3TotalMileTwo = (r3MileTwoMinutes * TOTAL_SECONDS) + r3MileTwoSeconds;
		double r3MileTwo = (r3TotalMileTwo - r3TotalMileOne);

		r3MileTwoMinutes = (int) (r3MileTwo / TOTAL_SECONDS);
		r3MileTwoSeconds = r3MileTwo % TOTAL_SECONDS;

		String r3MileTwoSecondsFormatted = (formatter.format(r3MileTwoSeconds));
		String r3MileTwoFormatted = (r3MileTwoMinutes + ":" + r3MileTwoSecondsFormatted);

		// Third Split
		int r3MileThreeMinutes = Integer.parseInt(r3MileThreeTime.split(":")[0]);
		double r3MileThreeSeconds = Double.parseDouble(r3MileThreeTime.split(":")[1]);

		double r3TotalMileThree = (r3MileThreeMinutes * TOTAL_SECONDS) + r3MileThreeSeconds;
		double r3MileThree = (r3TotalMileThree - r3TotalMileTwo);

		r3MileThreeMinutes = (int) (r3MileThree / TOTAL_SECONDS);
		r3MileThreeSeconds = r3MileThree % TOTAL_SECONDS;

		String r3MileThreeSecondsFormatted = (formatter.format(r3MileThreeSeconds));
		String r3MileThreeFormatted = (r3MileThreeMinutes + ":" + r3MileThreeSecondsFormatted);

		r3TotalMileThree = r3TotalMileThree - (r3MileTwo);

		// Total Time
		int r3TotalTimeMinutes = Integer.parseInt(r3MileThreeTime.split(":")[0]);
		double r3TotalTimeSeconds = Double.parseDouble(r3MileThreeTime.split(":")[1]);

		double r3TotalTime = ((r3TotalTimeMinutes * TOTAL_SECONDS) + r3TotalTimeSeconds);

		r3TotalTimeMinutes = (int) (r3TotalTime / TOTAL_SECONDS);
		r3TotalTimeSeconds = (r3TotalTime % TOTAL_SECONDS);

		String r3TotalTimeSecondsFormatted = (formatter.format(r3TotalTimeSeconds));
		String r3TotalTimeFinal = (r3TotalTimeMinutes + ":" + r3TotalTimeSecondsFormatted);

		// Total Runner Three Summary

		System.out.println(r3First + ", here is your race summary:");
		System.out.println("****************************************");
		System.out.println("");

		System.out.println("Split One: " + r3MileOneFinal);
		System.out.println("Split Two: " + r3MileTwoFormatted);
		System.out.println("Split Three: " + r3MileThreeFormatted);
		System.out.println("Your total time was: " + r3TotalTimeFinal);
		System.out.println("");
		System.out.println("");

		// **********************************************************************

		// Runner Four

		// Initial information about the forth runner
		System.out.print("Hello runner, Please enter you first and last name: ");
		String r4Name = keyboard.nextLine();
		String r4First = r4Name.split(" ")[0];
		String r4Last = r4Name.split(" ")[1];
		System.out.print(r4First + ", please enter your Mile One Time (mm:ss.sss): ");
		String r4MileOneTime = keyboard.nextLine();
		System.out.print(r4First + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String r4MileTwoTime = keyboard.nextLine();
		System.out.print(r4First + ", please enter your time to the end of the 5 km (mm:ss.sss): ");
		String r4MileThreeTime = keyboard.nextLine();
		System.out.println("");

		// Runner Four Calculations

		// First Split
		int r4MileOneMinutes = Integer.parseInt(r4MileOneTime.split(":")[0]);
		double r4MileOneSeconds = Double.parseDouble(r4MileOneTime.split(":")[1]);

		double r4TotalMileOne = ((r4MileOneMinutes * TOTAL_SECONDS) + r4MileOneSeconds);

		r4MileOneMinutes = (int) (r4TotalMileOne / TOTAL_SECONDS);
		r4MileOneSeconds = (r4TotalMileOne % TOTAL_SECONDS);

		String r4MileOneSecondsFormatted = (formatter.format(r4MileOneSeconds));
		String r4MileOneFinal = (r4MileOneMinutes + ":" + r4MileOneSecondsFormatted);

		// Second Split
		int r4MileTwoMinutes = Integer.parseInt(r4MileTwoTime.split(":")[0]);
		double r4MileTwoSeconds = Double.parseDouble(r4MileTwoTime.split(":")[1]);

		double r4TotalMileTwo = (r4MileTwoMinutes * TOTAL_SECONDS) + r4MileTwoSeconds;
		double r4MileTwo = (r4TotalMileTwo - r4TotalMileOne);

		r4MileTwoMinutes = (int) (r4MileTwo / TOTAL_SECONDS);
		r4MileTwoSeconds = r4MileTwo % TOTAL_SECONDS;

		String r4MileTwoSecondsFormatted = (formatter.format(r4MileTwoSeconds));
		String r4MileTwoFormatted = (r4MileTwoMinutes + ":" + r4MileTwoSecondsFormatted);

		// Third Split
		int r4MileThreeMinutes = Integer.parseInt(r4MileThreeTime.split(":")[0]);
		double r4MileThreeSeconds = Double.parseDouble(r4MileThreeTime.split(":")[1]);

		double r4TotalMileThree = (r4MileThreeMinutes * TOTAL_SECONDS) + r4MileThreeSeconds;
		double r4MileThree = (r4TotalMileThree - r4TotalMileTwo);

		r4MileThreeMinutes = (int) (r4MileThree / TOTAL_SECONDS);
		r4MileThreeSeconds = r4MileThree % TOTAL_SECONDS;

		String r4MileThreeSecondsFormatted = (formatter.format(r4MileThreeSeconds));
		String r4MileThreeFormatted = (r4MileThreeMinutes + ":" + r4MileThreeSecondsFormatted);

		r4TotalMileThree = r4TotalMileThree - (r4MileTwo);

		// Total Time
		int r4TotalTimeMinutes = Integer.parseInt(r4MileThreeTime.split(":")[0]);
		double r4TotalTimeSeconds = Double.parseDouble(r4MileThreeTime.split(":")[1]);

		double r4TotalTime = ((r4TotalTimeMinutes * TOTAL_SECONDS) + r4TotalTimeSeconds);

		r4TotalTimeMinutes = (int) (r4TotalTime / TOTAL_SECONDS);
		r4TotalTimeSeconds = (r4TotalTime % TOTAL_SECONDS);

		String r4TotalTimeSecondsFormatted = (formatter.format(r4TotalTimeSeconds));
		String r4TotalTimeFinal = (r4TotalTimeMinutes + ":" + r4TotalTimeSecondsFormatted);

		// Total Runner Five Summary

		System.out.println(r4First + ", here is your race summary:");
		System.out.println("****************************************");
		System.out.println("");

		System.out.println("Split One: " + r4MileOneFinal);
		System.out.println("Split Two: " + r4MileTwoFormatted);
		System.out.println("Split Three: " + r4MileThreeFormatted);
		System.out.println("Your total time was: " + r4TotalTimeFinal);
		System.out.println("");
		System.out.println("");

		// **********************************************************************

		// Runner Three

		// Initial information about the fifth runner
		System.out.print("Hello runner, Please enter you first and last name: ");
		String r5Name = keyboard.nextLine();
		String r5First = r5Name.split(" ")[0];
		String r5Last = r5Name.split(" ")[1];
		System.out.print(r5First + ", please enter your Mile One Time (mm:ss.sss): ");
		String r5MileOneTime = keyboard.nextLine();
		System.out.print(r5First + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String r5MileTwoTime = keyboard.nextLine();
		System.out.print(r5First + ", please enter your time to the end of the 5 km (mm:ss.sss): ");
		String r5MileThreeTime = keyboard.nextLine();
		System.out.println("");

		// Runner Five Calculations

		// First Split
		int r5MileOneMinutes = Integer.parseInt(r5MileOneTime.split(":")[0]);
		double r5MileOneSeconds = Double.parseDouble(r5MileOneTime.split(":")[1]);

		double r5TotalMileOne = ((r5MileOneMinutes * TOTAL_SECONDS) + r5MileOneSeconds);

		r5MileOneMinutes = (int) (r5TotalMileOne / TOTAL_SECONDS);
		r5MileOneSeconds = (r5TotalMileOne % TOTAL_SECONDS);

		String r5MileOneSecondsFormatted = (formatter.format(r5MileOneSeconds));
		String r5MileOneFinal = (r5MileOneMinutes + ":" + r5MileOneSecondsFormatted);

		// Second Split
		int r5MileTwoMinutes = Integer.parseInt(r5MileTwoTime.split(":")[0]);
		double r5MileTwoSeconds = Double.parseDouble(r5MileTwoTime.split(":")[1]);

		double r5TotalMileTwo = (r5MileTwoMinutes * TOTAL_SECONDS) + r5MileTwoSeconds;
		double r5MileTwo = (r5TotalMileTwo - r5TotalMileOne);

		r5MileTwoMinutes = (int) (r5MileTwo / TOTAL_SECONDS);
		r5MileTwoSeconds = r5MileTwo % TOTAL_SECONDS;

		String r5MileTwoSecondsFormatted = (formatter.format(r5MileTwoSeconds));
		String r5MileTwoFormatted = (r5MileTwoMinutes + ":" + r5MileTwoSecondsFormatted);

		// Third Split
		int r5MileThreeMinutes = Integer.parseInt(r5MileThreeTime.split(":")[0]);
		double r5MileThreeSeconds = Double.parseDouble(r5MileThreeTime.split(":")[1]);

		double r5TotalMileThree = (r5MileThreeMinutes * TOTAL_SECONDS) + r5MileThreeSeconds;
		double r5MileThree = (r5TotalMileThree - r5TotalMileTwo);

		r5MileThreeMinutes = (int) (r5MileThree / TOTAL_SECONDS);
		r5MileThreeSeconds = r5MileThree % TOTAL_SECONDS;

		String r5MileThreeSecondsFormatted = (formatter.format(r5MileThreeSeconds));
		String r5MileThreeFormatted = (r5MileThreeMinutes + ":" + r5MileThreeSecondsFormatted);

		r5TotalMileThree = r5TotalMileThree - (r5MileTwo);

		// Total Time
		int r5TotalTimeMinutes = Integer.parseInt(r5MileThreeTime.split(":")[0]);
		double r5TotalTimeSeconds = Double.parseDouble(r5MileThreeTime.split(":")[1]);

		double r5TotalTime = ((r5TotalTimeMinutes * TOTAL_SECONDS) + r5TotalTimeSeconds);

		r5TotalTimeMinutes = (int) (r5TotalTime / TOTAL_SECONDS);
		r5TotalTimeSeconds = (r5TotalTime % TOTAL_SECONDS);

		String r5TotalTimeSecondsFormatted = (formatter.format(r5TotalTimeSeconds));
		String r5TotalTimeFinal = (r5TotalTimeMinutes + ":" + r5TotalTimeSecondsFormatted);

		// Total Runner Five Summary

		System.out.println(r5First + ", here is your race summary:");
		System.out.println("****************************************");
		System.out.println("");

		System.out.println("Split One: " + r5MileOneFinal);
		System.out.println("Split Two: " + r5MileTwoFormatted);
		System.out.println("Split Three: " + r5MileThreeFormatted);
		System.out.println("Your total time was: " + r5TotalTimeFinal);
		System.out.println("");
		System.out.println("");

		// Close the keyboard

		keyboard.close();

		// Final Overall Runner Chart

		System.out.println("Congratulation runners on finishing the race. Here is the summary chart of your races:");
		System.out.println("**************************************************************************************");
		System.out.printf("%15s%20s%20s%20s%20s%20s\n", "Runner Number", "Runner Name", "Split One Time",
				"Split Two time", "Split Three Time", "Total Time");
		System.out.printf("%15s%20s%20s%20s%20s%20s\n", "1.", r1Name, r1MileOneFinal, r1MileTwoFormatted,
				r1MileThreeFormatted, r1TotalTimeFinal);
		System.out.printf("%15s%20s%20s%20s%20s%20s\n", "2.", r2Name, r2MileOneFinal, r2MileTwoFormatted,
				r2MileThreeFormatted, r2TotalTimeFinal);
		System.out.printf("%15s%20s%20s%20s%20s%20s\n", "3.", r3Name, r3MileOneFinal, r3MileTwoFormatted,
				r3MileThreeFormatted, r3TotalTimeFinal);
		System.out.printf("%15s%20s%20s%20s%20s%20s\n", "4.", r4Name, r4MileOneFinal, r4MileTwoFormatted,
				r4MileThreeFormatted, r4TotalTimeFinal);
		System.out.printf("%15s%20s%20s%20s%20s%20s\n", "5.", r5Name, r5MileOneFinal, r5MileTwoFormatted,
				r5MileThreeFormatted, r5TotalTimeFinal);
	}

}
