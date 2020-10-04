package array1;
import java.util.*;
public class SortArray012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You can only take input in 0, 1 and 2: ");
		
		System.out.println("Input size of array :");
		int n = sc.nextInt();
		
		System.out.println("Input Array :");
		int a [] = new int [n];
		
		for (int i = 0; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		

	}

}
