package String;
import java.util.*;

public class Alphanumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 1; i<=t; i++) {
			String s = sc.next();
          for (int j = 0; j< s.length(); j++) {
        	  if (s.charAt(j) >= '0' && s.charAt(j)<= '9') {
        		System.out.print( s.charAt(j));
        	  }
      	}
   }
     }
}