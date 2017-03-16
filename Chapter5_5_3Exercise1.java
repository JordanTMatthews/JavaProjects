
public class Chapter5_5_3Exercise1 {
	public static void main(String [] args){
		
		int k = 1;
		int total = 0;
		int n = 5;
		int n2 = 5;
		int k2 = 0;
		int total2 = 0;
		do{
		   total += k * k;
		    k++;
		} while (k <= 50);
		
		System.out.println(total);
		
		do { 
			System.out.print("*");
			n--;
		} while (n > 0);
		
		do{
			k2 = n2;
			total2 += k2 * k2 * k2;
			n2--;
			
		} while (n2 > 0);
		
		System.out.println(total2);
	}
}