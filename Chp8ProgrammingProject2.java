import java.util.*;

public class Chp8ProgrammingProject2 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		int in = stdin.nextInt();

		// Turn input to binary in a string format using toBinaryString 
		String var = Integer.toBinaryString(in);

		// Here I add enough zeros in front of the 1's so that the string has at minimum 9 characters
		// I used the ParseInt Method to read the binary value from var.
		// Then I use String.format to turn the value into a string with 9 places in it.
		var = String.format("%09d", Integer.parseInt(var));

		// Then I go through the binary string one char at a time and display the values onto the grid going through the rows one at a time
		for (int i = 1; i < 10; i++) {
			if ('0' == var.charAt(i - 1)) {
				System.out.print("H ");
			} else {
				System.out.print("T ");
			}

			// Start a new line after 3 prints
			if (i % 3 == 0) {
				System.out.println();
			}
			stdin.close();
		}
	}
}
