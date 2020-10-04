package Java;

import java.util.Scanner;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x= n/2;
		int v=x/2;
		
		
		for (int j = 1; j <= x; j ++)
		{	System.out.print("*");
		for(int i = 1; i<=n; i++) {
		System.out.print(" ");
		}
		System.out.print("*"); 
		System.out.println(); 
		}
			System.out.print("*");
		
		for(int j = 1; j<= x; j++){
			System.out.print(" ");
		}
		
		System.out.print("*");
		
		for(int j = 1; j<= x; j++){
			System.out.print(" ");
		}
		
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		
		for (int j = 1; j <= v; j++ ) {
			System.out.print(" ");
			}
		
		System.out.print("*");
		
		
		for (int j = 1; j <= x - 1; j++ ) {
		System.out.print(" ");
		}
		System.out.print("*");
	
		for (int j = 1; j <= v; j++ ) {
			System.out.print(" ");
			}
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		
		for(int j = 1; j <= n; j++) {
			System.out.print(" ");
		}
		System.out.print("*");
	}
}
