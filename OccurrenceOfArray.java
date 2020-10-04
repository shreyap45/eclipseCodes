package array1;
import java.util.Scanner;

public class OccurrenceOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the no. :");
		int m = sc.nextInt();
		
		System.out.println("Inter the size of an Array :");
        int n = sc.nextInt();
         
        System.out.println("Enter value of Array :");
		 int  a [] = new int [n];
		 
		 for (int i = 0; i<m; i++) {
			 a[i] = sc.nextInt();
		 }
		 int count = 0;
		 
		 for (int i =0; i < m; i++) {
			 if (a [i] == m) {
				 count++;
			 }
		 }
		 System.out.println(count);
	}

}
