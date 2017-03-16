import java.util.Scanner;
public class ProgrammingProject2 {
	public static void main(String [] args){
	 Scanner stdin = new Scanner(System.in);
	    
	    System.out.println("Enter a String:");
	    
	    String sample = stdin.nextLine();
	    
	    System.out.println("The String is of length " + sample.length() +
	    	" and the first character is " + sample.charAt(0));
	    
	    
	}
}