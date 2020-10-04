package Java;
import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {	
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int rev=0, temp=0, n = x;	
		 while(n>0) {
			 temp= n % 10;
			 rev = rev*10+ temp;
			 n= n/10;
		 }
		 if ( rev == x) {
			 System.out.println(x+ "is a Palindrome");
		 }
		 else {
			 System.out.println(x+" is not a Palindrome");
		 }
	}
}