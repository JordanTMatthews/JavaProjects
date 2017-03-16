import java.util.Scanner;

public class PalindromeTest {
	public static void main(String [] args){

	     //variables
	      int number;
	   
	      //Scanner initialization
	      Scanner stdin = new Scanner (System.in); 
	      
	      //prompt the user to input a three digit number  
	      System.out.print("Please input a three-digit number:");
	      number = stdin.nextInt();

	        int digit1 = (int)(number / 100);
	        int remaining = number % 100;
	        int digit3 = (int)(remaining % 10);

	        System.out.println(number + ((digit1 == digit3) ? " is a palindrome" : " is not a palindrome"));


	    }
	}
	 