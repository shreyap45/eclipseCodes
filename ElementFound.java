package array1;
import java.util.*;

public class ElementFound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [][] = new int [n][n];
        for (int i = 0; i <n; i++) {
        	for (int j = 0; j<n; j++) {
        		
        	a[i] [j] = sc.nextInt();
        }
            }
        int x = sc.nextInt();
        
        int row = 0, col= 0;
        boolean s = false;
        
        for (int i = 0; i <n; i++) {
        	for (int j = 0; j<n; j++) {
        
        		if (x == a [i] [j]) {
        	   row = i;
        	   col = j;
        	   s = true;
        	break;
        		}
        	
        }
            }
    	if (s == true) {
    		 System.out.println(row+ " " +col);
		}
    	else {
    		   System.out.println("SHUT UP");	    
    	}
    		
	}
}