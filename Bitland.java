package maths;
import java.util.*;

public class Bitland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = 0;
		sc.nextLine();
		while (t-->0) {
		String str = sc.nextLine();
		if (str.charAt(0) == 'X') {
			if (str.charAt(1) == '+') {
				n=n+1;
			}
			else {
				n= n-1;
			}
		}
		else if (str.charAt(0) == '+') {
			n = n+1;
		}
		else {
			n = n-1;
		}
		
	}
		System.out.println(n);
		
	    }
}
