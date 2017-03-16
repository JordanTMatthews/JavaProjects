/*@Author Jordan Matthews	
 * Date: 9/7/2016
 * How to calculate TIP
 * 1. get check amount and TIP%
 * 2. tip amount as check amount * TIP%
 * total as check amount + tip amount
 * display tip amount & total
 */
// import java utilities 
import java.util.Scanner;

public class tipCalculator {
	public static void main(String [] args){
	double checkTotal;
	double tipPercent;
	double tipAmount;
	double total;
	
	// setup scanners for input of data
	Scanner stdin = new Scanner(System.in);
	
	//Prompt for variable amounts
	System.out.print("enter check total ");
	checkTotal = stdin.nextDouble();
	
	//Prompt for tip variable
	System.out.print("enter Tip percentage as a decimal please ");
	tipPercent = stdin.nextDouble();
	
	//Compute tip and display answer
	tipAmount = (checkTotal * tipPercent);
	
	//Compute Total and display answer
	total = (tipAmount + checkTotal);
	System.out.println("the tip amount is " + tipAmount + ", your total bill will be " + total);
	
	//Close the Scanners
	stdin.close();
	}
}