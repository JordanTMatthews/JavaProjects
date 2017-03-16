import java.util.Scanner;

public class LoopTest3 {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		
		int value = 1;
		
		while (value > 0){
			
			value = stdin.nextInt();
			if(value > 0){
			if (value % 2 == 0){
			System.out.print(value + " ");
			
				}
			}
		}
	}
}
