package String;
import java.util.*;

public class RemoveOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s = sc.nextLine();
		
			for (int i = 0; i<s.length(); i++) {
			if (i % 2 != 0) {
				System.out.print(s.charAt(i));
				
			}
	}
		}
	}



}
