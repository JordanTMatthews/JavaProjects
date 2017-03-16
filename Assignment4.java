
/**
 * @Author: Jordan Matthews
 * 
 * @versionDate: 12/5/2016
 * 
 * @purpose: To give the user a menu to go through a list in binary and linear search, and to allow the user to sort a 1000 
 * variable area using bubble and selections sort.
 * 
 * @Psuedocode: 
 * 
 * 1. we first start all the variables and arrays in the top of our main code, then we display a welcome message to the user
 * 
 * 2. Next we start a do while loop to begin the menu, then we call the menu method to display the menu to the user
 * then we allow the user to enter a choice for what the would like to do in the menu, we open a switch statement to direct them
 * to the choice they have chosen and call the appropriate methods from inside the cases.
 * 
 * 3. for linear search the code goes through each value in the array until it finds the value the user has selected, then is displays
 * that index for the other arrays as well and asks the user how many books he would like to buy and the final price
 * Binary sort does the same as selection, except that it finds the middle point and moves through the array in the direction of the supposed value.
 * 
 * 4. for bubble and selection sort, the code creates an array at the beginning of the main method, and then assigns 1000 variables to it between 1 and 500
 * it randomizes the values in the array every time the choices are selected from the menu. It then sends the arrays to be sorted after it prints the unsorted
 * ones to the user. After the arrays are sorted via the bubble sort method and the selection sort method they are sent back to the user and printed.
 * 
 * 5. The menu loops until the user decides to quit, and has defaults to tell the user if they have entered an invalid input.
 */
import java.util.*;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String[] bookTitle = { "Starting out with Java", "Java Programming", "Software Structures",
				"Design and Analysis of Algorithms", "Computer Graphics", "Artificial Intelligence: A Modern Approach",
				"Probability and Statistics", "Cognitive Science", "Modern Information Retrieval",
				"Speech and Language Processing" };
		int[] bookID = { 1101, 1211, 1333, 1456, 1567, 1642, 1699, 1755, 1800, 1999 };
		double[] bookPrice = { 112.32, 73.25, 54.00, 67.32, 135.00, 173.22, 120.00, 42.25, 32.11, 123.75 };
		int[] array = new int[1000];
		int choice = 0;
		int index = 0;
		int amount = 0;
		int choice2 = 0;

		// welcome message to user
		System.out.println("Welcome!\n");

		// Beginning of the menu loop
		do {
			menu();
			choice = stdin.nextInt();
			switch (choice) {
			// Linear Search
			case 1:

				// setting variables to zero
				index = 0;
				amount = 0;

				// display the choice to user and display the arrays
				System.out.println("\n*****Linear Serach*****");
				display(bookID, bookTitle, bookPrice);

				// prompt the user for a book id choice
				System.out.println("\nPlease select a book ID for your purchase: ");
				choice2 = stdin.nextInt();

				// start timer
				long startTime3 = System.currentTimeMillis();

				// linear search the array for the users choice
				index = linearSearch(choice2, bookID);

				// end timer
				long endTime3 = System.currentTimeMillis();

				// call bookTotal method to display totals to user
				bookTotal(index, amount, bookID, bookTitle, bookPrice);

				// display time
				System.out.println("That took " + ((endTime3 - startTime3)) + " milliseconds\n");

				break;
			// Binary Search
			case 2:

				// setting variables to zero
				index = 0;
				amount = 0;

				// display the choice to user and display the arrays
				System.out.println("\n*****Binary Serach*****");
				display(bookID, bookTitle, bookPrice);

				// prompt the user for a book id choice
				System.out.println("\nPlease select a book ID for your purchase: ");
				choice2 = stdin.nextInt();

				// start timer
				long startTime = System.currentTimeMillis();

				// Binary search the array for the users choice
				index = binarySearch(choice2, bookID);

				// end timer
				long endTime = System.currentTimeMillis();

				// call bookTotal method to display totals to user
				bookTotal(index, amount, bookID, bookTitle, bookPrice);

				// display time
				System.out.println("That took " + ((endTime - startTime)) + " milliseconds\n");

				break;

			// Bubble Sort
			case 3:
				// start timer
				long startTime2 = System.currentTimeMillis();

				for (int i = 0; i < array.length; i++) {
					array[i] = ((int) (Math.random() * (500 - 1 + 1) + 1));
				}

				// display unsorted array
				System.out.print("The unsorted array is ");
				System.out.println(Arrays.toString(array));

				// call the method to sort the array
				bubbleSort(array);

				// display the sorted array back to the user
				System.out.print("The sorted array is ");
				System.out.println(Arrays.toString(array));

				// end timer
				long endTime2 = System.currentTimeMillis();

				// display time
				System.out.println("That took " + ((endTime2 - startTime2)) + " milliseconds\n");

				break;

			// Selection sort
			case 4:
				// start timer
				long startTime4 = System.currentTimeMillis();

				for (int i = 0; i < array.length; i++) {
					array[i] = ((int) (Math.random() * (500 - 1 + 1) + 1));
				}

				// display array
				System.out.print("The unsorted array is ");
				System.out.println(Arrays.toString(array));

				// sort the array with selection sort
				selectionSort(array);

				// display the sorted array
				System.out.print("The sorted array is ");
				System.out.println(Arrays.toString(array));

				// end timer
				long endTime4 = System.currentTimeMillis();

				// display time
				System.out.println("That took " + ((endTime4 - startTime4)) + " milliseconds\n");

				break;

			// Quit
			case 5:
				choice = 5;
				System.out.println("Goodbye!");
				break;

			// default for and invalid option
			default:
				System.out.println("Invalid choice!");
				break;

			}
		} while (choice != 5);
	}

	// Methods Start here
	// method for displaying the menu to the user
	public static void menu() {
		System.out.println(
				"1. Linear Search\n2. Binary Search\n3. Bubble Sort\n4. Selection Sort\n5. Quit\nPlease enter and option 1-5:");
	}

	// method for displaying the arrays to the user
	public static void display(int[] bookID, String[] bookTitle, double[] bookPrice) {
		for (int i = 0; i < bookID.length; i++) {
			System.out.println(i + ", " + bookID[i] + ", " + bookTitle[i] + ", " + bookPrice[i]);
		}
	}

	// method for linearSearching the book ID's
	public static int linearSearch(int choice2, int[] bookID) {
		int index = 0;

		for (int i = 0; i < bookID.length; i++) {
			if (bookID[i] == choice2) {
				index = i;
				break;
			}
			if (bookID[i] != choice2) {
				index = -1;
			}
		}
		return index;
	}

	// Binary Search Method
	public static int binarySearch(int choice2, int[] bookID) {

		int low = 0;
		int high = bookID.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;
			if (bookID[mid] == choice2) {
				return mid;
			} else if (bookID[mid] > choice2) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	// method for bubble sort
	public static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) {
					// swap the elements
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	// method for selection sort
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	}

	// book total value method
	public static void bookTotal(int index, int amount, int[] bookID, String[] bookTitle, double[] bookPrice) {
		Scanner stdin = new Scanner(System.in);
		double total = 0;

		if (index >= 0) {
			System.out.println("how many copies would you like to purchase?");
			amount = stdin.nextInt();

			total += bookPrice[index] * amount;

			System.out.println("Book ID " + bookID[index] + "\nBook Title " + bookTitle[index]
					+ "\nNumber of books bought " + amount + "\nTotal cost is $" + total + "\n");
		} else {
			System.out.println("ID not found\n");
		}
	}
}
