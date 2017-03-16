import java.util.Scanner;

public class Chapter5_2Set3 {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		
		String input = null;
		int land = 0;
		int air = 0;
		int water = 0;
		
		while (!(input.contains("xxxxx"))){
			input = stdin.next();
			
			if(input.contains("land")){
				land++;
				System.out.println(land);
			}
			if(input.contains("air")){
				air++;
			}
			if(input.contains("water")){
				water++;
			}
		}
		
		System.out.println("land " + land + "\nair " + air + "\nwater" + water);
	}
}
