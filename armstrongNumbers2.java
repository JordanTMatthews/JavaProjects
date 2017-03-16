/*@Author: Jordan Matthews
 * Date: 9/26/2016
 * 
 * Ask the user if they want to enter a number or if they want the computer to select a random number.
 * 
 * Based on the user selection, Ask the user for a number or generate a random number.
 * 
 * Read the number from the user (Skip the step if a random number is generated)
 * 
 * Check if the number is 1 digit or 2 digit or 3 digit or 4 digit
 * 
 * if it is 1 digit then check if the cube of number equals the number
 * 
 * else if it is 2 digit, get the cube of first and second digits and then sum them up and check if the number is equal to the sum.
 * 
 * else if it is 3 digit, get the cube of first, second and third digits and then sum them up and check if the number is equal to the sum.
 * 
 * if it is 4 digit, get the cube of first, second, third and fourth digits and then sum them up and check if the number is equal to the sum.
 * 
 * else tell the user that the number they have entered is not within 9999
 * 
 * Print a closing message saying if the number is an Armstrong number or not.
 * 
 * Print a goodbye statement.
 */
import java.util.Scanner;

public class armstrongNumbers2 {
	public static void main(String [] args){
		
		Scanner stdin = new Scanner(System.in);
		
		int numberLength = 0;
		int ranNum = 0;
		int num1A, num2A, num3A, num4A;
		int num1, num2, num3, num4;
		//ask user if they would like to enter a number or receive one
		System.out.println("would you like to enter your own number or recieve a random number? \n"
				+ "enter \"Y\" for yes \n"
				+ "or \"N\" for no ");
		String answer1 = stdin.next();
		char answer = answer1.charAt(0);
		
		// if the user says yes to the 
		if (answer == 'Y' || answer == 'y'){
			System.out.println("Please enter your number");
			String userNumber = stdin.next();
			numberLength = String.valueOf(userNumber).length();
			ranNum = Integer.parseInt(userNumber);
		}
		
		//if the user lets the computer generate the number
		if(answer == 'N' || answer == 'n'){
		    ranNum = (1+ (int)(Math.random() * 9999));
			System.out.println("your number is " + ranNum);
		
			numberLength = String.valueOf(ranNum).length();
		}
		
		//switch to determine length of number inputed
			switch (numberLength){
			
			//this is for numbers with 1 character
			case 1:
				num1 = Integer.parseInt(Integer.toString(ranNum).substring(0,1));
				num1A = num1;
				if(num1A == num1){
				System.out.println(ranNum + " is a armstrong number");
				}
				else{
				System.out.println(ranNum + " is not an armstrong number");
				}
				break;
				
			//this is for numbers with 2 characters
			case 2:
				num1 = Integer.parseInt(Integer.toString(ranNum).substring(0,1));
				num2 = Integer.parseInt(Integer.toString(ranNum).substring(1,2));
				num1A = num1 * num1;
				num2A = num2 * num2;
				int numVar = num1A + num2A;
				if(numVar == ranNum){
					System.out.println(ranNum + " is a armstrong number");
				}
				else{
					System.out.println(ranNum + " is not a armstrong number");
				}
				break;
				
			//this is for numbers with 3 characters
			case 3:
				num1 = Integer.parseInt(Integer.toString(ranNum).substring(0,1));
				num2 = Integer.parseInt(Integer.toString(ranNum).substring(1,2));
				num3 = Integer.parseInt(Integer.toString(ranNum).substring(2,3));
				num1A = num1 * num1 * num1;
				num2A = num2 * num2 * num2;
				num3A = num3 * num3 * num3;
				int numVar2 = num1A + num2A + num3A;
				if(numVar2 == ranNum){
					System.out.println(ranNum + " is a armstrong number");
				}
				else{
					System.out.println(ranNum + " is not a armstrong number");
				}
				break;
				
			//this is for numbers with 4 characters
			case 4:
				num1 = Integer.parseInt(Integer.toString(ranNum).substring(0,1));
				num2 = Integer.parseInt(Integer.toString(ranNum).substring(1,2));
				num3 = Integer.parseInt(Integer.toString(ranNum).substring(2,3));
				num4 = Integer.parseInt(Integer.toString(ranNum).substring(3,4));
				num1A = num1 * num1 * num1 * num1;
				num2A = num2 * num2 * num2 * num2;
				num3A = num3 * num3 * num3 * num3;
				num4A = num4 * num4 * num4 * num4;
				int numVar3 = num1A + num2A + num3A + num4A;
				if(numVar3 == ranNum){
					System.out.println(ranNum + " is a armstrong number");
				}
				else{
					System.out.println(ranNum + " is not a armstrong number");
				}
				break;
		}
	}		
}