package array;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 10 no.s");
	
	int [] numbers = new int [10];
	
	for ( int i = 0; i<10; i ++) {
	numbers [i] = sc.nextInt();
	
	System.out.println(numbers [i]);
	}
	
	}

}
