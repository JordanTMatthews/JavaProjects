import java.util.Scanner;

public class LoopTest4 {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		
		int total = 0;
		int value = 0;
		
		while (total >= 0){
			value = stdin.nextInt();
			total += value;
			
			System.out.println(total);
		}
		
		
	}
}
