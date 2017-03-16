import java.util.Scanner;

public class Project5 {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter an integer to be the limit of the pattern");
		int value = stdin.nextInt();
		
		//pattern A
		 for(int i = 1; i <= value; i++){
	            for(int j = 1; j <= i; j++){
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
		 System.out.println();
		 
		 //pattern B
         for(int i = 1, r = value; i <= value; i++, r--){
             for(int j = 1; j <= r; j++){
                 System.out.print(j + " ");
             }
             System.out.println();        }
		 
		 System.out.println();
		 
		 //pattern C
         for(int i = 1; i <= value; i++){
             for(int j = i; j > 0; j--){
                 System.out.print(j + " ");
             }
             System.out.println();
         }
         System.out.println();
         
       //pattern D
         for(int i = 1, r = value; i <= value; i++, r--){
             for(int j = 1; j <= r; j++){
                 System.out.print(j + " ");
             }
             System.out.println();        }
		 
		 System.out.println();
         
         
	}
}

