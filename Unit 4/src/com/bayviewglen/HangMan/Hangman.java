package com.bayviewglen.HangMan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		//All my declarations
		Scanner keyboard = new Scanner(System.in);
		final String UPPER_ALPHABET_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
		String possibleGuesses = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String codedPhrase = "";
		String finalGuess = null;
		final int LETTER_CHECK = -1;
		String chosenLetter = null;
		boolean validChoice = true;
		boolean validName = true;
		boolean validLetter = true;
		boolean gameOn = true;
		boolean roundOn = true;
		int rounds = 1;
		int totalTries = 0;
		final int SPACES_INB = 20;
		final int MOD_TWO = 2;
		final int DETERMINE_ROUND = 0;
		final int PLAYER = 0;
		final int DETERMINE_SCORER = 1;
		final int MAX_GUESSES = 7;
		final int MAX_POINTS = 9;
		int maxRounds = 10;
		final int DETERMINE_PLAYER = 2;
		int p1Score = 0;
		int p2Score = 0;
		int finalScore = 0;
		String guesser = null;
		String phraseMaker = null;
		boolean reduCheck = true;

		// Initial name information and beginning of game

		System.out.print("Hello player one, please enter your name: ");
		String playerOne = keyboard.nextLine();

		System.out.print("Hello player two, please enter your name: ");
		String playerTwo = keyboard.nextLine();
		System.out.println("");

		System.out.println("Alright lets start! Your roles will switch after each round.");

		// Beginning round information
		while (gameOn) {
			gameOn = false;
			while (rounds <= maxRounds) {
				codedPhrase = "";
				totalTries = 0;
				
				//Declaring who the guesser is and who is making the phrase
				if (rounds % DETERMINE_PLAYER == PLAYER) {
					guesser = playerOne;
					phraseMaker = playerTwo;
				} else {
					guesser = playerTwo;
					phraseMaker = playerOne;
				}
				
				//Round starts
				System.out.println("");
				System.out.println("");
				System.out.println("-----------Round " + rounds + "-----------");
				
				//Entering the phrase
				System.out.print(phraseMaker + ", please enter your phrase of choice (only alpha-numerical letters): ");
				String guessPhrase = keyboard.nextLine().toUpperCase().trim();
				System.out.println("");

				//Checking if all the letters in the phrase are alpha-numerical
				finalScore = 9;
				possibleGuesses = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
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
				
				//Creates space between guessing and the actual phrase
				for (int k = 0; k < SPACES_INB; k++) {
					System.out.println("");
				}
				
				//Assigning each character either an _ (letter) or / (space)
				for (int j = 0; j < guessPhrase.length(); j++) {

					if ((int) guessPhrase.charAt(j) >= 65 && (int) guessPhrase.charAt(j) <= 90
							|| (int) guessPhrase.charAt(j) >= 48 && (int) guessPhrase.charAt(j) <= 57) {
						codedPhrase += "_ ";
					} else {
						codedPhrase += "/ ";
					}
				}
				
				//Guessing begins
				System.out.println("");
				System.out.println(guesser + ", time to start guessing!");

				while (totalTries < MAX_GUESSES && roundOn) {
					System.out.println("");

					System.out.println(guesser + ", you have used " + totalTries + " attempts.");
					validChoice = true;
					while (validChoice) {
						validChoice = false;
						System.out.println("");
						System.out.println(codedPhrase);
						System.out.print(
								guesser + ", would you like to guess a letter(1) or guess the entire phrase(2): ");
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
								} else if (possibleGuesses.indexOf(chosenLetter.charAt(0)) == LETTER_CHECK) {
									System.out.print("ERROR - You have already imputed this number, please retry: ");
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
								totalTries++;
							} else {
								System.out.println("Sorry, your letter is not correct.");
								totalTries++;
							}

							if (codedPhrase.indexOf('_') == LETTER_CHECK) {
								System.out.println("");
								System.out.println(
										"Congratulations" + guesser + "! You correctly guessed all the letters.");
								totalTries++;
								roundOn = false;
							}

							if (totalTries == MAX_GUESSES && codedPhrase.indexOf('_') != LETTER_CHECK) {
								System.out.print(
										"This is your final guess, you must input what you think the phrase is: ");
								finalGuess = keyboard.nextLine().toUpperCase().trim();
								if (finalGuess.equals(guessPhrase)) {
									System.out.println("Correct!");
									totalTries++;
								} else {
									System.out.println("Sorry that is incorrect");
									totalTries = 9;
									roundOn = false;
								}
							}

						} else if (choice.equals("2")) {
							System.out.print(guesser + ", please enter the phrase: ");
							String chosenPhrase = keyboard.nextLine().toUpperCase().trim();
							if (chosenPhrase.equals(guessPhrase)) {
								System.out.println("Your guess is correct!");
								totalTries++;
								roundOn = false;

							} else {
								System.out.println("Sorry, your guess is incorrect.");
								totalTries++;
							}
						} else {
							System.out.print("ERROR - Please enter either 1 or 2!");
							validChoice = true;
						}

					}

				}

				if (rounds % DETERMINE_PLAYER == DETERMINE_SCORER) {
					p1Score += MAX_POINTS - totalTries;
					rounds++;
					roundOn = true;
				} else {
					p2Score += MAX_POINTS - totalTries;
					rounds++;
					roundOn = true;

				}
				System.out.println("");
				System.out.println("Scores");
				System.out.println(playerOne + ", your score is: " + p1Score);
				System.out.println(playerTwo + ", your score is: " + p2Score);

			}
			if (rounds % MOD_TWO != DETERMINE_ROUND && p1Score > p2Score) {
				System.out.println("Congratulations " + playerOne + ", you are victorious!");
				gameOn = false;
			} else if (rounds % MOD_TWO != DETERMINE_ROUND && p1Score < p2Score) {
				System.out.println("Congratulations " + playerTwo + ", you are victorious!");
				gameOn = false;
			} else {
				System.out.println("");
				System.out.println("You have tied. You will continue until someone has won!");
				maxRounds++;
				gameOn = true;
			}

		}
		while (reduCheck) {
			reduCheck = false;
			System.out.println(
					"Congrats on making it to the end! Did you enjoy playing my game? (Y) for yes and (N) for no.");
			String playAgain = keyboard.nextLine().toUpperCase();
			if (!(playAgain.equals("Y") || playAgain.equals("N"))) {
				System.out.println("Please input Y or N (Its really not that hard): ");
				reduCheck = true;
			} else if (playAgain.equals("Y")) {
				System.out.println("Great! It was fun to make!");
			} else {
				System.out.println(
						"Ryan? I'm amazed you even got past the beginning! You probably would have enjoyed it more if you had stayed in Comp Sci.");

			}
		}
		keyboard.close();
	}

}
