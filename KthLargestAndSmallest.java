package array1;
import java.util.*;
public class KthLargestAndSmallest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the Kth value :");
		int k = sc.nextInt();
		
		System.out.println("Input the size of Array :");
		int n = sc.nextInt();
		
		System.out.println("Input values of Array :");
		int a [] = new int [n];
		
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println("Largest : " +a[k-1]);
        System.out.println("Smallest : " + a[n-k]);
	}

}
