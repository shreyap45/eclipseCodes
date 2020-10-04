package array1;
import java.util.Scanner;
public class RevArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array :");
		int n = sc.nextInt();
		
		System.out.println("Enter value of Array :");
		int a[] = new int [n];
		
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Reverse of Array is : ");
		
		for (int i = n - 1 ; i >= 0; i--) {
			System.out.print(a[i]+ " ");
		}
		
	}

}
