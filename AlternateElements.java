package array1;
import java.util.Scanner;

public class AlternateElements {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter test cases : ");
		int t = sc.nextInt();
		
		for (int k = 1; k <= t; k++) {
		
		System.out.println("Input size of array :");
		int n = sc.nextInt();
		
		System.out.println("Input Array :");
		int a [] = new int [n];
		
		for (int i = 0; i<n ; i++) {
			a[i] = sc.nextInt();
			} 
		
         for (int i = 0; i <n; i++) {
        	 
        	 if (i % 2 == 0) {
        		 
//        		 System.out.print(a[0]);
        		 System.out.print(a[i]+ " ");
        	 }
         }
         System.out.println();
	}

}
	}
