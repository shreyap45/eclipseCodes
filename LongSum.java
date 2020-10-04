package array1;
import java.util.*;
public class LongSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();

	    long a [] = new long [n];
	    
	    for (int i = 0; i<n ; i++) {
	        a[i] = sc.nextLong();
	    }
	    long result =0;
	    for (int i = 0; i< n ; i++){
	         result = result + a[i];
	    }
	    System.out.println(result);
	}

}
