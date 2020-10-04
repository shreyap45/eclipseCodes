package array1;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegatives {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Input size of array :");
	int n = sc.nextInt();
	
	System.out.println("Input Array :");
	int a [] = new int [n];
	
	for (int i = 0; i<n ; i++) {
		a[i] = sc.nextInt();
	}
	Arrays.sort(a);
	for(int e : a) {
	System.out.print(e+ " ");
	}
	
	}
	
}
