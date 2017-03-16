import java.util.Scanner;
import java.text.DecimalFormat;

public class TwoHighestScores {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		
		DecimalFormat f = new DecimalFormat("#.00");
		
		int count = 0;
		int numOfStudents = 0;
		String name1 = null;
		String name2 = null;
		String secondName = null;
		double score1 = 0;
		double score2;
		double secondHigh = 0;
		
		System.out.println("Enter the number of students:");
		numOfStudents = stdin.nextInt();
		stdin.nextLine();
		
		for(count = 1; count <= numOfStudents; count++){
			
			System.out.println("Student " + count + " of " + numOfStudents);
			
			System.out.print("enter students name:");
			name2 = stdin.nextLine();
			
			
			System.out.print("Enter students score:");
			score2 = stdin.nextDouble();
			stdin.nextLine();
			
			if (score2 > score1){
				secondHigh = score1;
				score1 = score2;
				secondName = name1;
				name1 = name2;
			}
			
			
		}
		System.out.println("The highest score was " + (f.format(score1)) + " and " + name1 + " got it");
		System.out.println("The second highest score was " + (f.format(secondHigh)) + " and " + secondName + " got it");
	}
}


