package array1;
import java.util.Scanner;

public class ProductOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter test case : ");
		int k = sc.nextInt();
		int result = 1;
		
         for (int m = 1; m <= k; m++) {
        	 
    			System.out.println("Input size of array :");
    			int n = sc.nextInt();
    			
    			System.out.println("Input Array :");
    			int a [] = new int [n];
    			
    			for (int i = 0; i<n ; i++) {
    				a[i] = sc.nextInt();}
    			
    			for(int j = 0; j < n ; j++) {
    			  result = result * a[j];
    			}
         
    			System.out.println("Product of array is : " +result);
       }
         System.out.println();
	}
	     }
	         
	
