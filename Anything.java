package Java;
import java.util.*;
public class Anything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i = 1; i <= n; i++) {
		for (int j = 1; j<=n-i+1; j++) {
			System.out.print(j);
		}
		if (i>1)
			for (int j =1 ; j<=2*i - 3; j++) {
				System.out.print("*");
			}
		System.out.println();
		
	}
		
	}

}
