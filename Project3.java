import java.util.*;

public class Project3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//int variables
		int numOfStudents = 0;
		String largName = "";
		String secLargName = "";
		double largGrade = 0;
		double secLargGrade = 0;

		//ask for values
		System.out.println("Enter the number of students:");
		numOfStudents = scan.nextInt();
		scan.nextLine();
		
		//looping for each student and grade
		for (int count = 1; count <= numOfStudents; count++) {

			System.out.println("Student " + count + " of " + numOfStudents);

			System.out.print("enter students name:");
			String name = scan.nextLine();

			System.out.print("Enter students score:");
			double grade = scan.nextDouble();
			scan.nextLine();

			//finding first highest
			if (grade > largGrade) {
				secLargGrade = largGrade;
				secLargName = largName;
				largGrade = grade;
				largName = name;
			}
			//finding second highest
			else if (grade > secLargGrade){
				secLargGrade = grade;
				secLargName = name;
			}

		}
		//print values to user
		System.out.println("The highest score was " + largGrade + " and " + largName + " got it");
		System.out.println("The second highest score was " + secLargGrade + " and " + secLargName + " got it");
	}
}
