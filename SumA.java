package array1;

import java.util.Scanner;

public class SumA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array");
		
		int n = sc.nextInt();
		
		System.out.println("Enter digit of array");
		
		int a[] = new int [n];
		int result = 0 ;
		for (int i = 0; i <n; i++) {
			
		a [i] = sc.nextInt();
    	result = result + a[i];
	    	}
		System.out.println("The sum of the array is " + result);
	}

}
