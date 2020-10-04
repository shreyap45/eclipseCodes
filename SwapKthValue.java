package array1;

import java.util.Scanner;

public class SwapKthValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter test cases : ");
		int t = sc.nextInt();
		
		for (int k = 1; k <= t; k++) {
		
		System.out.println("Input size of array :");
		int n = sc.nextInt();
		
		System.out.println("Input the Zth no. to swap : ");
		int z = sc.nextInt(); 
		
		System.out.println("Input Array :");
		int a [] = new int [n];
		
		for (int i = 0; i<n ; i++) {
			a[i] = sc.nextInt();
			}
		int temp = 0;
		
		for (int i = 0; i<n; i++) {
		    	temp = a[z-1];
		    	a[z-1] = a[n-z];
		    	a[n-z] = temp;
	     	}
		for(int item : a) {
			System.out.print(item + " ");
		}
	}
		System.out.println();
	}
}
