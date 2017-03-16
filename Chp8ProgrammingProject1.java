import java.util.*;

public class Chp8ProgrammingProject1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int size = 0;

		System.out.println("Please enter a int for the dimension of the Array, Ex 4 is a 4x4 array. ");
		size = stdin.nextInt();
		double[][] array = new double[size][size];
		System.out.println("Please fill the array with doubles");

		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				array[i][k] = stdin.nextDouble();
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Sum of diagonals is: ");
		System.out.print(sumMajorDiagonal(array));
	}

	public static double sumMajorDiagonal(double[][] array) {
		double diag = 0;

		for (int i = 0; i < array.length; i++) {
			diag += array[i][i];
		}

		return diag;
	}
}
