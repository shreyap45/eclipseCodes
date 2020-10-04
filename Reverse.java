package String;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String str = sc.nextLine();
			
			char try1 [] = str.toCharArray();
			for(int i = try1.length - 1; i >=0; i--) {
				System.out.print(try1[i]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
