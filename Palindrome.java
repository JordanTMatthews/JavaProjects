/*@Author: Jordan Matthews
 * Date: 9/21/2016
 * Purpose: To allow the user to enter a value and check if its a plaindrome 
 * 
 */
import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args){

	     //variables
	      int number;
	   
	      //Scanner initialization
	      Scanner stdin = new Scanner (System.in); 
	      
	      //prompt the user to input a three digit number  
	      System.out.print("Please input a three-digit number:");
	      number = stdin.nextInt();

	        int digit1 = (int)(number / 100); //check first number
	        int remaining = number % 100;
	        int digit3 = (int)(remaining % 10);//check second number
	        //check if they match
	        System.out.println(number + ((digit1 == digit3) ? " is a palindrome" : " is not a palindrome"));

	    }
	}
	 