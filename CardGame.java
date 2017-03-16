/**@Author: Jordan Matthews
 * @VersionDate: 11/9/16
 */
import java.util.*;

public class CardGame {
	public static void main(String[] args) {
		//open variables and scanner
		Scanner stdin = new Scanner(System.in);
		int choice = -1;

		//start the deck and assign it 52 spaces
		int[] deck = new int[52];

		// this assigns the values of 2 to 14 for the cards to all 52
		for (int i = 0, count = 2; i < 13; i++, count++) {
			deck[i] = count;
		}

		for (int i = 13, count = 2; i < 26; i++, count++) {
			deck[i] = count;
		}

		for (int i = 26, count = 2; i < 39; i++, count++) {
			deck[i] = count;
		}

		for (int i = 39, count = 2; i < 52; i++, count++) {
			deck[i] = count;
		}

		//ask the user if they'd like to play game 1 or 2
		System.out.println("Would you like to play or see an AI simulation of 100 games? (1 or 2)");
		choice = stdin.nextInt();

		if (choice == 1) {
			part1(deck);
		} else if (choice == 2) {
			part2(deck);
		} else {
			System.out.println("Invalid Choice!");
		}
		stdin.close();
	}

	// user plays
	public static void part1(int[] deck) {
		int choice = -1;
		int CPUChoice = -1;
		int playerCard = 0;
		int CPUCard = 0;
		int temp = 0;

		Scanner stdin = new Scanner(System.in);

		// randomize the cards
		for (int i = deck.length - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			temp = deck[i];
			deck[i] = deck[rand];
			deck[rand] = temp;
		}

		//ask the user to pick a card
		System.out.println("Please pick a number from 0 to 51, for your card: ");
		choice = stdin.nextInt();

		//loop for CPU to pick a card that isnt the same as the user
		do {
			CPUChoice = (int) (Math.random() * (51 - 0 + 1) - 0);
		} while (CPUChoice == choice);

		playerCard = deck[choice];
		CPUCard = deck[CPUChoice];

		//run the values against the checks to determine the winner
		if (CPUCard > playerCard) {
			System.out.println("Computer Wins! cards were " + playerCard + " and " + CPUCard);

		} else if (playerCard > CPUCard) {
			System.out.println("Player Wins! cards were " + playerCard + " and " + CPUCard);
		} else {
			System.out.println("Tie! cards were " + playerCard + " and " + CPUCard);
		}
		stdin.close();
	}

	// computers play
	public static void part2(int[] deck) {
		
		//open variables
		int CPU2Choice = -1;
		int CPUChoice = -1;
		int CPU2Card = 0;
		int CPUCard = 0;
		int CPUWins = 0;
		int CPU2Wins = 0;
		int temp = 0;
		int playCount = 0;
		int tieCount = 0;

		//random card for CPU1
		for (playCount = 0; playCount < 100; playCount++) {
			CPUChoice = (int) (Math.random() * (51 - 0 + 1) - 0);

			//random card for CPU2 that isn't CPU1's card
			do {
				CPU2Choice = (int) (Math.random() * (51 - 0 + 1) - 0);
			} while (CPUChoice == CPU2Choice);

			CPU2Card = deck[CPU2Choice];
			CPUCard = deck[CPUChoice];

			//run the cards against the checks 
			if (CPUCard > CPU2Card) {
				CPUWins++;
			} else if (CPU2Card > CPUCard) {
				CPU2Wins++;
			} else {
				tieCount++;
			}

			// this shuffles the values in the array after each run
			for (int i = deck.length - 1; i > 0; i--) {
				int rand = (int) (Math.random() * (i + 1));
				temp = deck[i];
				deck[i] = deck[rand];
				deck[rand] = temp;
			}
		}

		//display values of results after 100 runs
		if (CPUWins > CPU2Wins) {
			System.out.println("CPU1 Wins! with " + CPUWins + " wins, there were " + tieCount + " ties");
		} else if (CPU2Wins < CPUWins) {
			System.out.println("CPU2 Wins! with " + CPU2Wins + " wins, there were " + tieCount + " ties");
		} else {
			System.out.println("Tie");
		}
	}
}
