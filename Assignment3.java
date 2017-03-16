/**@Author: Jordan Matthews
 * @VersionDate: 11/17/2016
 * 
 * @Purpose: To find a magic square 
 * 
 * @Pseudocode: 
 * 
 * 1. Declare the 3x3 array that is the "magic box" for my code i gave the box the values of 1 thru 9 instead of assigning it random
 * values each iteration so that it would never encounter issues with duplicates.
 * 
 * 2. prepare for methods. We are using the methods listed below
 * 
 * 	- sumRows: adds the values in each row, then checks to see if all rows are the same sum. If yes it returns the value to check
 * with the other methods, otherwise it returns a -1
 * 
 * 	- sumColumns: adds the values in each column, then checks to see if all rows are the same sum. If yes it returns the value to check
 * with the other methods, otherwise it returns a -1
 * 
 *	- sumDiagonal: adds the values in each diagonal, then checks to see if all rows are the same sum. If yes it returns the value to check
 * with the other methods, otherwise it returns a -1
 * 
 * 	-displayMagicSquare: this method print the square out to the user after each run.
 * 
 * 	-fillMatrix: this method takes the array and shuffles the numbers to different random positions in order to change the 
 * values of the box, it then sends the array back to be checked again and continues to randomize the values until it finds
 * a box
 * 
 * 	-isMagicSquare: is a method used to check that all the Rows, Columns, and Diagonals are the same value. If they are it terminates
 * the loop and prints the square one last time to the user
 * 
 * 3. The code keeps looping and counts the times it loops to keep a track of how effective it is each time its run. Once it
 * has found a magic square it displays the squares configuration to the user and the sum of it rows, columns, and diagonals as 
 * well as the amount of times it looped to find the square. 
 */
public class Assignment3 {
	public static void main(String[] args) {

		//open the main array and assign the values
		int[][] box = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int count = 0;

		
		//loop that calls the methods till a box is found, then displays that box and number of iterations 
		do {
			System.out.println(sumRows(box));
			System.out.println(sumColumns(box));
			System.out.println(sumDiagonal(box));
			displayMagicSquare(box);
			fillMatrix(box);
			count++;
		} while (!isMagicSquare(box));
		System.out.println("It took " + count + " attempts to find the Magic Square");
	}
	// methods

	//this method sums all the rows
	public static int sumRows(int[][] box) {
		int row1 = 0, row2 = 0, row3 = 0;

		row1 += box[0][0] + box[0][1] + box[0][2];
		row2 += box[1][0] + box[1][1] + box[1][2];
		row3 += box[2][0] + box[2][1] + box[2][2];

		if (row1 == row2 && row1 == row3) {
			return row1;
		}
		return -1;
	}

	
	//this method sums all the columns
	public static int sumColumns(int[][] box) {
		int col1 = 0, col2 = 0, col3 = 0;

		col1 += box[0][0] + box[1][0] + box[2][0];
		col2 += box[0][1] + box[1][1] + box[2][1];
		col3 += box[0][2] + box[1][2] + box[2][2];

		if (col1 == col2 && col1 == col3) {
			return col1;
		}
		return -1;
	}

	
	//this method sums all the diagonals
	public static int sumDiagonal(int[][] box) {
		int diag1 = 0, diag2 = 0;

		diag1 = box[0][0] + box[1][1] + box[2][2];
		diag2 = box[2][0] + box[1][1] + box[0][2];

		if (diag1 == diag2) {
			return diag1;
		}
		return -1;
	}

	//this method prints the array in the box shape to the user
	public static void displayMagicSquare(int[][] box) {
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[0].length; j++) {
				System.out.print(box[i][j] + " ");
			}
			System.out.println();
		}
	}

	//this method randomizes the numbers in the array each time its ran
	public static void fillMatrix(int[][] box) {
		int temp = -1;

		for (int k = 0; k < box.length; k++) {
			for (int j = 0; j < box[k].length; j++) {
				for (int i = box.length - 1; i > 0; i--) {
					int rand = (int) (Math.random() * (i + 1));
					temp = box[k][j];
					box[k][j] = box[rand][rand];
					box[rand][rand] = temp;
				}
			}
		}
	}

	//this method determines whether a box meets the criteria to be a magic box and then adjusts the boolean to true if it is
	public static boolean isMagicSquare(int[][] box) {
		if (sumRows(box) == sumColumns(box) && sumRows(box) == sumDiagonal(box) && sumRows(box) != -1) {
			System.out.println();
			System.out.println("This is a magic square");
			displayMagicSquare(box);
			System.out.println(sumRows(box));
			System.out.println(sumColumns(box));
			System.out.println(sumDiagonal(box));
			return true;
		} else {
			return false;
		}
	}
}
