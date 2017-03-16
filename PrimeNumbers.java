/*@project: Prime Number checker
 * @Author: Jordan Matthews
 * Purpose: to check if an input number is a prime number, it will loop until the user enters -1
 * 
 */
import java.util.*;

public class PrimeNumbers {
	public static void main(String[]agrs){
		//open scanner
		Scanner scan = new Scanner(System.in);
		
		//open variables
		int number=0;
		
		//open loop
		while(number !=-1){
			//prompt for input
			System.out.println("input a number or input -1 to end the code:");
			number = scan.nextInt(); 
			
			//assign boolean
			boolean isPrime = true;
			if (number<2){
				isPrime = false;
			} else{
				for (int i = 2; i<number; i++){
					if (number%i == 0){
						isPrime = false;
						break;
					}
				}
			}
			//for is prime
			if (isPrime){
				System.out.println(number + " is prime!");
			}
			//for isnt prime
			else{
				System.out.println(number + " is not prime.");
			}
		}
		
		// checking for values between 1 and the specified value 
		System.out.println("How many numbers do you want?");
		int num =scan.nextInt();
		for(int o = 1;o<=num;o++ ){
			boolean isPrime = true;
			if (o<2){
				isPrime = false;
			} else{
				for (int i = 2; i<o; i++){
					if (o%i == 0){
						isPrime = false;
						break;
				
					}
				}
			}
			//is prime
			if (isPrime){
				System.out.println(o+" is prime");
			}
			//isnt prime
			else{
				System.out.println(o+" is not prime");
			}
		}
	}
}