package array1;

import java.util.Scanner;

public class Return {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a [] = new int [n];
			for (int i = 0; i <n; i++) {
				a[i] = sc.nextInt();
			}
			int result = 1;
			for (int i = 0 ;i<n; i++) {
				
					result = result *a[i];
			}
			
			for (int i = 0; i <n; i++) {
				a [i] = result / a[i];
			
			System.out.print(a[i]+ " ");
		}
			System.out.println();
		   }
	}

}
