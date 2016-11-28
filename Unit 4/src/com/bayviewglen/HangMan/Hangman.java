package com.bayviewglen.HangMan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		// figure out how to check if word is alpha-numerical

		Scanner keyboard = new Scanner(System.in);
		final String UPPER_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		final String UPPER_ALPHABET_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
		String possibleGuesses = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String codedPhrase = "";
		final int LETTER_CHECK = -1;
		String chosenLetter = null;
		boolean validChoice = true;
		boolean validName = true;
		boolean validLetter = true;
		boolean roundsContinue = true;
		boolean triesContinue = true;
		int rounds = 1;
		int finalScore = 8;
		String guesser = null;
		String phraseMaker = null;


		// Initial name information

		System.out.print("Hello player one, please enter your name: ");
		String playerOne = keyboard.nextLine();

		System.out.print("Hello player two, please enter your name: ");
		String playerTwo = keyboard.nextLine();
		System.out.println("");

		// to determine guesser and other for loop and mod

		// Round Start
		while (rounds <= 10) {
			if (rounds % 2 == 0) {
				guesser = playerOne;
				phraseMaker = playerTwo;
			} else {
				guesser = playerTwo;
				phraseMaker = playerOne;
			}

			System.out.println("-----------Round " + rounds + "-----------");
			System.out.print(phraseMaker + ", please enter your word of choice (only alpha-numerical letters): ");
			String guessPhrase = keyboard.nextLine().toUpperCase().trim();
			System.out.println("");

			for (int i = 0; i < guessPhrase.length(); i++) {
				validName = false;
				if (UPPER_ALPHABET_SPACE.indexOf(guessPhrase.charAt(i)) == LETTER_CHECK) {
					System.out.println("");
					System.out.print("ERROR - Your phrase must be alpha-numerical, please re-enter your phrase: ");
					guessPhrase = keyboard.nextLine().toUpperCase().trim();
					System.out.println("");
				} else {
					validName = true;
				}
			}

			for (int k = 0; k < 12; k++) {
				System.out.println("");
			}

			for (int j = 0; j < guessPhrase.length(); j++) {

				if ((int) guessPhrase.charAt(j) >= 65 && (int) guessPhrase.charAt(j) <= 90
						|| (int) guessPhrase.charAt(j) >= 48 && (int) guessPhrase.charAt(j) <= 57) {
					codedPhrase += "_ ";
				} else {
					codedPhrase += "/ ";
				}
			}
			System.out.println("");
			System.out.println(guesser + ", time to start guessing!");

			for (int totalTries = 1; totalTries <= 7; totalTries++) {

				System.out.println("");

				System.out.println("Attempt " + totalTries);
				validChoice = true;
				while (validChoice) {
					validChoice = false;
					System.out.println("");
					System.out.println(codedPhrase);
					System.out.print(guesser + ", would you like to guess a letter(1) or guess the entire phrase(2): ");
					String choice = keyboard.nextLine();
					if (choice.equals("1")) {

						System.out.println("Your available letters are: " + possibleGuesses);
						System.out.println("");
						System.out.print(guesser + ", please enter your letter: ");
						validLetter = false;
						while (!validLetter) {
							chosenLetter = keyboard.nextLine().toUpperCase().trim();
							if (UPPER_ALPHABET_SPACE.indexOf(chosenLetter.charAt(0)) == LETTER_CHECK) {
								System.out.print(
										"ERROR - The letter you entered must be alpha-numeric, please re-enter: ");
							} else if (chosenLetter.length() < 1 || chosenLetter.length() > 1) {
								System.out.print("ERROR - Please only enter one letter. Please retry: ");
							} else {
								validLetter = true;
							}
						}

						int index = possibleGuesses.indexOf(chosenLetter);
						for (int m = 0; m <= index; m++)
							if (UPPER_ALPHABET_SPACE.substring(m, m + 1).equals(chosenLetter)) {
								possibleGuesses = possibleGuesses.substring(0, m) + "-"
										+ possibleGuesses.substring(m + 1);
							}
						System.out.println("");
						System.out.println(possibleGuesses);

						for (int n = 0; n < guessPhrase.length(); n++) {
							if (guessPhrase.substring(n, n + 1).equals(chosenLetter)) {
								codedPhrase = codedPhrase.substring(0, n * 2) + chosenLetter
										+ codedPhrase.substring(n * 2 + 1);
							}
						}
						if (guessPhrase.indexOf(chosenLetter) != LETTER_CHECK) {
							System.out.println("Your letter is correct!");
						} else {
							System.out.println("Sorry, your letter is not correct.");
						}

						if (codedPhrase.indexOf('_') == LETTER_CHECK) {
							System.out.println("");
							System.out
									.println("Congradulations" + guesser + "! You correctly guessed all the letters.");
							totalTries = 7;
							rounds ++;
						}

					} else if (choice.equals("2")) {
						System.out.print(guesser + ", please enter the phrase: ");
						String chosenPhrase = keyboard.nextLine().toUpperCase().trim();
						if (chosenPhrase.equals(guessPhrase)) {
							System.out.println("Your guess is correct!");
							totalTries = 7; 
							rounds ++;
						} else {
							System.out.println("Sorry, your guess is inncorect.");
						}
					} else {
						System.out.print("ERROR - Please enter either 1 or 2: ");
						String secondTry = keyboard.nextLine();
						validChoice = true;
					}

				}

			}

		}
	}
}
