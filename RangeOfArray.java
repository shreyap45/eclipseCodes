package array1;
import java.util.Arrays;
import java.util.Scanner;

public class RangeOfArray {

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
		int result = a[n-1] + a[0];
		System.out.println("The range of array is : " +result);
	}

}
