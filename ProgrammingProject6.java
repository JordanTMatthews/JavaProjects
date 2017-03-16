/**@Author: Jordan Matthews
 *@Date: 10/31/16 
 */
import java.util.Scanner;

public class ProgrammingProject6 {
	public static void main(String [] args){
		
		//declaring variables
		Scanner stdin = new Scanner(System.in);
		String sen = null;
		
		//prompting for input from user
		System.out.println("Please enter a string");
		sen = stdin.nextLine();
		
		
		//displaying letter count
		System.out.print("the total letters are: " + letterCount(sen));
		
	}
//method
public static int letterCount(String sen){
	//declaring variables
	int count = 0;
	char var;
	
	
	//loop goes through each character of the String thats input
	for (int i = 0; i < sen.length(); i++){
		
		//assigns the char to var
		var = sen.charAt(i);
		
		//if var is a letter it increases the counter
		if ((var >= 'a' && var <= 'z') || (var >= 'A' && var <= 'Z')){
			count ++;
			}
		}
	
	//returns the counter
	return count;
	}
}
