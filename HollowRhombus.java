package Java;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			for (int i = 1; i<=n-1; i++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			for(int i=2; i<=n-1;i++) {
			
				for(int j=1; j<=n-i ; j++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for(int k = 1; k<=n-2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			
			for (int i =1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
			}
				

	}
