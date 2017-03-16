import java.util.*;

public class Loops {
	public static void main(String [] args){
		
		int count = 0;
		int sum = 0, i = 1;
		
		//the while loop is all about the condition that makes the loop continue
		while (count < 5){
			System.out.println("this is a test to print 5 times in a loop");
			count++;
		}
		
		while (i < 10){
			sum = sum + i;
			i++;
		}
		System.out.println("\nsum is " + sum);
		
		 int number1 = (int)(Math.random() * 10);
		    int number2 = (int)(Math.random() * 10);

		    // Create a Scanner
		    Scanner input = new Scanner(System.in);

		    System.out.print(
		      "What is " + number1 + " + " + number2 + "? ");
		    int answer = input.nextInt();
		    
		    while (number1 + number2 != answer) {
		      System.out.print("Wrong answer. Try again. What is " 
		        + number1 + " + " + number2 + "? ");
		      answer = input.nextInt();
		    }

		    System.out.println("You got it!");
		    
		    int k = 0;
		    while(k < 88){
		        System.out.print("*");
		        k++;
		    }
		    int n = -1;
		    while (n > 1 && n < 10){
		    	n = input.nextInt();
		    }
		    System.out.println("inside the zone");		  
		   }
	}
