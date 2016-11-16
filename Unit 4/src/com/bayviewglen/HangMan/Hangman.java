package com.bayviewglen.HangMan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		// figure out how to check if word is alpha-numerical

		Scanner keyboard = new Scanner(System.in);
		final String UPPER_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		final int LETTER_CHECK = -1;
		boolean validChoice = true;
		boolean validName = true;

		// Initial name information

		System.out.print("Hello player one, please enter your name: ");
		String playerOne = keyboard.nextLine();

		System.out.print("Hello player two, please enter your name: ");
		String playerTwo = keyboard.nextLine();
		System.out.println("");

		//to determine guesser and other for loop and mod
		
		// Round

		System.out.println("-----------Round Start-----------");
		System.out.print("Please enter your word of choice (only alpha-numerical letters): ");
		String GuessPhrase = keyboard.nextLine().toUpperCase();
		System.out.println("");

		for (int i = 0; i < GuessPhrase.length(); i++) {
			validName = false;
			if (UPPER_ALPHABET.indexOf(GuessPhrase.charAt(i)) == LETTER_CHECK) {
				System.out.println("");
				System.out.print("Your phrase must be alpha-numerical, please re-enter your phrase: ");
				GuessPhrase = keyboard.nextLine().toUpperCase();
				System.out.println("");
			} else {
				validName = true;
			}
		}
		
			for (int j = 0; j < GuessPhrase.length(); j++) {

				if ((int) GuessPhrase.charAt(j) >= 65 && (int) GuessPhrase.charAt(j) <= 90
						|| (int) GuessPhrase.charAt(j) >= 48 && (int) GuessPhrase.charAt(j) <= 57) {
					System.out.print("_ ");
				} else if ((int) GuessPhrase.charAt(j) >= 97 && (int) GuessPhrase.charAt(j) <= 122) {
					System.out.print("_ ");
				} else {
					System.out.print("/ ");

				}
			}

		

		while (validChoice) {
			validChoice = false;
			System.out.println("");
			System.out.print("Guesser, Would You like to guess a letter(1) or guess the entire phrase(2): ");
			String choice = keyboard.nextLine();
			if (choice.equals("1")) {
				System.out.print("Please enter your letter: ");
				String t1chosenLetter = keyboard.nextLine();
			} else if (choice.equals("2")) {
				System.out.print("Please enter the phrase: ");
				String t1chosenPhrase = keyboard.nextLine();
			} else {
				System.out.print("Please enter either 1 or 2: ");
				String t1secondTry = keyboard.nextLine();
				validChoice = true;
			}

		}

	}

}
