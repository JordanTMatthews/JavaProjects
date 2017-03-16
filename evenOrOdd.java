import java.util.Scanner;

public class evenOrOdd {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		
		boolean run = true;
		while(run){
		
		System.out.println("please enter a value from 1 to 9: ");
		int x = stdin.nextInt();
		
		
		if ( (x & 1) == 0 ) { System.out.println("even \n");}
		else { System.out.println("odd \n"); }
		
		
		
		}
		
		stdin.close();
	}
}
