package Java;

import java.util.Scanner;

public class JavaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for (int i = 1; i<= n; i++){
			n=n/2;
		if	(n % 2 == 0) {
			System.out.println("the no. is power of 2");
		}
		else
		
		{
			System.out.println("no");
		}
		}
		
	}

}
