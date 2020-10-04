package array1;

import java.util.Scanner;

public class TestCases {
    public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt();
	
	for (int k = 1; k <= t; k++) {
	
	int n = sc.nextInt();
	
	int a [] = new int [n];
	
	for (int i = 0; i<n ; i++) {
		a[i] = sc.nextInt();}
	
	    System.out.println(a [0] + a[n-1] );
	

}
}
}