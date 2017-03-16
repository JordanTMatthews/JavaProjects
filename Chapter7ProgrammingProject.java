
/**@Author: Jordan Matthews
 * @VersionDate: 11/9/16
 * 
 */
import java.util.*;

public class Chapter7ProgrammingProject {
	public static void main(String[] args) {
		
		//open Scanner and apply variable
		Scanner stdin = new Scanner(System.in);
		int students = 0;

		//prompt for user input for amount of students
		System.out.println("Please enter the number of students: ");
		students = stdin.nextInt();

		//make an array for grades based off amount of students
		int[] grades = new int[students];

		System.out.println("Please enter " + students + " scores");
		
		//enter grades for the entire length of the array
		for (int i = 0; i < grades.length; i++) {
			grades[i] = stdin.nextInt();
		}

		//start variable for the max value
		int max = 0;

		//check through the array for the max value
		for (int i = 0; i < grades.length; i++) {
			if (i == 0) {
				max = grades[i];
			}

			max = Math.max(max, grades[i]);
		}

		//check the grades against the max for the parameters and print its result
		for (int i = 0; i < grades.length; i++) {

			if (grades[i] >= (max - 10)) {
				System.out.println("Student " + i + " with score " + grades[i] + " got an A");
			} else if (grades[i] >= (max - 20)) {
				System.out.println("Student " + i + " with score " + grades[i] + " got an B");
			} else if (grades[i] >= (max - 30)) {
				System.out.println("Student " + i + " with score " + grades[i] + " got an C");
			} else if (grades[i] >= (max - 40)) {
				System.out.println("Student " + i + " with score " + grades[i] + " got an D");
			} else {
				System.out.println("Student " + i + " with score " + grades[i] + " got an F");
			}
		}
		stdin.close();
	}
}
