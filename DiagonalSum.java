package array1;
import java.util.*;
import static java.lang.Math.abs;
public class DiagonalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [][] = new int [n] [n];
		for (int i = 0; i<n; i++) { 
			for (int j = 0; j<n ; j++) {	
			a [i] [j] = sc.nextInt();
		}
			}
		int emp = 0;
		int temp = 0;
		 for (int i =0; i<n; i++ ) {
			 for (int j = 0; j<n; j++) {
				 if ((i + j) == (n - 1)) {
					temp = temp + a [i][j];
				 }
				if (i==j) {
					emp = emp + a[i] [j];
				}
			 }		 
		 }
			 System.out.println(Math.abs(emp-temp));	
	}
}