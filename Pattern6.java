package Java;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			for (int k = 1; k<= n-i; k++ ) {
				System.out.print(" ");
			}
			for (int j = 1; j<= 2*i-1 ; j++) {
				System.out.print(j);			
			}
			System.out.println();
		}
	}
}
