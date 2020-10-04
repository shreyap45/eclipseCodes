package String;
import java.util.Scanner;

public class RangeLR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i<=t; i++) {
			String s = sc.next();
			int l = sc.nextInt();
			int r = sc.nextInt();
		
			System.out.println(s.substring(l,r+1));
	   }
	}


}
