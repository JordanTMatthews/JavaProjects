import java.util.Scanner;

public class loopTest2 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int n = -1;
		while (n >= 1 && n <= 10){
			System.out.println("enter a Int");
			n = input.nextInt();
		}
		System.out.println("inside the zone");		  
	}
}
