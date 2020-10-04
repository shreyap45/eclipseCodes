package Java;
import java.util.*;

public class LeadGame {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result1 = 0;
		int result2 = 0;
		int lead = 0; 
		int post = 0;
		int temp = 0;
		
		for (int i = 1; i <=n; i++) {
			
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		
		result1 = result1 + p1;
		result2 = result2 + p2;
		
		if (result1 > result2 && result1 - result2 > lead) {
			lead = result1 - result2;
			post = 1;
			
		}
		else if (result2 > result1 && result2 - result1 > lead) {
			lead = result2 - result1;
			post = 2;
		} 
		
	          }
		System.out.println(post+ " " +lead);
}
      }