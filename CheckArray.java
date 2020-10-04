package array1;
import java.util.Scanner;

public class CheckArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input number");
		
		int n = sc.nextInt();
		
		System.out.println("Input size of an array");
		
		int m = sc.nextInt();
		
		int a[] = new int [m];

		boolean check = false;
		
		System.out.println("Input an array");
		
     for (int i = 0; i <m; i++) {
    	 a[i] = sc.nextInt();
         }
     
     for (int i = 0; i <m ; i ++) {
    	 
        if (a[i] == n) {
        	check = true;
        	break;
        }
     }
     if (check) {
    	 System.out.println("true");
     }
     else {
    	 System.out.println("false");
     }
       }
    }
