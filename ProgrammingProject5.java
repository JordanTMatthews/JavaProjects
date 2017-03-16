/**@Author: Jordan Matthews
 * @Date: 10/31/16
 */
import java.util.Scanner;

public class ProgrammingProject5 {
	public static void main(String [] args){
		
		//Declaring variables and opening scanner
		Scanner stdin = new Scanner(System.in);
		String pass = null;
		int answer;
		
		//asking for password and allowing input
		System.out.println("Enter a password:");
		pass = stdin.next();
		answer = CheckPassword(pass);
		
		//displaying answers
		if (answer == 0){
			System.out.println("not a valid password");
		} else if (answer == 1) {
			System.out.println("Valid password");
		}
	}
//methods
	
	public static int CheckPassword(String pass){
		int answer;
		
		//checks for if the password is less than 8 characters 
		if (pass.length() < 8) {   
	        return answer = 0;  
	        
	       //if it does'nt fail that check it moves to here
	    } 
		
		else {      
	    	
	    	//variables for character holder and counter
	        char var;  
	        int count = 0;   
	        
	        //for loop that runs through each letter of the String
	        for (int i = 0; i < pass.length(); i++) {  
	            var = pass.charAt(i);  
	            
	            //checks each character to make sure it is a letter or digit and nothing else
	            if (!((var >= 'a' && var <= 'z') || (var >= 'A' && var <= 'Z') || (var >= '0' && var <= '9'))) {          
	                return answer = 0;  
	                
	                //counts the digits in the Character
	            } else if ((var >= '0' && var <= '9')) {  
	                count++;     
	            }  
	        }  
	        //checks the character count to ensure at least 2
	        if (count < 2)   {     
	            return answer = 0;  
	        }  
	    }  
		//if it passes all checks it says yes
	    return answer = 1;  
	}  
}

