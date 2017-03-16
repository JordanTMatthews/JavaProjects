/**@Author: Jordan Matthews
 * @Date: 10/31/16
 */
import java.util.Scanner;

public class ProgrammingProject4 {
	public static void main(String [] args){
		
		//opening scanner and declaring variable
		Scanner stdin = new Scanner(System.in);
		long n = 0;
		
		//prompting for the user to enter a long
		System.out.print("Enter an integer:");
		n = stdin.nextLong();
		
		//displaying the value of the method
		System.out.print("The sum of the digits in " + n + " is " + sumDigits(n));
	}
	
//method here
	//this method uses the formula given to me by the project file
	public static int sumDigits(long n){
		int sum = 0;
		
		while (n > 0) {
		    sum += n % 10;
		    n = n / 10;
		}
		return sum;
	}
}
