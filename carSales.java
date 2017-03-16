/*@Author: Jordan Matthews
 * Date: 9/9/2016
 * Purpose: A program that will take then name of a car and its price and apply sales tax and the membership
 * discount as well as showing the salesman his commission for selling the car
 * 
 */
//import scanner utility
import java.util.Scanner;

public class carSales {
	public static void main(String [] args){
		
		//Initialize input
		Scanner stdin = new Scanner(System.in);
		
		//prompt for user input for car model
		System.out.println("Please enter the model name of the vehicle your pruchasing: ");
		
		//activate input
		String carName = stdin.nextLine();
		
		//prompt for input of car price with 2 decimal places
		System.out.println("Please enter the price of the vehicle (Ex: 25000.00): ");
		
		//Activate input
		double carPrice = stdin.nextDouble();
		
		//declare variables
		double salesTax = 0.036;
		double memDis = 0.15;
		double commission = 0.10;
		double beforeDiscount;
		double afterDiscount;
		
		//Calculate totals
		beforeDiscount = (carPrice * salesTax) + carPrice;
		afterDiscount = beforeDiscount - (beforeDiscount * memDis);
		double endCommission = afterDiscount * commission;
		double salesTaxFinal = carPrice * salesTax;
		double discount = beforeDiscount * memDis;
		
		//display results to the console
		System.out.println("Car model: " + carName);
		System.out.println("initial price of vehicle: $" + carPrice);
		System.out.println("Sales Tax: $" + salesTaxFinal);
		System.out.println("Discount: $" + discount);
		System.out.println("Final price: $" + afterDiscount);
		System.out.println("Commission: $" + endCommission);
		
		stdin.close();
	}
}
