package String;
import java.util.Scanner;

public class ClearIndices {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		    int t = sc.nextInt();
		    int n = sc.nextInt();
		    sc.nextLine();
		    
		    while(t-->0) {
		    	String s = sc.nextLine();
		    	System.out.print(s.substring(0,s.length()-n));
		    	}
	}
	    }

