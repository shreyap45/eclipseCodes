package String;
import java.util.*;

public class CountOccurence {

	public static void main(String[] args) {
	
   Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    
    while(t-->0) {
    	
    	String s = sc.nextLine();
    	int a = 0;
    	int b =0, c=0, d = 0;
    	for (int j = 0; j< s.length(); j++) {
			
	         if (Character.isUpperCase(s.charAt(j))) {
	        	 a++;
	         }
	         
	         else if(Character.isLowerCase(s.charAt(j))) {
	            b++;
	         }
	     
	         else  if (s.charAt(j) >= '0' && s.charAt(j)<= '9') {
             c++;
       	  }
	         
	         else {
    			 d++;
    		 }
    	 }	
    	
    	 System.out.println(a);
    	 System.out.println(b);
    	 System.out.println(c);
    	 System.out.println(d);
    }
	    }
}
