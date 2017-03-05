package com.bayviewglen.horseracing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class HorseRacing {

	static final int ADJUST_ARR = 1;
	static int adjustPT = 1;
	static ArrayList names = new ArrayList();
	static ArrayList wallets = new ArrayList();
	static ArrayList playerBets = new ArrayList();
	static ArrayList playerHorse = new ArrayList();
	static ArrayList horsesInRace = new ArrayList();
	static ArrayList betChoices = new ArrayList();
	static ArrayList<Integer> winHorse = new ArrayList<>();
	static Scanner keyboard = new Scanner(System.in);
	static String newName = null;
	static String yes = ("1");
	static int randomHorse = 0;
	static int min = 1;
	static int maximum = 5;
	static int newWallet = 0;
	static int finalWallet = 0;
	static int amountWinners = 0;
	static int poolAmount = 0;
	static int race = 1;
	static int playerChoice = 0;
	static boolean validChoice = true;
	static String removeName = null;
	static int finalPool = 0;
	static int rounds = 1;
	static boolean win = false;
	static boolean removeChoice = true;
	static boolean validName = true;
	static boolean correctBet = true;
	static boolean throughPlayers = true;
	static boolean horse = false;
	static boolean yesHorse = true;
	static boolean raceFinished = false;
	static boolean gameOn = true;
	static int bet = 0;
	static String[] horsesInRaceNames = null;
	static String horseBet = null;
	static String[] horses = getHorses();
	static String[] inGameHorse = initializeHorse(horses);
	static int[] position = new int[horses.length];
	static int betChoice = 0;
	static int playerBet = 0;
	static int restoreOriginalBet = 0;

	public static void main(String[] args) {

		introMessage();
		while (gameOn) {
			beforeRaceInfo(rounds);
			bettingPeriod();
			displayRace();
			payOutBets();
			askPlayAgain(gameOn);
		}
		closingMessage();

	}
	
	//at the very end asks if you would like the game to close
	private static boolean askPlayAgain(boolean gameOn) {
		System.out.println("Would you like to play again?");
		System.out.println("(1) yes");
		System.out.println("(2) no");
		String playAgain = keyboard.next();
		System.out.println("You can never leave...");
		return gameOn;

	}
	
	//distributes all the won money evenly to all of the winners
	private static void payOutBets() {
		for (int i = 0; i < names.size(); i++) {
			playerChoice = (int) betChoices.get(i);
			if (playerChoice == 1) {
				if (playerHorse.get(i).equals(randomHorse)) {
					System.out.println("Congradulations " + names.get(i) + " your horse has won!");
					int playerMoney = (int) wallets.get(i);
					int playerBet = (int) playerBets.get(i);
					//gives back the winning player/s original money
					restoreOriginalBet = playerMoney + playerBet;
					wallets.set(i, restoreOriginalBet);
					amountWinners++;
				} else {
					System.out.println("Sorry, " + names.get(i) + " but your horse lost that race.");
					int playerBet = (int) playerBets.get(i);
					poolAmount = poolAmount + playerBet;
				}
			} else {
				//if they chose to not bet on this race
				System.out.println(names.get(i) + " you did not chose to bet on this race.");
			}
		}
		//creates and distributes the pool of money evenly between each winner
		finalPool = poolAmount / amountWinners;
		for (int k = 0; k < names.size(); k++) {
			if (playerHorse.get(k).equals(randomHorse)) {
				System.out.println("Congradulations " + names.get(k) + " your wallet has been updated!");
				int playerMoney = (int) wallets.get(k);
				finalWallet = finalPool + playerMoney;
				wallets.set(k, restoreOriginalBet);
				amountWinners++;
			}
		}
	}

	private static void displayRace() {
		// shows the horses move across the field
		track();
		while (!win) {
			moveHorses();
			win = checkForWinner(position);
		}
		winHorses(randomHorse);
		randomHorse = winHorses(randomHorse);
		System.out.println("And the winner is: " + horsesInRace.get(randomHorse) + "!");
		System.out.println();
	}

	private static void track() {
		// creates and displays the track
		for (int i = 0; i < horsesInRace.size(); i++) {
			System.out.println("--------------------------------------------------------------------");
			System.out.printf("%-3s " + horsesInRace.get(i), " ");
			System.out.println("");
		}

		System.out.println("--------------------------------------------------------------------");
		System.out.println();

	}

	private static int winHorses(int randomHorse) {
		//chooses a random winner
		randomHorse = (int) (Math.random() * 5 + 1);
		return randomHorse;
	}

	private static boolean checkForWinner(int[] position) {
		//checks for the winning horse
		boolean win = false;
		for (int i = 0; i < position.length; i++) {
			if (position[i] == 20)
				win = true;
		}
		return win;
	}

	private static int winningHorse(int[] position) {
		// see which horse wins
		int winner = 0;
		for (int i = 0; i < position.length; i++) {
			if (position[i] == 30)
				;
			winner = i;
		}
		return winner;
	}

	private static void moveHorses() {
		// moves the horse
		for (int i = 0; i < position.length; i++) {
			int j = (int) (Math.random() * 3);
			position[i] += j;
		}
	}

	private static void bettingPeriod() {
		//prints player table
		printPlayerTable();
		System.out.println("");
		//displays the race horses
		displayHorses(inGameHorse);
		System.out.println("");
		System.out.println("It's time to place your bets!");
		System.out.println("");
		// prompts players to bet
		playerBets();
		System.out.println("Betting is now closed! The race will now start!");

	}
	
	//gets player bets
	private static void playerBets() {
		for (int k = 1; k < names.size(); k++) {
			correctBet = true;
			yesHorse = true;
			for (int i = 0; i < names.size(); i++) {
				//asks if they want to bet on this race
				System.out.println(names.get(i) + " would you like to bet on this race? (1 Yes or 2 No)");
				betChoice = keyboard.nextInt();
				betChoices.add(betChoice);
				correctBet = true;
				yesHorse = true;
				while (correctBet) {
					if (betChoice == 1) {
						// if betting display name and wallet
						System.out.print(names.get(i) + " you have $" + wallets.get(i)
								+ ", please type the amount you wish to bet: ");

						playerBet = keyboard.nextInt();
						int playerMoney = (int) wallets.get(i);
						if (playerMoney == 0) {
							//checks if they have any money in their wallet
							System.out
									.println("Sorry but you have no money left. Please come back when you have money.");
							correctBet = false;
						} else if (playerBet > playerMoney) {
							// makes sure you don't bet more than you have
							System.out.println("You cannot bet more money than you currently have available");
							correctBet = true;
						} else {
							// Prompts user to bet on a specific horse
							System.out.print(
									"Please type the name of the horse you wish to bet on (Please be exact this is case sensitive): ");
							while (yesHorse) {
								// subtracts bet from wallet
								horseBet = keyboard.next().trim();
								for (int j = 0; j < horsesInRace.size(); j++) {
									if (horseBet.equals(horsesInRace.get(j))) {
										int newMoney = playerMoney - playerBet;
										wallets.set(i, newMoney);
										playerHorse.add(horseBet);

										horse = true;
										yesHorse = false;
										correctBet = false;
										throughPlayers = false;
									}

								}
								// checks if the horse they selected is in the race
								if (!horse) {
									System.out.print("Sorry but that horse is not in this race. Please re-try here: ");
									yesHorse = true;
								}
							}

						}
					// if they don't bet
					} else {
						System.out.println("coward");
						throughPlayers = false;
						correctBet = false;
					}

				}
			}
		}

	}
	
	// first message
	private static void introMessage() {
		System.out.println("Hello and welcome to horse racing!");
		System.out.println("To get started please select an option:");

	}
	
	// ending message
	private static void closingMessage() {
		System.out.println("Thank you for participating in todays races! We hope to see you again.");
		keyboard.close();

	}

	//gets initial information
	private static void beforeRaceInfo(int rounds) {

		System.out.println("");
		System.out.println("Welcome back for another wonderful day out on the tracks!");
		validChoice = true;
		while (validChoice) {
			System.out.println("");
			System.out.println("(1) Add New Player");
			System.out.println("(2) Remove Players");
			System.out.println("(3) Start Game");
			String menuChoice = keyboard.next().trim();
			int choice = makeNumber(menuChoice);
			rounds++;
			if (choice == 1) {
				// if they choose add new player
				newName();
			} else if (choice == 2) {
				//remove player
				if (names.size() == 0) {
					// if no other players
					System.out.println("You cannot remove if there are no current players...");
				} else {
					//remove player method
					removePlayer();
				}
			} else if (choice == 3) {
				//begins race
				if (names.size() <= 1) {
					//must have two people playing to start the race
					System.out.println("To begin the race you must have at least two players");
				} else {
					System.out.println("Lets begin!");
					validChoice = false;

				}
			} else {
				// checks if they enter 1, 2, or 3
				System.out.println("Please enter either 1, 2, or 3");
			}
		}

	}

	//adds new name to roster
	private static void newName() {

		validName = true;

		while (validName) {
			boolean isNumber = true;
			// asks for starting money
			System.out.print("Please enter the amount of money you would like to start off with (maximum 1000): ");
			newWallet = keyboard.nextInt();
			int wallet = newWallet;

			if (isNumber) {
				if (wallet >= 1001) {
					// must input less than 1000
					System.out.println("Sorry you must input an amount less than 1000");
				} else {
					// asks for name
					wallets.add(newWallet);
					System.out.print("Please enter your name: ");
					newName = keyboard.next().trim().toUpperCase();
					names.add(newName);
					validName = false;
				}
			} else {
				//checks if they enter a number
				System.out.println("That is not a number...");
				validName = true;
			}

		}

	}

	private static void removePlayer() {
		// prints all current players
		System.out.println("Here are all of the players currently in the game: " + names);
		System.out.print("Please type the name of the person you wish to remove: ");
		removeName = keyboard.next().trim().toUpperCase();
		removeChoice = true;
		boolean remover = false;
		// searches for and removes player
		for (int i = 0; i < names.size(); i++) {
			if (removeName.equals(names.get(i))) {
				names.remove(i);
				wallets.remove(i);
				remover = true;
			}

		}
		// if entered wrong or not an existing player
		if (!remover) {
			System.out.println("Sorry but that name is not a current player.");
		}
	}
	
	private static String[] initializeHorse(String[] horses) {
		// select random horses for the race
		int random = (int) (Math.random() * (4) + 5);
		int numHorses = horses.length;
		String[] horsesPlaying = new String[random];
		int[] horseIndex = new int[random];
		boolean previousInt = false;

		for (int i = 0; i < random; i++) {
			int y = (int) (Math.random() * numHorses);
			previousInt = checkIfDuplicate(y, horseIndex);
			while (previousInt) {
				y = (int) (Math.random() * numHorses - 1);
				previousInt = checkIfDuplicate(y, horseIndex);
			}
			horseIndex[i] = y;
		}

		for (int i = 0; i < random; i++) {
			horsesPlaying[i] = horses[horseIndex[i]];
		}

		return horsesPlaying;
	}

	private static boolean checkIfDuplicate(int x, int[] y) {
		// makes sure there are no dup. horses
		for (int num : y) {
			if (num == x) {
				return true;
			}
		}
		return false;
	}

	private static int makeNumber(String str) {
		int integer = 0;
		try {
			integer = Integer.parseInt(str);

		} catch (NumberFormatException toNumber) {

		}
		return integer;
	}

	private static void printPlayerTable() {
		//prints players and their wallets
		for (int i = 0; i < wallets.size(); i++) {
			System.out.println("");
			for (int j = 0; j <= 24; j++) {
				System.out.print("~");
			}

			System.out.println("");

			System.out.printf("%-1s | %-10s | %-5s |", i + 1, names.get(i), "$" + wallets.get(i));
		}
		System.out.println("");
		for (int i = 0; i <= 24; i++) {
			System.out.print("~");
		}
		System.out.println("");
	}

	private static void displayHorses(String[] arr) {
		// displays horses in the race
		System.out.println("");
		System.out.println("The Horses in todays race will be: ");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(i + 1 + ". " + arr[i]);
			horsesInRace.add(arr[i]);
		}

	}

	private static boolean checkNumeric(String budget) {
		try {
			Integer.parseInt(budget);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}


	/*
	 * Reads the horses from a file assume the file exists and is in the format
	 * specified in the assignment.
	 */

	public static String[] getHorses() {
		String[] horses = null;
		try {
			Scanner scanner = new Scanner(new File("input/horses.dat"));
			int numHorses = Integer.parseInt(scanner.nextLine());
			horses = new String[numHorses];

			for (int i = 0; i < numHorses; i++) {
				horses[i] = scanner.nextLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return horses;
	}

	/*
	 * Check if a horse is already in the race - uses a modified search method
	 */

	public static boolean alreadyInRace(int horse, int[] blank) {

		for (int i = 0; i < blank.length; i++) {
			if (blank[i] == horse) {
				return true;
			}
		}

		return false;
	}
}
