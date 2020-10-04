package array1;
import java.util.*;

public class PeakElement {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a [] = new int [n];
      for (int i = 0; i<n; i++) {
    	  a [i] = sc.nextInt();
      }
      int temp = a[0], result = 0;
      for (int i = 0; i<n; i++) {
    	  if (a[i] > temp) {
    		  temp = a[i];
    		  result = i;
    	  }
      }
      System.out.println(result);
		
	}

}
