package String;
import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
	    int t = sc.nextInt();
	  
	    sc.nextLine();
	    
	    while(t-->0) {
	    	String s = sc.nextLine();
	    	
	    	System.out.println(s.replaceAll("[aeiouAEIOU]",""));
	    	
	}

}

}