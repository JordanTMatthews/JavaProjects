/*@Author: Jordan Matthews
 * Date: 9/21/2016
 * Purpose: to check if a point is inside the area of the triangle
 */
import java.util.Scanner;

public class InsideTheTriangle {
	public static void main(String [] args){
		//we ask for 2 other points
		 System.out.print("Enter a point's x- and y-coordinates: ");
	        Scanner input = new Scanner(System.in);
	        double x = input.nextDouble();
	        double y = input.nextDouble();
	        //check that the point is above the A and B line and below the Hyp
	        if ( (y > 0) && (x > 0) && (x + 2 * y < 200) )
	        	//display output
	            System.out.println("The point is in the triangle");
	        else
	            System.out.println("The point is not in the triangle");
	       
	}
}
