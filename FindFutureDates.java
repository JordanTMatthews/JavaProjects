/*@author: Jordan Matthews
 * Date: 9/21/2016
 * Purpose: to allow the user to enter a date and recive that day value and the day x days
 * the input
 * 
 */
import java.util.Scanner;

public class FindFutureDates {
	
	public static void main(String [] args){
		
		Scanner stdin = new Scanner(System.in);
		
		//prompt for user input on day
		System.out.println("Please enter the number for today Ex: (sunday - 0 , "
				+ "Saturday - 6, Etc.) :");
		int today = stdin.nextInt();
		
		//prompt for user input for days from day X
		System.out.println("Please enter the number of days elapsed since today: ");
		int nextDay = stdin.nextInt();
		//switch for the first day
		switch (today){
			case 0: 
			System.out.print("Today is sunday");
			break;
			
			case 1: 
				System.out.print("Today is Monday");
			break;
			
			case 2: 
				System.out.print("Today is Tuesday");
			break;
			
			case 3: 
				System.out.print("Today is Wednesday");
			break;
			
			case 4: 
				System.out.print("Today is Thursday");
			break;
			
			case 5: 
				System.out.print("Today is Friday");
			break;
			
			case 6: 
				System.out.print("Today is Saturday");
			break;
			
			default: 
				System.out.print("Today is an invalid starting day. Today's day must be 0-6.");
		}
		// Day from X day
		int thatDay = (today + nextDay) % 7;
		
		switch (thatDay){
		case 0: 
		System.out.print(" and the future day is sunday");
		break;
		
		case 1: 
			System.out.print(" and the future day is Monday");
		break;
		
		case 2: 
			System.out.print(" and the future day is Tuesday");
		break;
		
		case 3: 
			System.out.print(" and the future day is Wednesday");
		break;
		
		case 4: 
			System.out.print(" and the future day is Thursday");
		break;
		
		case 5: 
			System.out.print(" and the future day is Friday");
		break;
		
		case 6: 
			System.out.print(" and the future day is Saturday");
		break;
		}
	}
}
