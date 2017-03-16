import java.util.Scanner;

public class Chapter5_2ExerciseSet4 {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		
		int k = 0;
		int l = 1;
		int total = 0; 
		
		while(l > 0){
			k = stdin.nextInt();
			l = k;
			if (k % 2 == 0){
			total += k;
			}
		}
		System.out.println(total);
	}
}
