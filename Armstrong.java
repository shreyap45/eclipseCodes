package Java;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int  result = 0;
		int count = 0, n = x, b = 0, a=x;
		
		while(n>0) {
			n= n/10;
			count++;
		}
		
		while(a!=0) {
			b = a%10;
			int c = 1;
		for (int i = 1; i<= count; i++) {
			c= c*b;
		}
        
		result= result +c;
		a=a/10;
		}
		
		if(x==result) {
			System.out.println(x+" is an armstrong");
		}
		else {
			System.out.println(x+ " is not an armstrong");
		}		
}
}
