package Java;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			for (int k = 1; k<= i-1; k ++) {
				System.out.print(" ");
			}
			for (int j = 1; j<=n-i+1 ; j ++) {
				System.out.print("*");
			}
			System.out.println();
	}
	

	}

}
