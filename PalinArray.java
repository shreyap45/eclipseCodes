package array1;

import java.util.Scanner;

public class PalinArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int check;
		
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
		
		int rev=0, temp=0;
		int b[] = a.clone();
		
		for (int i = 0; i<n; i++) {
			
		 while(b[i] > 0) {
			 temp= b[i] % 10;
			 rev = rev*10+ temp;
			 b[i] = b[i]/10;
		 }
		}
		
		 for (int i = 0; i< n; i++) {
	      if (rev == a[i]) {
	    	  System.out.println("1");
	      }
	      else
	    	  System.out.println("0");
		 }	
		System.out.println();
}
}
}
