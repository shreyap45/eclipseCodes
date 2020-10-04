package String;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		    int t = sc.nextInt();
		    int n = sc.nextInt();
		    sc.nextLine();
		    
		    while(t-->0) {
		    	String s = sc.nextLine();
		        String a = "";
		        for (int i = 0; i<n; i++) {
		        	a = a+ s.charAt(i); 
		        }
		        if (s.equals(a)) {
		        	System.out.println("yes");
		        }
		        else {
		        	System.out.println("no");
		        }
		    	
		    	
	}
	   }
}
