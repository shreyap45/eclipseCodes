package Java;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 !=0) {
			System.out.println("Weird");
		}
		else if ( n%2 == 0 && n > 2 && n < 5) {
			System.out.println("not weird");
		}
		else if (n%2 ==0 && n>6 && n < 20) {
			System.out.println("weird");
		}
	}

}
