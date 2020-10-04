package array1;
import java.util.*;
import java.util.Arrays;
public class MaxMin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
      System.out.println("Input size of an array");   
		int n = sc.nextInt();
		
		System.out.println("Input an array");
		 int a [] = new int [n];
		 
		 int MAX = 0;
		 int MIN = 0;
		
		for (int i = 0;i <n; i++) {
			a[i] = sc.nextInt();
		}
		
		   for (int i = 0; i < n-1; i++) {
				int minInd = i;
			   for(int j = i; j <n; j++) {
				   if (a[j] < a[minInd]) {
					   minInd = j;
				   }
			   }
			   int temp = a[i];
			   a[i] = a[minInd];
			   a[minInd] = temp;
			   
		   }
//		for (int e : a) {
//			System.out.print(e + " ");
//		}
		  MAX = a [n-1];
		  MIN = a [0];
		  
		System.out.println("MAX :" + MAX);
		System.out.println("MIN :" + MIN);
	}
}
