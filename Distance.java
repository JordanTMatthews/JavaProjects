/*@Author: Jordan Matthews
 *@Date: 10/5/2016
 *
 *Write a program with the class name “Distance”.
 * Allow the user to enter two coordinate points (an x and y value for each point).
 * Then display the distance between these two points.
 *  Use the equation to calculate distance:
 * 
 */
import java.util.Scanner;

public class Distance {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		
		//entering points for distance
		System.out.println("please enter your X and Y cordinates pressing enter after each value: ");
		double X1 = stdin.nextDouble();
		double Y1 = stdin.nextDouble();
		double X2 = stdin.nextDouble();
		double Y2 = stdin.nextDouble();
		
		//math calculations
		double XFinal = Math.pow((X2 - X1), 2);
		double YFinal = Math.pow((Y2 - Y1), 2);
		
		double distance = Math.sqrt(XFinal + YFinal);
	
		System.out.println("Your X and Y coordinates are: (" + X1 + "," + Y1 + ") and (" + X2 + "," + Y2 + "). "
				+ "\nThe Distance between your 2 values is " + distance);
		
		stdin.close();
	}
}
